package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.List;

@Data
@Document(collection = "conclusion_clinique")
public class ConclusionCliniqueModel {
    @Id
    private String id;
    private List<String> syndromes;
    private List<String>  symptomes;
    @Field(targetType = FieldType.OBJECT_ID)
    private String visiteId;
}
