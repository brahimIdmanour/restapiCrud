package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.MotifModel;

import java.util.List;
import java.util.Optional;

public interface MotifService {

    List<MotifModel> findAll();

    Optional<MotifModel> findById(String id);

    MotifModel save(MotifModel motifModel);

    MotifModel update(MotifModel motifModel);

    void delete(String id);
}
