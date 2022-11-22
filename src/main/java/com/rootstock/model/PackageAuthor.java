package com.rootstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PackageAuthor {

    private long authorId;
    private String authorName;
    private String designation;
    private String description;

}
