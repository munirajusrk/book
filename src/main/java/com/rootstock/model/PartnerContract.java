package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerContract {

    private long firstContractDate;
    private long lastContractDate;
    private String contractPath;
    private boolean active;

}
