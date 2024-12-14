package com.gravie.gamerenter.domain;

import lombok.Data;

@Data
public class SingleGameResponse {
    private String error;
    private int limit;
    private int offset;
    private int numberOfPageResults;
    private int numberOfTotalResults;
    private int statusCode;
    private Result results;
}