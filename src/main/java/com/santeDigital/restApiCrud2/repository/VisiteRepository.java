package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.VisiteModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisiteRepository extends MongoRepository<VisiteModel, String> {
}
