package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.ExamenCliniqueModel;
import com.santeDigital.restApiCrud2.repository.ExamenClinqueRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class ExamenCliniqueServiceImpl implements ExamenCliniqueService {
    @Autowired
    private ExamenClinqueRepository examenClinqueRepository;

    @Override
    public List<ExamenCliniqueModel> findAll() {
        return examenClinqueRepository.findAll();
    }

    @Override
    public Optional<ExamenCliniqueModel> findById(String id) {
        return examenClinqueRepository.findById(id);
    }

    @Override
    public Optional<ExamenCliniqueModel> findByVisiteId(String visiteId) {
        return examenClinqueRepository.findByvisiteId(visiteId);
    }

    @Override
    public ExamenCliniqueModel save(ExamenCliniqueModel examenCliniqueModel) {
        return examenClinqueRepository.save(examenCliniqueModel);
    }

    @Override
    public ExamenCliniqueModel update(ExamenCliniqueModel examenCliniqueModel) {
        examenClinqueRepository.findById(examenCliniqueModel.getId())
                .orElseThrow(() -> new IllegalArgumentException("couldn't find examen clinique using provided ID"));
        return examenClinqueRepository.save(examenCliniqueModel);
    }

    @Override
    public void delete(String id) {
        examenClinqueRepository.deleteById(id);
    }
}
