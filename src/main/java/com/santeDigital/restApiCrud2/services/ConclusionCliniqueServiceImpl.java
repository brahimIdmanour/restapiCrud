package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.ConclusionCliniqueModel;
import com.santeDigital.restApiCrud2.repository.ConclusionCliniqueRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class ConclusionCliniqueServiceImpl implements ConclusionCliniqueService{
    @Autowired
    private ConclusionCliniqueRepository conclusionCliniqueRepository;
    @Override
    public List<ConclusionCliniqueModel> findAll() {
        return conclusionCliniqueRepository.findAll();
    }

    @Override
    public Optional<ConclusionCliniqueModel> findById(String id) {
        return conclusionCliniqueRepository.findById(id);
    }

    @Override
    public Optional<ConclusionCliniqueModel> findByVisiteId(String visiteId) {
        return conclusionCliniqueRepository.findByvisiteId(visiteId);
    }

    @Override
    public ConclusionCliniqueModel save(ConclusionCliniqueModel conclusionCliniqueModel) {
        return conclusionCliniqueRepository.save(conclusionCliniqueModel);
    }

    @Override
    public ConclusionCliniqueModel update(ConclusionCliniqueModel conclusionCliniqueModel) {
        conclusionCliniqueRepository.findById(conclusionCliniqueModel.getId()).orElseThrow(()-> new IllegalArgumentException("aucun data"));
        return conclusionCliniqueRepository.save(conclusionCliniqueModel);
    }

    @Override
    public void delete(String id) {
        conclusionCliniqueRepository.deleteById(id);
    }
}
