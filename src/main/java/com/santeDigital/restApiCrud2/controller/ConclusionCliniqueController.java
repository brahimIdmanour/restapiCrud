package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.ConclusionCliniqueModel;
import com.santeDigital.restApiCrud2.services.ConclusionCliniqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conclusionClinique")
public class ConclusionCliniqueController {
    @Autowired
    private ConclusionCliniqueService conclusionCliniqueService;
    @GetMapping("/findAll")
    public ResponseEntity<List<ConclusionCliniqueModel>> findAll(){
        return ResponseEntity.ok(conclusionCliniqueService.findAll());
    }
    @PostMapping("/save")
    public ResponseEntity<ConclusionCliniqueModel> save(@RequestBody ConclusionCliniqueModel request){
        return ResponseEntity.ok(conclusionCliniqueService.save(request));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ConclusionCliniqueModel> update(@PathVariable("id") String id, ConclusionCliniqueModel request){
        return ResponseEntity.ok(conclusionCliniqueService.save(request));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ConclusionCliniqueModel> delete(@PathVariable("id") String id){
        conclusionCliniqueService.delete(id);
        return ResponseEntity.ok().build();
    }
}
