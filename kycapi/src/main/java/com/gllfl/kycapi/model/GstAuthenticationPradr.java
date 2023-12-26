package com.gllfl.kycapi.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class GstAuthenticationPradr {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    @Lob
    private String adr;
    @Lob
    private String em;
    @Lob
    private String mb;
    @Lob
    private String ntr;
    @Lob
    private String addr;
    private String  lastUpdatedDate;


}
