package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContentManager {

    private long userId;
    private String name;
    private RoleType roleType = RoleType.CONTENT_MANAGER;

}
