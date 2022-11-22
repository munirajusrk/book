package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CropCharacter {

    private long cropId;
    private String cropName;
    private long characterId;
    private String character;
}
