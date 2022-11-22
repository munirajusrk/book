package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CropPackageConfiguration {

    private CropModel cropModel;
    private CropCharacter cropCharacter;
    private CropOption cropOption;
    private StateModel stateModel;
    private DistrictModel districtModel;

}
