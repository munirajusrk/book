package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputSellerSearchFilter {
    private String phone;
    private StateModel stateModel;
    private DistrictModel districtModel;
}
