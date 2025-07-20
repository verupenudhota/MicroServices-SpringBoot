package com.pvb.doctorconsultation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvb.doctorconsultation.entites.Patient;
import com.pvb.doctorconsultation.repository.PatientRepo;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepo patientRepo;

	@Override
	public Patient savePatient(Patient Patient) {
		return patientRepo.save(Patient);
	}

	@Override
	public Patient updatePatient(Patient Patient) {
		// TODO Auto-generated method stub
		return patientRepo.save(Patient);
	}

	@Override
	public void deletePatient(Patient Patient) {
		// TODO Auto-generated method stub
		patientRepo.delete(Patient);

	}

	@Override
	public Patient findById(Integer id) {
		// TODO Auto-generated method stub
		return patientRepo.findById(id).get();
	}

	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

}
