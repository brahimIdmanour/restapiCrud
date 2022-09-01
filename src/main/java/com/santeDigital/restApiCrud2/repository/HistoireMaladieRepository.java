package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.HistoireMaladieModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoireMaladieRepository extends MongoRepository<HistoireMaladieModel,String> {
}
