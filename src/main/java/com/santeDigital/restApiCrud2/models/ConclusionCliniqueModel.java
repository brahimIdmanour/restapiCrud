package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "conclusion_clinique")
public class ConclusionCliniqueModel {
    @Id
    private String id;
    private String syndromes;
    private String symptomes;
}
