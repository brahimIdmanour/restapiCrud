package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "prise_en_charge")
public class PriseEnChargeModel {
    @Id
    private String id;
    private String prise_en_charge;
    @DBRef
    private VisiteModel visiteRef;
}
