package com.pvb.springboot.veeru.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DoctorConsultationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorConsultationApplication.class, args);
	}

}
