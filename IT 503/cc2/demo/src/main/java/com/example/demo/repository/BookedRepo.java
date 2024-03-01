package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Booked;

@Repository
public interface BookedRepo extends JpaRepository<Booked, Integer>{

    
}
