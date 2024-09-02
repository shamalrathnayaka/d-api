package com.coblendai.entity;

import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
  private Set<User> users;
}
