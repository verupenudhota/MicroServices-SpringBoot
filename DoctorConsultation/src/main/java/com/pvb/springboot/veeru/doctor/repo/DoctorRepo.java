package com.pvb.springboot.veeru.doctor.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvb.springboot.veeru.doctor.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Long>{
      public List<Doctor> findByPatientId(long patientId);
}
