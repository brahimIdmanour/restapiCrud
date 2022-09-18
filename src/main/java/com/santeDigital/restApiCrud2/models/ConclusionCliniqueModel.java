package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.List;

@Data
@Document(collection = "conclusion_clinique")
public class ConclusionCliniqueModel {
    @Id
    private String id;
    private List<String> SymptomesListe;
    private List<String>  SyndromesListe;

    @Field(targetType = FieldType.OBJECT_ID)
    @Indexed(unique = true)
    private String visiteId;
}
