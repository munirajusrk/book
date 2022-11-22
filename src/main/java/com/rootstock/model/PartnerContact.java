package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerContact {

    private String name;
    private String designation;
    private String email;
    private String phone;
    private RoleType roleType;

}
