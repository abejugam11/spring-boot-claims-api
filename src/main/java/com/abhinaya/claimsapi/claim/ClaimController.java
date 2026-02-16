package com.abhinaya.claimsapi.claim;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/claims")
@RequiredArgsConstructor
public class ClaimController {

    private final ClaimService service;

    @PostMapping
    public Claim create(@Valid @RequestBody Claim claim) {
        return service.create(claim);
    }

    @GetMapping
    public List<Claim> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Claim getById(@PathVariable String id) {
        return service.findById(id);
    }
}
