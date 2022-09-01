package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.PriseEnChargeModel;

import java.util.List;

public interface PriseEnChargeService {

    List<PriseEnChargeModel> findAll();

    PriseEnChargeModel save(PriseEnChargeModel priseEnChargeModel);

    PriseEnChargeModel update(PriseEnChargeModel priseEnChargeModel);

    void delete(String id);
}
