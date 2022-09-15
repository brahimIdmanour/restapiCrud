package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document(collection = "motif")
public class MotifModel {
    @Id
    private String id;
    private Set<MotifObject> motif;
    @DBRef
    private VisiteModel visiteRef;
}
