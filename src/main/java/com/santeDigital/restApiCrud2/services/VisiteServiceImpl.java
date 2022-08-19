package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.VisiteModel;
import com.santeDigital.restApiCrud2.repository.VisiteRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class VisiteServiceImpl implements VisiteService{
    @Autowired
    private VisiteRepository visiteRepository;
    @Override
    public List<VisiteModel> findAll() {
        return visiteRepository.findAll();
    }

    @Override
    public VisiteModel save(VisiteModel visiteModel) {
        return visiteRepository.save(visiteModel);
    }

    @Override
    public VisiteModel update(VisiteModel visiteModel) {
        visiteRepository.findById(visiteModel.getId()).orElseThrow(()-> new IllegalArgumentException("aucun visite"));
        return visiteRepository.save(visiteModel);
    }

    @Override
    public void delete(String id) {
        visiteRepository.deleteById(id);
    }
}
