package com.soshinemedia.rest.web;

import com.soshinemedia.rest.DTO.OfferDTO;
import com.soshinemedia.rest.Service.OfferService;
import com.soshinemedia.rest.domain.Acceptance;
import com.soshinemedia.rest.domain.Offer;
import com.soshinemedia.rest.repository.AcceptanceRepository;
import com.soshinemedia.rest.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.modelmapper.ModelMapper;

import java.net.URI;
import java.text.ParseException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.ok;


@RestController
@RequestMapping("/v1/offers")
public class OfferController {

    private OfferService Offer;
    private AcceptanceRepository acceptances;
    private OfferRepository offers;

    public OfferController(OfferService offers) {
        this.Offer = offers;
    }

    @GetMapping("")
    public ResponseEntity<List<OfferDTO>> all(@RequestParam(name = "brand", required = false) String[] brands) {
        List<Offer> offers = this.Offer.findAll();
        return ok(offers.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList()));
    }


    @GetMapping("/{id}/acceptances")
    public ResponseEntity<List<Acceptance>> getAcceptances(@PathVariable("id") Long id, @RequestParam(name = "brand", required = false) String[] brands) {

            return ok(this.Offer.findAllAcceptances());

    }

    @SuppressWarnings("rawtypes")
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody Offer form) {

        Offer savedOffer = this.Offer.save(form);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedOffer.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/{id}")
    public OfferDTO get(@PathVariable("id") Long id) {
        //return this.Offer.findById(id);
        Optional<Offer> offer = Offer.findById(id);

        if (!offer.isPresent())
            throw new NotFoundException("id-" + id);

        return convertToDto(offer.get());
    }


    @SuppressWarnings("rawtypes")
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Offer form) {
        Optional<Offer> offerOptional = this.Offer.findById(id);

        if (!offerOptional.isPresent())
            return ResponseEntity.notFound().build();

        form.setId(id);
        this.Offer.save(form);
        return ResponseEntity.noContent().build();
    }

    @SuppressWarnings("rawtypes")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        //Offer existed = this.Offer.findById(id).orElseThrow(() -> new NotFoundException());
        this.Offer.delete(id);
        return noContent().build();
    }
    @Autowired
    private ModelMapper modelMapper;

    /*private <List<OfferDTO>>  entityDto(Offer post){

    }*/
    private OfferDTO convertToDto(Offer post) {
        OfferDTO postDto = modelMapper.map(post, OfferDTO.class);
        //postDto.setSubmissionDate(post.getSubmissionDate(),
                //userService.getCurrentUser().getPreference().getTimezone());
        return postDto;
    }
    private Offer convertToEntity(OfferDTO postDto) throws ParseException {
        Offer post = modelMapper.map(postDto, Offer.class);
        //post.setSubmissionDate(postDto.getSubmissionDateConverted(
                //userService.getCurrentUser().getPreference().getTimezone()));

        /*if (postDto.getId() != null) {
            Offer oldPost = postService.getPostById(postDto.getId());
            post.setRedditID(oldPost.getRedditID());
            post.setSent(oldPost.isSent());
        }*/
        return post;
    }


}