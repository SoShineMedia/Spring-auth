package com.soshinemedia.auth.web;

import com.soshinemedia.auth.domain.Case;
import com.soshinemedia.auth.domain.Firm;
import com.soshinemedia.auth.repository.CaseRepository;
import com.soshinemedia.auth.repository.FirmRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/v1/cases")
public class CaseController {

    private CaseRepository cases;

    public CaseController(CaseRepository cases) {
        this.cases = cases;
    }

    @GetMapping("")
    public ResponseEntity<List<Case>> all(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @GetMapping("/{id}/bills/invoices")
    public ResponseEntity<List<Case>> getInvoices(@RequestParam(name = "from", required = false) Date from, @RequestParam(name = "to", required = false) Date to, @PathVariable(value = "id", required = true) String id) {
        if (from == null ) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @PostMapping("/{id}/bills/invoices")
    public ResponseEntity<List<Case>> saveInvoices(@RequestParam(name = "from", required = false) Date from, @RequestParam(name = "to", required = false) Date to, @PathVariable(value = "id", required = true) String id) {
        if (from == null ) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @PutMapping("/{id}/bills/invoices")
    public ResponseEntity<List<Case>> updateInvoices(@RequestParam(name = "from", required = false) Date from, @RequestParam(name = "to", required = false) Date to, @PathVariable(value = "id", required = true) String id) {
        if (from == null ) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @GetMapping("/{id}/bills/payments")
    public ResponseEntity<List<Case>> getPayments(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @PostMapping("/{id}/bills/payments")
    public ResponseEntity<List<Case>> savePayments(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @PutMapping("/{id}/bills/payments")
    public ResponseEntity<List<Case>> updatePayments(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @GetMapping("/{id}/documents")
    public ResponseEntity<List<Case>> getDocuments(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @PostMapping("/{id}/documents")
    public ResponseEntity<List<Case>> saveDocuments(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @PutMapping("/{id}/documents")
    public ResponseEntity<List<Case>> updateDocuments(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @GetMapping("/{id}/reports")
    public ResponseEntity<List<Case>> getReports(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @PostMapping("/{id}/reports")
    public ResponseEntity<List<Case>> saveReports(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @PutMapping("/{id}/reports")
    public ResponseEntity<List<Case>> updateReports(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @GetMapping("/{id}/events")
            public ResponseEntity<List<Case>> getEvents(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @PostMapping("/{id}/events")
    public ResponseEntity<List<Case>> saveEvents(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
    @PutMapping("/{id}/events")
    public ResponseEntity<List<Case>> updateEvents(@RequestParam(name = "brand", required = false) String[] brands) {
        if (brands == null || brands.length == 0) {
            return ok(this.cases.findAll());
        } else {

            return ok(this.cases.findAll());
        }
    }
}