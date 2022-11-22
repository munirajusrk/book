package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerBasicModel {

    private String fullName;
    private String shortName;
    private List<PartnerType> partnerTypes;
    private String address;
    private StateModel stateModel;
    private DistrictModel districtModel;
    private String city;
    private String pinCode;
    private String phone;
    private String logoUrl;
    
}
