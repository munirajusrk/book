package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CropProblemPartnerRequest {

    private long cropId;
    private String cropName;
    private long problemId;
    private String problemName;
    private List<PartnerModel> partners;
}
