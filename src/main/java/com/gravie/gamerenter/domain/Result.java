package com.gravie.gamerenter.domain;

import lombok.Data;

@Data
public class Result {
    private String aliases;
    private String apiDetailUrl;
    private String dateAdded;
    private String dateLastUpdated;
    private String deck;
    private String description;
    private String firstAppearedInFranchise;
    //private FirstAppearedInGame firstAppearedInGame;
    private String guid;
    private int id;
    //private Image image;
    //private List<ImageTag> imageTags;
    private String name;
    private String siteDetailUrl;
    private String resourceType;
    //private List<Platform> platforms;

    // Getters and Setters
}