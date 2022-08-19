package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document(collection = "patient")
public class PatientModel {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private Set<PatientTensionMesure> patientTensionMesures;
}
