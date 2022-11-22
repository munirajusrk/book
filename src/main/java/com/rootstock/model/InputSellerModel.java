package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputSellerModel {

    private long inputSellerId;
    private String name;
    private String phone;
    private StateModel stateModel;
    private DistrictModel districtModel;
    private boolean inputSeller;
    private InputType inputType;
    private String shopName;
    private String address;
    private double lat;
    private double lang;
}
