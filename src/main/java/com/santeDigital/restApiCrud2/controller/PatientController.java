package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.PatientModel;
import com.santeDigital.restApiCrud2.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "http://localhost:4200/")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/findAll")
    public ResponseEntity<List<PatientModel>> findAll(){
        return ResponseEntity.ok(patientService.findAll());
    }
    @GetMapping("findById/{id}")
    public ResponseEntity<PatientModel> findById(@PathVariable("id") String id) {
        Optional<PatientModel> patientById = patientService.findById(id);
        return new  ResponseEntity<>(patientById.get(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<PatientModel> save(@RequestBody PatientModel request){
        return ResponseEntity.ok(patientService.save(request));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<PatientModel> update(@PathVariable("id") String id, @RequestBody PatientModel request) {
        return ResponseEntity.ok(patientService.update(request));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        patientService.delete(id);
        return ResponseEntity.ok().build();
    }
}
