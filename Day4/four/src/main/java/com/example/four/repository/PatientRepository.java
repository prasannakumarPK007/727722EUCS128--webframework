package com.example.four.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.four.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository <Patient,Integer>{

    
}
