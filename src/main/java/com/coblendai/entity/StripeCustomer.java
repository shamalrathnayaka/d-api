package com.coblendai.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "stripe_customer")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class StripeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerId;
    private String productId;
    private String priceId;
    private String subscriptionId;
    private String connectSubscriptionId;
    private Timestamp createdDate;

    @OneToOne(fetch = FetchType.LAZY)
    private Company company;
}
