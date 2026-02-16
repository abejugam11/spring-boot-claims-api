package com.abhinaya.claimsapi.claim;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "claims")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotBlank
    private String policyId;

    @NotBlank
    private String claimType;

    @Min(1)
    private double claimAmount;

    @NotBlank
    @Column(length = 2000)
    private String description;

    private String status; // RECEIVED, APPROVED, REJECTED
}
