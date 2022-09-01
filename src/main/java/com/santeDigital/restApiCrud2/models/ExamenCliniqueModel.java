package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document(collection = "examen_clinique")
public class ExamenCliniqueModel {
    @Id
    private String id;
    private Set<ExamenCliniqueGeneral> examenCliniqueGenerals;
    private Set<ExamenCliniqueAppareils> examenCliniqueAppareils;
}
