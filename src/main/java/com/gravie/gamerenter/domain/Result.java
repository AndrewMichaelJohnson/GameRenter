package com.gravie.gamerenter.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Result {
    private String aliases;
    private String deck;
    private String description;
    private String guid;
    private int id;
    private Image image;
    private String name;
    private List<Platform> platforms;
}