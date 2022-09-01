package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.HistoireMaladieModel;

import java.util.List;

public interface HistoirMaladieService {

    List<HistoireMaladieModel> findAll();

    HistoireMaladieModel save(HistoireMaladieModel histoireMaladieModel);

    HistoireMaladieModel update(HistoireMaladieModel histoireMaladieModel);

    void delete(String id);
}
