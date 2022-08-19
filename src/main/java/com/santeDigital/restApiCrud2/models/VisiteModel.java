package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document(collection = "visite")
public class VisiteModel {
    @Id
    private String id;
    private String date;
    private String cause;
    private String service;
    private String etat;
    private Set<VisiteMaladies> maladies;
}
