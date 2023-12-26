package com.gllfl.kycapi.model;

import com.gllfl.kycapi.model.embedable.PanProfileDetailedClientData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanProfileDetailedResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String requestId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "result_id")
    private PanProfileDetailedResultEntity result;

    private String statusCode;
    private PanProfileDetailedClientData clientData;


}
