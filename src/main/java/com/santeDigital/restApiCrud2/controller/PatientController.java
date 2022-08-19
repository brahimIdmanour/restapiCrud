package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.PatientModel;
import com.santeDigital.restApiCrud2.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/findAll")
    public ResponseEntity<List<PatientModel>> findAll(){
        return ResponseEntity.ok(patientService.findAll());
    }
    @PostMapping("/save")
    public ResponseEntity<PatientModel> save(@RequestBody PatientModel request){
        return ResponseEntity.ok(patientService.save(request));
    }
    @PutMapping("/update")
    public ResponseEntity<PatientModel> update(@RequestBody PatientModel request) {
        return ResponseEntity.ok(patientService.update(request));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(@RequestBody  String id){
        patientService.delete(id);
        return ResponseEntity.ok().build();
    }
}
