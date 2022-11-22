package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CropProblem {

    private long cropId;
    private String cropName;
    private long problemId;
    private String problemName;
}
