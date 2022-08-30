package com.santeDigital.restApiCrud2.controller;

import com.santeDigital.restApiCrud2.models.VisiteModel;
import com.santeDigital.restApiCrud2.services.VisiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visite")
public class VisiteController {
    @Autowired
    private VisiteService visiteService;

    @GetMapping("/findAll")
    public ResponseEntity<List<VisiteModel>> findAll(){
        return ResponseEntity.ok(visiteService.findAll());
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
