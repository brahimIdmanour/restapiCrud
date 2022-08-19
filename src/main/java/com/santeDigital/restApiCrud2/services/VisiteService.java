package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.VisiteModel;

import java.util.List;

public interface VisiteService {

    List<VisiteModel> findAll();

    VisiteModel save(VisiteModel visiteModel);

    VisiteModel update(VisiteModel visiteModel);

    void delete(String id);
}
