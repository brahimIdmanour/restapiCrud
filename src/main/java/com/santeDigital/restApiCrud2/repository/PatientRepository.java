package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.PatientModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends MongoRepository<PatientModel, String> {
    Optional<PatientModel> findById(String id);
}
