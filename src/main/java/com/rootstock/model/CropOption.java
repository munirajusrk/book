package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CropOption {

    private long cropId;
    private String cropName;
    private long optionId;
    private String option;
}
