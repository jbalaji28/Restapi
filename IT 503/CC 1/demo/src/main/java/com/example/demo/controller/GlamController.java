package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.Glamservice;

import model.Glam;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class GlamController {
  @Autowired Glamservice service;


    @PostMapping("/add")
    public Glam postMethodName(@RequestBody Glam g) {
        return service.addGlam(g);
    }

    @GetMapping("/get")
    public List<Glam> getMethodName() {
        return service.getGlam();
}
@PutMapping("/put/{id}")
 public ResponseEntity<Glam> updateGlam(@PathVariable int id, @RequestBody Glam updatedGlam) {
        Glam updatedGlamResult = service.updateGlam(id, updatedGlam);
        if (updatedGlamResult != null) {
            return ResponseEntity.ok(updatedGlamResult);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteGlam(@PathVariable int id) {
        boolean deleted = service.deleteGlam(id);

        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}




