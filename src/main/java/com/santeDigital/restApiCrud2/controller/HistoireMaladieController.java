package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.HistoireMaladieModel;
import com.santeDigital.restApiCrud2.services.HistoirMaladieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/histoireMaladie")
@CrossOrigin(origins = "http://localhost:4200/")
public class HistoireMaladieController {
    @Autowired
    private HistoirMaladieService histoirMaladieService;
    @GetMapping("/findAll")
    public ResponseEntity<List<HistoireMaladieModel>> findAll(){
        return ResponseEntity.ok(histoirMaladieService.findAll());
    }
    @GetMapping("findById/{id}")
    public ResponseEntity<HistoireMaladieModel> findById(@PathVariable("id") String id) {
        Optional<HistoireMaladieModel> histoiById = histoirMaladieService.findById(id);
        return new  ResponseEntity<>(histoiById.get(), HttpStatus.OK);
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
