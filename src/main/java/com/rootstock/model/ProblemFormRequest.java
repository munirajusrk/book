package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProblemFormRequest {
    private long partnerId;
    private long cropId;
    private long problemId;
    private long problemFormId;
    private String problemFormName;
    private int daysFromProblemDetected;
    private int daysToProblemDetected;
}
