package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerCrop {

    private List<CropCycle> cropCycles;
    private List<CropHealth> cropHealths;
}
