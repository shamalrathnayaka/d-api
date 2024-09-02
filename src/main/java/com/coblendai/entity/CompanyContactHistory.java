package com.coblendai.entity;

import com.coblendai.enums.ContactType;
import com.coblendai.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "company_contact_history")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CompanyContactHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contactNUmber;
    private ContactType contactType;
    private Status status;
    private Timestamp createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;
}
