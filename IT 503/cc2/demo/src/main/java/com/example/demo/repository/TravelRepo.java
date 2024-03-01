package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Travel;
@Repository
public interface TravelRepo extends JpaRepository<Travel,Integer>{

    
}
