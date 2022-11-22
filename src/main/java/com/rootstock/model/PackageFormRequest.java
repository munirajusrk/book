package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PackageFormRequest {

    private long partnerId;
    private long cropId;
    private long packageId;
    private long packageFormId;
    private PackageType packageType;

    /**
     *
     * Annual Package Type
     *
     */
    private int startDays;
    private DayStartType startDaysType;
    private int endDays;
    private DayStartType endDaysType;

    /**
     *
     * Perinnial Package Type
     *
     * Farmer will get this form for 1 year from the date farmer starts
     *
     */

    private long startDate;
    private long endDate;

    private Status status;
}
