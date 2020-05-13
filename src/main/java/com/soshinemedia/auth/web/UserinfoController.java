package com.soshinemedia.auth.web;

import com.soshinemedia.auth.domain.Case;
import com.soshinemedia.auth.domain.Firm;
import com.soshinemedia.auth.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.ResponseEntity.ok;

@RestController()
@RequestMapping("/v1/users")
public class UserinfoController {

    private List<Case> cases;

    @SuppressWarnings("rawtypes")
    @GetMapping("/me")
    public ResponseEntity currentUser(@AuthenticationPrincipal UserDetails userDetails){
        Map<Object, Object> model = new HashMap<>();
        model.put("username", userDetails.getUsername());
        model.put("roles", userDetails.getAuthorities()
                .stream()
                .map(a -> ((GrantedAuthority) a).getAuthority())
                .collect(toList())
        );
        return ok(model);
    }

	@GetMapping("/{id}")
    public ResponseEntity getUser(@AuthenticationPrincipal UserDetails userDetails){
        Map<Object, Object> model = new HashMap<>();
        model.put("username", userDetails.getUsername());
        model.put("roles", userDetails.getAuthorities()
            .stream()
            .map(a -> ((GrantedAuthority) a).getAuthority())
            .collect(toList())
        );
        return ok(model);
    }


    @GetMapping("/{id}/casess")
    public ResponseEntity getCases(@AuthenticationPrincipal UserDetails userDetails,@RequestParam(name = "brand", required = false) String[] brands) {
        Map<Object, Object> model = new HashMap<>();
        model.put("username", userDetails.getUsername());
        model.put("roles", userDetails.getAuthorities()
                .stream()
                .map(a -> ((GrantedAuthority) a).getAuthority())
                .collect(toList())
        );

        if (brands == null || brands.length == 0) {
            return ok(model);
        } else {

            return ok(model);
        }
    }
    @PostMapping("/{id}/casess")
    public ResponseEntity saveCases(@AuthenticationPrincipal UserDetails userDetails,@RequestParam(name = "brand", required = false) String[] brands) {
        Map<Object, Object> model = new HashMap<>();
        model.put("username", userDetails.getUsername());
        model.put("roles", userDetails.getAuthorities()
                .stream()
                .map(a -> ((GrantedAuthority) a).getAuthority())
                .collect(toList())
        );

        if (brands == null || brands.length == 0) {
            return ok(model);
        } else {

            return ok(model);
        }
    }
    @PutMapping("/{id}/casess")
    public ResponseEntity updateCases(@AuthenticationPrincipal UserDetails userDetails,@RequestParam(name = "brand", required = false) String[] brands) {
        Map<Object, Object> model = new HashMap<>();
        model.put("username", userDetails.getUsername());
        model.put("roles", userDetails.getAuthorities()
                .stream()
                .map(a -> ((GrantedAuthority) a).getAuthority())
                .collect(toList())
        );

        if (brands == null || brands.length == 0) {
            return ok(model);
        } else {

            return ok(model);
        }
    }
    @GetMapping("/{id}/schedules")
    public ResponseEntity getSchedules(@AuthenticationPrincipal UserDetails userDetails, @RequestParam(name = "brand", required = false) String[] brands) {
        Map<Object, Object> model = new HashMap<>();
        model.put("username", userDetails.getUsername());
        model.put("roles", userDetails.getAuthorities()
                .stream()
                .map(a -> ((GrantedAuthority) a).getAuthority())
                .collect(toList())
        );

        if (brands == null || brands.length == 0) {
            return ok(model);
        } else {

            return ok(model);
        }
    }
    @PostMapping("/{id}/schedules")
    public ResponseEntity Saveschedules(@AuthenticationPrincipal UserDetails userDetails, @RequestParam(name = "brand", required = false) String[] brands) {
        Map<Object, Object> model = new HashMap<>();
        model.put("username", userDetails.getUsername());
        model.put("roles", userDetails.getAuthorities()
                .stream()
                .map(a -> ((GrantedAuthority) a).getAuthority())
                .collect(toList())
        );

        if (brands == null || brands.length == 0) {
            return ok(model);
        } else {

            return ok(model);
        }
    }
    @PutMapping("/{id}/schedules")
    public ResponseEntity updateSchedules(@AuthenticationPrincipal UserDetails userDetails, @RequestParam(name = "brand", required = false) String[] brands) {
        Map<Object, Object> model = new HashMap<>();
        model.put("username", userDetails.getUsername());
        model.put("roles", userDetails.getAuthorities()
                .stream()
                .map(a -> ((GrantedAuthority) a).getAuthority())
                .collect(toList())
        );

        if (brands == null || brands.length == 0) {
            return ok(model);
        } else {

            return ok(model);
        }
    }

}
