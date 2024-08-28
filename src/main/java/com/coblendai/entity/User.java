package com.coblendai.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String userId;

  private String firstName;

  private String lastName;

  private String email;

  private String password;

  private String imageUrl;

  private String companyName;

  private String address;

  private String suburb;

  private String bio;

  private String state;

  private String postcode;

  private String bdm;

  private String bdmEmail;

  private String abn;

  private String mobileNumber;

  private String phoneNumber;

  private String ccEmail;

  private Double commision;

  private Integer type;

  private Integer status;

  private Integer flagPass;

  private Long loginTime;

  private Long modifiedTime;

  private Long createTime;

  private Long agreementTime;

  private Integer adminRole;

  private Integer adminStatus;

  private String firstNameBidx;

  private String lastNameBidx;

  private String emailBidx;

  private String mobileNumberBidx;

  private String tenant;

  private String bankaccountName;

  private String bankaccountBsb;

  private String bankaccountNumber;

  private String companyId;

  private Boolean isCompanyAdmin;

  private String billingDate;

  private Boolean isUConnect;

  private String membershipStatus;

  private String stripeCustomerId;

  private String stripeProductId;

  private String stripePriceId;

  private String stripeSubscriptionId;

  private String stripeConnectSubscriptionId;
}
