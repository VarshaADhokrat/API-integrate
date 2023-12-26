package com.gllfl.kycapi.model;

import com.gllfl.kycapi.model.embedable.PanLinkStatusAnyAadhaarClientData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanLinkStatusAnyAadhaarResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String requestId;
    private Integer statusCode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private PanLinkStatusAnyAadhaarResultEntity result;

    @Embedded
    private PanLinkStatusAnyAadhaarClientData clientData;
}
