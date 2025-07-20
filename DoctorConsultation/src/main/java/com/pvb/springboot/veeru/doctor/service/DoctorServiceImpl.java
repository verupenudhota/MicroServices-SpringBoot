package com.pvb.springboot.veeru.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvb.springboot.veeru.doctor.entity.Doctor;
import com.pvb.springboot.veeru.doctor.repo.DoctorRepo;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

	@Override
	public void deleteDoctor(Doctor doctor) {
		doctorRepo.delete(doctor);
	}

	@Override
	public Doctor findById(long id) {
		return doctorRepo.findById(id).get();
	}

	@Override
	public List<Doctor> findAll() {
		return doctorRepo.findAll();
	}

	@Override
	public List<Doctor> findByPatientId(long patientId){
		return doctorRepo.findByPatientId(patientId);
	}

}
