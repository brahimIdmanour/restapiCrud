package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.PriseEnChargeModel;
import com.santeDigital.restApiCrud2.repository.PriseEnChargeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class PriseEnChargeServiceImpl implements PriseEnChargeService{
    @Autowired
    private PriseEnChargeRepository priseEnChargeRepository;
    @Override
    public List<PriseEnChargeModel> findAll() {
        return priseEnChargeRepository.findAll();
    }

    @Override
    public Optional<PriseEnChargeModel> findById(String id) {
        return priseEnChargeRepository.findById(id);
    }

    @Override
    public Optional<PriseEnChargeModel> findByvisiteId(String visiteId) {
        return priseEnChargeRepository.findByVisiteId(visiteId);
    }

    @Override
    public PriseEnChargeModel save(PriseEnChargeModel priseEnChargeModel) {
        return priseEnChargeRepository.save(priseEnChargeModel);
    }

    @Override
    public PriseEnChargeModel update(PriseEnChargeModel priseEnChargeModel) {
        priseEnChargeRepository.findById(priseEnChargeModel.getId()).orElseThrow(()-> new IllegalArgumentException("aucun data"));
        priseEnChargeRepository.save(priseEnChargeModel);
        return null;
    }

    @Override
    public void delete(String id) {
        priseEnChargeRepository.deleteById(id);
    }
}
