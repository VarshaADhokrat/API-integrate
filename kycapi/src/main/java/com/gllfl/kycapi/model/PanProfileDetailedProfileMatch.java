package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class PanProfileDetailedProfileMatch {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
     private String parameter;
    private String matchScore;
    private boolean matchResult;

}
