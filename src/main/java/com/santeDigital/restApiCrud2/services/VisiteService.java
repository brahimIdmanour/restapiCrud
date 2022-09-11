package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.VisiteModel;

import java.util.List;
import java.util.Optional;

public interface VisiteService {

    List<VisiteModel> findAll();

    Optional<VisiteModel> findById(String id);

    VisiteModel save(VisiteModel visiteModel);

    VisiteModel update(VisiteModel visiteModel);

    void delete(String id);
}
