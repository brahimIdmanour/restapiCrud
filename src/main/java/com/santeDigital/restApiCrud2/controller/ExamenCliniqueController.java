package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.ExamenCliniqueModel;
import com.santeDigital.restApiCrud2.services.ExamenCliniqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examenClinique")
public class ExamenCliniqueController {
    @Autowired
    private ExamenCliniqueService examenCliniqueService;
    @GetMapping("/findAll")
    public ResponseEntity<List<ExamenCliniqueModel>> findAll(){
        return ResponseEntity.ok(examenCliniqueService.findAll());
    }
    @PostMapping("/save")
    public ResponseEntity<ExamenCliniqueModel> save(@RequestBody ExamenCliniqueModel request){
        return ResponseEntity.ok(examenCliniqueService.save(request));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ExamenCliniqueModel> update(@PathVariable("id") String id, ExamenCliniqueModel request){
        return ResponseEntity.ok(examenCliniqueService.save(request));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        examenCliniqueService.delete(id);
        return ResponseEntity.ok().build();
    }
}
