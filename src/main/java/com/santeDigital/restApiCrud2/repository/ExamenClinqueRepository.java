package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.ExamenCliniqueModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExamenClinqueRepository extends MongoRepository<ExamenCliniqueModel, String> {
    Optional<ExamenCliniqueModel> findById(String id);
}
