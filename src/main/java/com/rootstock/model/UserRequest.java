package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private long userId;
    private long partnerId;
    private String username;
    private String email;
    private String phone;
    private List<RoleType> roles;
    private StateModel stateModel;
    private DistrictModel districtModel;

    private int noOfContentManagerLicenses;
    private int noOfActiveContentManagers;
    private int noOfInActiveContentManagers;
    private String contentManagerDesignation;
    private List<String> cropsWithEditRight;

    private int noOfSubscriptionAssist;
    private int noOfInputHandled;
    private int noOfPartnerAppSupported;

    private Status status;
}
