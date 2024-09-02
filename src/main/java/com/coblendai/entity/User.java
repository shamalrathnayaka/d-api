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

  // private String membershipStatus; // can be identified with associated roles
  // private Integer flagPass; // can be removed by changing the status
  // private Boolean isUConnect; // gonna be a role value
  // private Boolean isCompanyAdmin; // gonna be a role value
  // private Integer type; // not applicable I guess

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

  // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval =
  // true)
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles;
}
