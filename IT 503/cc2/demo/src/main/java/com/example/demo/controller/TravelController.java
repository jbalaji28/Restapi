package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Travel;
import com.example.demo.service.TravelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class TravelController {
    @Autowired
    TravelService travelService;

    @PostMapping("/post")
    public Travel postMethodName(@RequestBody Travel t) {
        return travelService.addTravel(t);
    }

    @GetMapping("/get")
    public List<Travel> getMethod() {
        return travelService.getTravels();
    }
    
    @GetMapping("/sort/{offset}/{pagesize}")
    public List<Travel> getMethodName(@PathVariable int offset, @PathVariable int pagesize) {
        return travelService.getTravelPage(offset, pagesize).getContent();
    }
    
    @GetMapping("/get/{id}")
    public Optional<Travel> getById(@PathVariable ("id") int id)
    {
        return travelService.getById(id);
    }
    
    @DeleteMapping("delete/{id}")
    public void deleteTravel(@PathVariable("id") int id)
    {
        travelService.deleteTravel(id);
    }
    
    @PutMapping("update/{id}")
    public Travel updateTravel(@PathVariable ("id") Integer id,@RequestBody Travel travel)
    {
        return travelService.updateTravel(id,travel);
    }
}
