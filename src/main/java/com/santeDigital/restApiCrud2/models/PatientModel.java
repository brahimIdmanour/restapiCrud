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
    private String sexe;
    private String dateNaiss;
    private String telephone;
    private String situationFamiliale;
    private String origine;
    private String residence;
    private String niveauSocioEconimique;
    private String couvertureMedical;

}
