package com.pvb.springboot.veeru.doctor.service;

import java.util.List;

import com.pvb.springboot.veeru.doctor.entity.Doctor;

public interface DoctorService {
      public Doctor saveDoctor(Doctor doctor);
      public Doctor updateDoctor(Doctor doctor);
      public void deleteDoctor(Doctor doctor);
      public Doctor findById(long id);
      public List<Doctor> findAll();
      public List<Doctor> findByPatientId(long patientId);
      
}
