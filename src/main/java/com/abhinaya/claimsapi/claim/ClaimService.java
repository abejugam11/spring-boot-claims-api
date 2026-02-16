package com.abhinaya.claimsapi.claim;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClaimService {

    private final ClaimRepository repo;

    public Claim create(Claim claim) {
        claim.setStatus("RECEIVED");
        return repo.save(claim);
    }

    public List<Claim> findAll() {
        return repo.findAll();
    }

    public Claim findById(String id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Claim not found: " + id));
    }
}
