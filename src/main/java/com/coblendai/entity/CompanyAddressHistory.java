package com.coblendai.entity;

import com.coblendai.enums.AddressStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "company_address_history")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CompanyAddressHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String suburb;
    private String postcode;
    private String state;
    private AddressStatus status;
    private Timestamp createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;
}
