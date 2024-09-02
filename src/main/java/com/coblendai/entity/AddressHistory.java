package com.coblendai.entity;

import java.sql.Timestamp;

import com.coblendai.enums.AddressStatus;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address_history")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AddressHistory {
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
    @JoinColumn(name = "user_id")
    private User user;
}
