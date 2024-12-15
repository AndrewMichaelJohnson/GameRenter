package com.gravie.gamerenter.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Image {
    @JsonProperty("original_url")
    private String originalURL;
}
