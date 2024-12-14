package com.gravie.gamerenter.domain;

import lombok.Data;

import java.util.List;

@Data
public class SearchGameResult {
    private String error;
    private int limit;
    private int offset;
    private int numberOfPageResults;
    private int numberOfTotalResults;
    private int statusCode;
    private List<Result> results;
}
