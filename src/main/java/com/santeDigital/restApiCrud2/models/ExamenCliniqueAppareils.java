package com.santeDigital.restApiCrud2.models;

import lombok.Data;

@Data
public class ExamenCliniqueAppareils {
    private String examen_neurologique;
    private String examen_cardiaque;
    private String examen_respiratoire;
    private String examen_abdominale;
    private String autre_examens_specifiques;
}
