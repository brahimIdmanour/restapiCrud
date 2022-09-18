package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.PriseEnChargeModel;
import com.santeDigital.restApiCrud2.services.PriseEnChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/priseEnCharge")
@CrossOrigin(origins = "http://localhost:4200/")
public class PriseEnChargeController {
    @Autowired
    private PriseEnChargeService priseEnChargeService;
    @GetMapping("/findAll")
    public ResponseEntity<List<PriseEnChargeModel>> findAll(){
        return ResponseEntity.ok(priseEnChargeService.findAll());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<PriseEnChargeModel> findById(@PathVariable("id") String id) {
        Optional<PriseEnChargeModel> priseById = priseEnChargeService.findById(id);
        return new  ResponseEntity<>(priseById.get(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<PriseEnChargeModel> save(@RequestBody PriseEnChargeModel request){
        return ResponseEntity.ok(priseEnChargeService.save(request));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<PriseEnChargeModel> update(@PathVariable("id") String id, @RequestBody PriseEnChargeModel request){
        return ResponseEntity.ok(priseEnChargeService.update(request));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        priseEnChargeService.delete(id);
        return ResponseEntity.ok().build();
    }
}
