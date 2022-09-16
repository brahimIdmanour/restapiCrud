package com.santeDigital.restApiCrud2.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "visite")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class VisiteModel {
    @Id
    private String id;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date Date = new Date();
    private String Services;
    private String Status;
    @DBRef
    private PatientModel Patient_id;


}
