package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PackageRequest {

    private long partnerId;
    private long cropId;
    private long packageId;
    private String packageName;
    private PackageType packageType;
    private int cropDuration;
    private List<CropPackageConfiguration> cropPackageConfigurations;
    private PackageAuthor packageAuthor;
    private Status status;
}
