package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.HistoireMaladieModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HistoireMaladieRepository extends MongoRepository<HistoireMaladieModel,String> {
    Optional<HistoireMaladieModel> findById(String id);
}
