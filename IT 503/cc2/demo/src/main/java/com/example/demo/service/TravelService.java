package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.example.demo.model.Travel;
import com.example.demo.repository.BookedRepo;
import com.example.demo.repository.TravelRepo;

@Service
public class TravelService {
    @Autowired
    TravelRepo repo;
    BookedRepo Brepo;
    
    public Travel addTravel(Travel t)
    {
        return repo.save(t);
    }
    
    public List<Travel> getTravels()
    {
        return repo.findAll();
    }
    
    public Optional<Travel> getById(Integer id)
    {
        return repo.findById(id);
    }
    public void deleteTravel(int id)
    {
        Optional<Travel> travelOptional=repo.findById(id);
        if(travelOptional.isPresent())
        {
            repo.deleteById(id);
        }
        else{
            throw new IllegalArgumentException("Travel not Found!!");
        }
    }
    public Travel updateTravel(Integer id, Travel updateTravel)
    {
        Travel t = repo.findById(id).orElse((null));
        
        if(t!=null)
        {
            
            t.setUserName(updateTravel.getUserName());
            t.setEmail(updateTravel.getEmail());
            t.setPhoneNum(updateTravel.getPhoneNum());
            return repo.saveAndFlush(t);
        }
        else
        {
            return null;
        }
    }
    public Page<Travel> getTravelPage(int offset, int pageSize) {
        Pageable pageable = PageRequest.of(offset, pageSize);
        return repo.findAll(pageable);
    }
    
}
