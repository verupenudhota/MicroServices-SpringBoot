package com.pvb.doctorconsultation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvb.doctorconsultation.entites.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
