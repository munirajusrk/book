package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FarmPunditRequest {

    private long farmPunditId;
    private String name;
    private String email;
    private String phone;
    private long joiningDate;
    private EducationModel education;
    private ExperienceModel experience;
    private StateModel state;
    private FarmingMethodType farmingMethodType;
    private CultivationType cultivationType;
    private DomainModel domain;
    private CropGroupModel cropGroup;
    private LanguageModel language;
    private EmploymentModel employment;
    private Status status;

}
