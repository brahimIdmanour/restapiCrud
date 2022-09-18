package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.ConclusionCliniqueModel;

import java.util.List;
import java.util.Optional;

public interface ConclusionCliniqueService {

    List<ConclusionCliniqueModel> findAll();

    Optional<ConclusionCliniqueModel> findById(String id);

    Optional<ConclusionCliniqueModel> findByVisiteId(String visiteId);

    ConclusionCliniqueModel save(ConclusionCliniqueModel conclusionCliniqueModel);

    ConclusionCliniqueModel update(ConclusionCliniqueModel conclusionCliniqueModel);

    void delete(String id);
}
