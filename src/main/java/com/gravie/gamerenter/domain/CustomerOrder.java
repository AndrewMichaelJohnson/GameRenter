package com.gravie.gamerenter.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CustomerOrder implements Serializable {
    private String firstName;
    private String lastName;
    private String address;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String creditCardNumber;

    private List<Result> games;
}
