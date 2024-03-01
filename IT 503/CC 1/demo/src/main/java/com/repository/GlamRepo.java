package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Glam;

@Repository
public interface GlamRepo extends JpaRepository<Glam,Integer>{

}