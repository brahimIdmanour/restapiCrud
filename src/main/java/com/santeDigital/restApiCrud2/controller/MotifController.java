package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.MotifModel;
import com.santeDigital.restApiCrud2.repository.MotifRepository;
import com.santeDigital.restApiCrud2.services.MotifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/motif")
@CrossOrigin(origins = "http://localhost:4200/")
public class MotifController {
    @Autowired
    private MotifService motifService;
    @Autowired
    private MotifRepository motifRepository;

    @GetMapping("/findAll")
    public ResponseEntity<List<MotifModel>> findAll() {
        return ResponseEntity.ok(motifService.findAll());
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<MotifModel> findById(@PathVariable("id") String id) {
        Optional<MotifModel> motifById = motifRepository.findById(id);
        return new ResponseEntity<>(motifById.get(), HttpStatus.OK);
    }

    @GetMapping("findByVisiteId/{id}")
    public ResponseEntity<MotifModel> findByVisiteId(@PathVariable("id") String id) {
        Optional<MotifModel> motifById = motifRepository.findByVisiteId(id);
        return new ResponseEntity<>(motifById.get(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<MotifModel> save(@RequestBody MotifModel request) {
        return ResponseEntity.ok(motifService.save(request));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<MotifModel> update(@PathVariable("id") String id, @RequestBody MotifModel request) {
        return ResponseEntity.ok(motifService.update(request));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        motifService.delete(id);
        return ResponseEntity.ok().build();
    }
}
