package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.PriseEnChargeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriseEnChargeRepository extends MongoRepository<PriseEnChargeModel, String> {
}
