package com.gllfl.kycapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanStatusCheckVerificationRequest {
    private String pan;
    private String name;
    private String dob;
    private String consent;
    private PanStatusCheckClientData clientData;


}
