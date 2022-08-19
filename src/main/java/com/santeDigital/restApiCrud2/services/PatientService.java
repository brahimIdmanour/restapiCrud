package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.PatientModel;

import java.util.List;

public interface PatientService {

    List<PatientModel> findAll();

    PatientModel save(PatientModel patientModel);

    PatientModel update(PatientModel patientModel);

    void delete(String id);
}
