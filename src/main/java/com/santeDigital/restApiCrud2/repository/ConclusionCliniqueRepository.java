package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.ConclusionCliniqueModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConclusionCliniqueRepository extends MongoRepository<ConclusionCliniqueModel, String> {
}
