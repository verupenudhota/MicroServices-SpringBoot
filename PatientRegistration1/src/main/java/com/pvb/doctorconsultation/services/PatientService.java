package com.pvb.doctorconsultation.services;

import java.util.List;

import com.pvb.doctorconsultation.entites.Patient;


public interface PatientService {
	public Patient savePatient(Patient Patient);
	 public Patient updatePatient(Patient Patient);
	 public void deletePatient(Patient Patient);
	 public Patient findById(Integer id);
	 public List<Patient> findAll();

}
