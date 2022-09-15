package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "conclusion_clinique")
public class ConclusionCliniqueModel {
    @Id
    private String id;
    private List<String> syndromes;
    private List<String>  symptomes;
    @DBRef
    private VisiteModel visiteRef;
}
