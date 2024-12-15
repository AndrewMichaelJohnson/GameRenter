package com.gravie.gamerenter.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Result implements Serializable {
    private String aliases;
    private String deck;
    private String description;
    private String guid;
    private int id;
    private Image image;
    private String name;
    private List<Platform> platforms;
}