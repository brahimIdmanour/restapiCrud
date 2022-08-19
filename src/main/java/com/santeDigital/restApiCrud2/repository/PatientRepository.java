package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.PatientModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<PatientModel, String> {
}
