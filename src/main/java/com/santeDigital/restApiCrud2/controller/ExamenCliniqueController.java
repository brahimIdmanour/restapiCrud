package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.ExamenCliniqueModel;
import com.santeDigital.restApiCrud2.services.ExamenCliniqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/examenClinique")
@CrossOrigin(origins = "http://localhost:4200/")
public class ExamenCliniqueController {
    @Autowired
    private ExamenCliniqueService examenCliniqueService;

    @GetMapping("/findAll")
    public ResponseEntity<List<ExamenCliniqueModel>> findAll() {
        return ResponseEntity.ok(examenCliniqueService.findAll());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<ExamenCliniqueModel> findById(@PathVariable("id") String id) {
        Optional<ExamenCliniqueModel> examenById = examenCliniqueService.findById(id);
        return new ResponseEntity<>(examenById.get(), HttpStatus.OK);
    }

    @GetMapping("/findByVisiteId/{id}")
    public ResponseEntity<ExamenCliniqueModel> findByVisiteId(@PathVariable("id") String id) {
        Optional<ExamenCliniqueModel> examenById = examenCliniqueService.findByVisiteId(id);
        return new ResponseEntity<>(examenById.get(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ExamenCliniqueModel> save(@RequestBody ExamenCliniqueModel request) {
        return ResponseEntity.ok(examenCliniqueService.save(request));
    }

    @PutMapping("/update")
    public ResponseEntity<ExamenCliniqueModel> update(@RequestBody ExamenCliniqueModel request) {
        return ResponseEntity.ok(examenCliniqueService.update(request));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        examenCliniqueService.delete(id);
        return ResponseEntity.ok().build();
    }
}
