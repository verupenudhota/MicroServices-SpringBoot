package com.pvb.springboot.veeru.doctor.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pvb.springboot.veeru.doctor.dto.Patient;

@FeignClient("APIGateWay")
public interface PatientRegRestClient {
	
	@GetMapping("/patientregistration/patients/{id}")
	public Patient getPatientDetails(@PathVariable("id") long id);

}