package com.gravie.gamerenter.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Game implements Serializable {

    private String description;

    private long id;

    private String name;
}
