package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerRequest {

    private PartnerBasicModel partnerBasicModel;
    private PartnerContact partnerContact;
    private PartnerUrl partnerUrl;
    private List<PartnerAdmin> partnerAdmins;
    private List<PartnerContact> partnerContacts;
    private List<PartnerLocation> partnerLocations;
    private List<PartnerLanguage> partnerLanguages;
    private PartnerCrop partnerCrop;
    private PartnerBusiness partnerBusiness;
    private Status status;
}
