package com.santeDigital.restApiCrud2.models;

import lombok.Data;

import java.util.List;

@Data
public class MotifObject {
    private String name;
    private List<String> localisations;
}
