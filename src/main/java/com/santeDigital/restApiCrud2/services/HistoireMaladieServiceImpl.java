package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.HistoireMaladieModel;
import com.santeDigital.restApiCrud2.repository.HistoireMaladieRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class HistoireMaladieServiceImpl implements HistoirMaladieService{
    @Autowired
    private HistoireMaladieRepository histoireMaladieRepository;
    @Override
    public List<HistoireMaladieModel> findAll() {
        return histoireMaladieRepository.findAll();
    }

    @Override
    public Optional<HistoireMaladieModel> findById(String id) {
        return histoireMaladieRepository.findById(id);
    }

    @Override
    public HistoireMaladieModel save(HistoireMaladieModel histoireMaladieModel) {
        return histoireMaladieRepository.save(histoireMaladieModel);
    }

    @Override
    public HistoireMaladieModel update(HistoireMaladieModel histoireMaladieModel) {
        histoireMaladieRepository.findById(histoireMaladieModel.getId()).orElseThrow(()-> new IllegalArgumentException("aucun data"));
        return histoireMaladieRepository.save(histoireMaladieModel);
    }

    @Override
    public void delete(String id) {
        histoireMaladieRepository.deleteById(id);
    }
}
