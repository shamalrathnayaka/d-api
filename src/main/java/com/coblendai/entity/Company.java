package com.coblendai.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uniqueId;
    private String name;
    private String description;
    private String features;
    private String logoUrl;
    private String colour;
    private String profilePictureUrl;
    private String rla;
    private String email;
    private String phone;
    private LocalDate billingDate;

    @OneToOne(mappedBy = "company")
    private StripeCustomer stripeCustomer;

    @OneToMany(mappedBy = "company")
    private Set<AddressHistory> addresses;

    @OneToMany(mappedBy = "company")
    private Set<ContactHistory> contacts;

    @OneToMany(mappedBy = "company")
    private Set<CompanySocial> socials;

    @OneToMany(mappedBy = "company")
    private Set<CoordinateHistory> coordinates;

    @OneToMany(mappedBy = "company")
    private Set<User> users;

    // private String website;
    // private String facebook;
    // private String instagram;
    // private String twitter;
    // private String linkedin;
    // private String youtube;
    // private String tiktok;

    private Timestamp modifiedOn;
    private Timestamp createdOn;
}
