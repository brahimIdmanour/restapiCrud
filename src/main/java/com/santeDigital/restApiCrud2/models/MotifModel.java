package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.Set;

@Data
@Document(collection = "motif")
public class MotifModel {
    @Id
    private String id;
    private Set<MotifObject> motifs;
   /* @DBRef
    private VisiteModel visiteId;*/

    @Field(targetType = FieldType.OBJECT_ID)
    private String visiteId;
}
