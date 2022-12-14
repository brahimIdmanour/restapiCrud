package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.VisiteModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VisiteRepository extends MongoRepository<VisiteModel, String> {
    Optional<VisiteModel> findById(String id);

}
