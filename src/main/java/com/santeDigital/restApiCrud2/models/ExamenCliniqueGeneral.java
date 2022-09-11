package com.santeDigital.restApiCrud2.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class ExamenCliniqueGeneral {
    private String conscience;
    private boolean pupilles_symetriques;
    private boolean pupilles_reactives;
    private String frequence_respiratoire;
    private String frequence_cardiaque;
    private String tension_arterielle;
    private String temperature;
    private String couleur_de_la_peau;
    private String couleur_des_conjonctives;
    private String aspect_des_membres_superieurs_et_inferieurs;
    private String autre_signes_particuliers;

}
