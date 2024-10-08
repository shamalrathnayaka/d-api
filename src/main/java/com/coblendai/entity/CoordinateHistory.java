package com.coblendai.entity;

import com.coblendai.enums.AddressStatus;
import com.coblendai.enums.Status;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "coordinate_history")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CoordinateHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String longitude;
    private String latitude;
    private Status status;
    private Timestamp createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
