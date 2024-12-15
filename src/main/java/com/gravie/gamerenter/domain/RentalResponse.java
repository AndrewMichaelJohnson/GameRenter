package com.gravie.gamerenter.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class RentalResponse implements Serializable {
    private boolean success;
    private String message;
    private Date dueDate;
    private List<Result> games;
}
