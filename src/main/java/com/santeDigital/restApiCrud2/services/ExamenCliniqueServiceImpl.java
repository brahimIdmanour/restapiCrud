package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.ExamenCliniqueModel;
import com.santeDigital.restApiCrud2.repository.ExamenClinqueRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class ExamenCliniqueServiceImpl implements ExamenCliniqueService{
    @Autowired
    private ExamenClinqueRepository examenClinqueRepository;
    @Override
    public List<ExamenCliniqueModel> findAll() {
        return examenClinqueRepository.findAll();
    }

    @Override
    public ExamenCliniqueModel save(ExamenCliniqueModel examenCliniqueModel) {
        return examenClinqueRepository.save(examenCliniqueModel);
    }

    @Override
    public ExamenCliniqueModel update(ExamenCliniqueModel examenCliniqueModel) {
        examenClinqueRepository.findById(examenCliniqueModel.getId()).orElseThrow(()-> new IllegalArgumentException("aucun data"));
        return examenClinqueRepository.save(examenCliniqueModel);
    }

    @Override
    public void delete(String id) {
        examenClinqueRepository.deleteById(id);
    }
}
