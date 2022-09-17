package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document(collection = "Patient")
public class PatientModel {
    @Id
    private String _id;
    private String CIN;
    private String Nom;
    private String Sexe;
    private String Phone;
    private String Situation;
    private String Residence;
    private String Profession;
    private String Nv_Socioeconomique;
    private String Couverture_medicale;

}
