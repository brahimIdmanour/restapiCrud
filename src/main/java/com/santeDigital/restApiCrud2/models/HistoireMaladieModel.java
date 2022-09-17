package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.List;

@Data
@Document(collection = "histoire_maladie")
public class HistoireMaladieModel {
    @Id
    private String id;
    private String debut_maladie;
    private String period_maladie;
    private String mode_installation;
    private String facteur_declenchant;
    private String occupation_lors_des_troubles;
    private boolean apyrexie;
    private String etat_general;
    private List<String> altereOptions;
   /* @DBRef
    private VisiteModel visiteRef;*/
   @Field(targetType = FieldType.OBJECT_ID)
   private String visiteId;
}
