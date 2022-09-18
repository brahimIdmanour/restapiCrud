package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.ConclusionCliniqueModel;
import com.santeDigital.restApiCrud2.services.ConclusionCliniqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conclusionClinique")
@CrossOrigin(origins = "http://localhost:4200/")
public class ConclusionCliniqueController {
    @Autowired
    private ConclusionCliniqueService conclusionCliniqueService;
    @GetMapping("/findAll")
    public ResponseEntity<List<ConclusionCliniqueModel>> findAll(){
        return ResponseEntity.ok(conclusionCliniqueService.findAll());
    }
    @GetMapping("findById/{id}")
    public ResponseEntity<ConclusionCliniqueModel> findById(@PathVariable("id") String id) {
        Optional<ConclusionCliniqueModel> conclusionById = conclusionCliniqueService.findById(id);
        return new  ResponseEntity<>(conclusionById.get(), HttpStatus.OK);
    }
   @GetMapping("/findByvisiteId/{id}")
   public  ResponseEntity<ConclusionCliniqueModel> findByVisiteId(@PathVariable("id") String id){
        Optional<ConclusionCliniqueModel> conclusionByVisiteId = conclusionCliniqueService.findByVisiteId(id);
        return new ResponseEntity<>(conclusionByVisiteId.get(), HttpStatus.OK);
   }
    @PostMapping("/save")
    public ResponseEntity<ConclusionCliniqueModel> save(@RequestBody ConclusionCliniqueModel request){
        return ResponseEntity.ok(conclusionCliniqueService.save(request));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ConclusionCliniqueModel> update(@PathVariable("id") String id, @RequestBody ConclusionCliniqueModel request){
        return ResponseEntity.ok(conclusionCliniqueService.update(request));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ConclusionCliniqueModel> delete(@PathVariable("id") String id){
        conclusionCliniqueService.delete(id);
        return ResponseEntity.ok().build();
    }
}
