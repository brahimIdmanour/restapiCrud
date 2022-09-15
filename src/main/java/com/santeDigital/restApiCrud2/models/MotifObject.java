package com.santeDigital.restApiCrud2.models;

import lombok.Data;

import java.util.List;

@Data
public class MotifObject {
    private String nom;
    private List<String> localisations;
}
