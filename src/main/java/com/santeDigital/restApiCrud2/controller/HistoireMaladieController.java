package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.HistoireMaladieModel;
import com.santeDigital.restApiCrud2.services.HistoirMaladieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/histoireMaladie")
public class HistoireMaladieController {
    @Autowired
    private HistoirMaladieService histoirMaladieService;
    @GetMapping("/findAll")
    public ResponseEntity<List<HistoireMaladieModel>> findAll(){
        return ResponseEntity.ok(histoirMaladieService.findAll());
    }
    @PostMapping("/save")
    public ResponseEntity<HistoireMaladieModel> save(@RequestBody HistoireMaladieModel request){
        return ResponseEntity.ok(histoirMaladieService.save(request));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<HistoireMaladieModel> update(@PathVariable("id") String id, @RequestBody HistoireMaladieModel request){
        return ResponseEntity.ok(histoirMaladieService.update(request));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        histoirMaladieService.delete(id);
        return ResponseEntity.ok().build();
    }
}
