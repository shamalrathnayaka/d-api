package com.coblendai.entity;

import java.sql.Timestamp;
import java.util.Set;

import com.coblendai.enums.Status;

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
  private String profileImageUrl;
  private String bio;
  private String abn;
  private String ccEmail;
  private Double commission;
  private Status status;
  private Timestamp modifiedOn;
  private Timestamp createdOn;
  private Timestamp agreedOn;

  private Boolean isCompanyAdmin;
  private Integer flagPass;
  private Boolean isUConnect;
  private String membershipStatus;

  private Integer type;

  @ManyToOne
  @JoinColumn(name = "company_id")
  private Company company;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AddressHistory> addresses;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<EmailHistory> emails;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<PasswordHistory> passwords;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<LoginHistory> logins;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<ContactHistory> contacts;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<BankAccount> bankAccounts;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Role> roles;
}
