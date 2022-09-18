package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.ExamenCliniqueModel;

import java.util.List;
import java.util.Optional;

public interface ExamenCliniqueService {

    List<ExamenCliniqueModel> findAll();

    Optional<ExamenCliniqueModel> findById(String id);

    Optional<ExamenCliniqueModel> findByVisiteId(String visiteId);

    ExamenCliniqueModel save(ExamenCliniqueModel examenCliniqueModel);

    ExamenCliniqueModel update(ExamenCliniqueModel examenCliniqueModel);

    void delete(String id);
}
