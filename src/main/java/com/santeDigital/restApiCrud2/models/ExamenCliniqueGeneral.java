package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class ExamenCliniqueGeneral {
    private String CONSCIENCE;
    private boolean PupSym;
    private boolean PupRea;
    private String FrerRes;
    private String FreCar;
    private String TensArte;
    private String tem;
    private String ColoRPea;
    private String ColoeConj;
    private String AspDesMemInSUp;
    private String AuterSin;

}
