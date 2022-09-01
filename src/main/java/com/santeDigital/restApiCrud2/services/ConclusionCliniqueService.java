package com.santeDigital.restApiCrud2.services;

import com.santeDigital.restApiCrud2.models.ConclusionCliniqueModel;

import java.util.List;

public interface ConclusionCliniqueService {

    List<ConclusionCliniqueModel> findAll();

    ConclusionCliniqueModel save(ConclusionCliniqueModel conclusionCliniqueModel);

    ConclusionCliniqueModel update(ConclusionCliniqueModel conclusionCliniqueModel);

    void delete(String id);
}
