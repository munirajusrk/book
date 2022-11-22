package com.rootstock.model;

public enum RoleType {
    CONTENT_MANAGER("CONTENT_MANAGER", "", UserType.TENE_USER),
    BUSINESS_MANAGER("BUSINESS_MANAGER", "", UserType.TENE_USER),
    FINANCE_MANAGER("FINANCE_MANAGER", "", UserType.TENE_USER),
    ROOTSTOCK_ADMIN("ROOTSTOCK_ADMIN", "", UserType.TENE_USER),

    PRIMARY_PARTNER_CONTACT("PRIMARY_PARTNER_CONTACT", "", UserType.PARTNER_USER),
    PARTNER_ADMIN("PARTNER_ADMIN", "", UserType.PARTNER_USER),
    CONTENT_EXPERT("CONTENT_EXPERT", "", UserType.PARTNER_USER),
    MARKETING_USER("MARKETING_USER", "", UserType.PARTNER_USER),
    REPORT_USER("REPORT_USER", "", UserType.PARTNER_USER),

    PRIMARY_EXPERT("PRIMARY_EXPERT", "", UserType.PLATFORM_USER),
    PANEL_EXPERT("PANEL_EXPERT", "", UserType.PLATFORM_USER),
    INPUT_SELLER("INPUT_SELLER", "", UserType.PLATFORM_USER),
    FACILITATOR("FACILITATOR", "", UserType.PLATFORM_USER),
    FARM_PUNDIT("FARM_PUNDITS", "", UserType.PLATFORM_USER);

    private String roleType;
    private String description;
    private UserType userType;

    /**
     *
     * use show Flag to list roles while configuring user from Tene, Partner etc...
     *
     */

    RoleType(String roleType, String description, UserType userType) {
        this.roleType = roleType;
        this.description = description;
        this.userType = userType;
    }

    public String getRoleType() {
        return roleType;
    }

    public String getDescription() {
        return description;
    }

    public UserType getUserType() {
        return userType;
    }
}
