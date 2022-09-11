package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.VisiteModel;
import com.santeDigital.restApiCrud2.repository.VisiteRepository;
import com.santeDigital.restApiCrud2.services.VisiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/visite")
public class VisiteController {
    @Autowired
    private VisiteService visiteService;
    @Autowired
    private VisiteRepository visiteRepository;

    @GetMapping("/findAll")
    public ResponseEntity<List<VisiteModel>> findAll(){
        return ResponseEntity.ok(visiteService.findAll());
    }
    @GetMapping("findById/{id}")
    public ResponseEntity<VisiteModel> findById(@PathVariable("id") String id) {
        Optional<VisiteModel> visieById = visiteRepository.findById(id);
        return new  ResponseEntity<>(visieById.get(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<VisiteModel> save(@RequestBody VisiteModel request) {
        return ResponseEntity.ok(visiteService.save(request));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<VisiteModel> update(@PathVariable("id") String id, @RequestBody VisiteModel request) {
        return ResponseEntity.ok(visiteService.update(request));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        visiteService.delete(id);
        return ResponseEntity.ok().build();
    }
}
