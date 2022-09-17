package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document(collection = "Patient")
public class PatientModel {
    @Id
    private String id;
    private String CIN;
    private String Nom;
    private String Sex;
    private String Télé;
    private String Situation;
    private String Résidence;
    private String Profession;
    private String Nv_Socioéconomique;
    private String Coverture_médicale;

}
