package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeedDataRequest {

    private long seedDataId;
    private PartnerModel partnerModel;
    private CropModel cropModel;
    private String varietyName;
    private String description;
    private CropCharacter cropCharacter;
    private CropOption cropOption;
    private StateModel stateModel;
    private DistrictModel districtModel;
    private List<PartnerModel> partnerModels;
    private List<ImageModel> imageModels;
    private Status status;
}
