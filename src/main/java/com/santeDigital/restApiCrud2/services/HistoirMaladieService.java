package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.HistoireMaladieModel;

import java.util.List;
import java.util.Optional;

public interface HistoirMaladieService {

    List<HistoireMaladieModel> findAll();

    Optional<HistoireMaladieModel> findById(String id);

    HistoireMaladieModel save(HistoireMaladieModel histoireMaladieModel);

    HistoireMaladieModel update(HistoireMaladieModel histoireMaladieModel);

    void delete(String id);
}
