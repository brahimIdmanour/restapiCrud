package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.PatientModel;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    List<PatientModel> findAll();

    Optional<PatientModel> findById(String id);

    PatientModel save(PatientModel patientModel);

    PatientModel update(PatientModel patientModel);

    void delete(String id);
}
