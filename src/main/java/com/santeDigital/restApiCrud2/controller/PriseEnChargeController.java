package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.PriseEnChargeModel;
import com.santeDigital.restApiCrud2.services.PriseEnChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priseEnCharge")
@CrossOrigin(origins = "*")
public class PriseEnChargeController {
    @Autowired
    private PriseEnChargeService priseEnChargeService;
    @GetMapping("/findAll")
    public ResponseEntity<List<PriseEnChargeModel>> findAll(){
        return ResponseEntity.ok(priseEnChargeService.findAll());
    }
    @PostMapping("/save")
    public ResponseEntity<PriseEnChargeModel> save(@RequestBody PriseEnChargeModel request){
        return ResponseEntity.ok(priseEnChargeService.save(request));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<PriseEnChargeModel> update(@PathVariable("id") String id, @RequestBody PriseEnChargeModel request){
        return ResponseEntity.ok(priseEnChargeService.save(request));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        priseEnChargeService.delete(id);
        return ResponseEntity.ok().build();
    }
}
