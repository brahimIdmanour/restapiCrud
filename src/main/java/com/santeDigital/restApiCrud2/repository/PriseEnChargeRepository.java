package com.santeDigital.restApiCrud2.repository;

import com.santeDigital.restApiCrud2.models.PriseEnChargeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PriseEnChargeRepository extends MongoRepository<PriseEnChargeModel, String> {
    Optional<PriseEnChargeModel> findById(String id);

    Optional<PriseEnChargeModel> findByVisiteId(String id);
}
