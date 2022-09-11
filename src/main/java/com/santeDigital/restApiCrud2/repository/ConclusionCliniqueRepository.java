package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.ConclusionCliniqueModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConclusionCliniqueRepository extends MongoRepository<ConclusionCliniqueModel, String> {
    Optional<ConclusionCliniqueModel> findById(String id);
}
