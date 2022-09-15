package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.MotifModel;
import com.santeDigital.restApiCrud2.repository.MotifRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class MotifServeiceImpl implements MotifService{
    @Autowired
    private MotifRepository motifRepository;
    @Override
    public List<MotifModel> findAll() {
        return motifRepository.findAll();
    }

    @Override
    public Optional<MotifModel> findById(String id) {
        return motifRepository.findById(id);
    }

    @Override
    public MotifModel save(MotifModel motifModel) {
        return motifRepository.save(motifModel);
    }

    @Override
    public MotifModel update(MotifModel motifModel) {
        motifRepository.findById(motifModel.getId()).orElseThrow(() -> new RuntimeException("aucun motif"));
        return motifRepository.save(motifModel);
    }

    @Override
    public void delete(String id) {
        motifRepository.deleteById(id);
    }
}
