package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.GlamRepo;

import model.Glam;
@Service
public class Glamservice {
    
     @Autowired
    GlamRepo repo;

    public Glam addGlam(Glam m) {
        return repo.save(m);
    }
    public List<Glam> getGlam()
    {
        return repo.findAll();
}
public Glam updateGlam(int id, Glam updatedGlam) {
    Glam existingGlam = repo.findById(id).orElse(null);

    if (existingGlam != null) {
        
        existingGlam.setCosmeticName(updatedGlam.getCosmeticName());
        existingGlam.setCosmeticFor(updatedGlam.getCosmeticFor());
        existingGlam.setCosmeticBrand(updatedGlam.getCosmeticBrand());
        existingGlam.setManufacturedIn(updatedGlam.getManufacturedIn());
        existingGlam.setCosmeticPrice(updatedGlam.getCosmeticPrice());
        existingGlam.setExpiryDate(updatedGlam.getExpiryDate());
       
        return repo.save(existingGlam);
    }

    return null; 
}
public boolean deleteGlam(int id) {
    if (repo.existsById(id)) {
        repo.deleteById(id);
        return true;
    }
    return false;
}

}
