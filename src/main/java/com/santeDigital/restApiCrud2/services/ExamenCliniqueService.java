package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.ExamenCliniqueModel;

import java.util.List;

public interface ExamenCliniqueService {

    List<ExamenCliniqueModel> findAll();

    ExamenCliniqueModel save(ExamenCliniqueModel examenCliniqueModel);

    ExamenCliniqueModel update(ExamenCliniqueModel examenCliniqueModel);

    void delete(String id);
}
