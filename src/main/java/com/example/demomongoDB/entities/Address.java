package com.example.demomongoDB.entities;

import lombok.Data;

@Data
public class Address {
    private String country;
    private String city;
    private String postCode;
}
