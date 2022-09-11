package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.PriseEnChargeModel;

import java.util.List;
import java.util.Optional;

public interface PriseEnChargeService {

    List<PriseEnChargeModel> findAll();

    Optional<PriseEnChargeModel> findById(String id);

    PriseEnChargeModel save(PriseEnChargeModel priseEnChargeModel);

    PriseEnChargeModel update(PriseEnChargeModel priseEnChargeModel);

    void delete(String id);
}
