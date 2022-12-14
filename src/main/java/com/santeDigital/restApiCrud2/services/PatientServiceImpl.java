package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.PatientModel;
import com.santeDigital.restApiCrud2.repository.PatientRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<PatientModel> findAll() {
        return patientRepository.findAll();
    }

    @Override
    public Optional<PatientModel> findById(String id) {
        return patientRepository.findById(id);
    }

    @Override
    public PatientModel save(PatientModel patientModel) {
        // validate(patientModel);
        return patientRepository.save(patientModel);
    }

    /*
     * private void validate(PatientModel patientModel) {
     * if (patientModel.getNom() == null || patientModel.getCIN().isEmpty()){
     * throw new IllegalArgumentException("remplir tout les champ");
     * }
     * }
     */

    @Override
    public PatientModel update(PatientModel patientModel) {
        patientRepository.findById(patientModel.get_id())
                .orElseThrow(() -> new IllegalArgumentException("aucun patient trouve"));
        // validate(patientModel);
        return patientRepository.save(patientModel);
    }

    @Override
    public void delete(String id) {
        patientRepository.deleteById(id);
    }
}
