package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerBusiness {

    private int noOfExpertContentLicenses;
    private int cropSubscriptionCharges;
    private double inputLeadCharges;
    private double inputRequestForwardingCharges;
    private BigDecimal advisoryDownloadRevSharePercentage;
    private AdvisoryHandlingType advisoryHandlingType;
    private ContentManager contentManager;

}
