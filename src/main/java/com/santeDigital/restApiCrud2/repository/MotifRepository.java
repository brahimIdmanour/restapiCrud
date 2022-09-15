package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.MotifModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MotifRepository extends MongoRepository<MotifModel, String> {
    Optional<MotifModel> findById(String id);
}
