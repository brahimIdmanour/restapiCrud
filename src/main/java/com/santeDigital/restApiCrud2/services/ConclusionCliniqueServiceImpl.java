package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.ConclusionCliniqueModel;
import com.santeDigital.restApiCrud2.repository.ConclusionCliniqueRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
