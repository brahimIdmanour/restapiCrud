package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class ExamenCliniqueGeneral {
    private String Conscience;
    private boolean PupSym;
    private boolean PupRea;
    private String FreqRes;
    private String FreqCar;
    private String TensArte;
    private String Tem;
    private String ColorPeau;
    private String ColorConj;
    private String AspMemInfSup;
    private String AutreSignes;

}
