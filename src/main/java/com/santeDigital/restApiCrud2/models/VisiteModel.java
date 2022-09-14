package com.santeDigital.restApiCrud2.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.Date;
import java.util.Set;

@Data
@Document(collection = "visite")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class VisiteModel {
    @Id
    private String id;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date createdAt = new Date();
    private String service;
    private String etat;
    private Set<VisiteMaladies> maladies;
    @Field(targetType = FieldType.OBJECT_ID)
    private String patientId;

}
