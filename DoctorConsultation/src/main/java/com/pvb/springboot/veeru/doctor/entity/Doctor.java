package com.pvb.springboot.veeru.doctor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="consultation")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;
      private String doctorname;
      @Column(name="patientid")
      private long patientId;
      private String observations;
      private String medications;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	public String getMedications() {
		return medications;
	}
	public void setMedications(String medications) {
		this.medications = medications;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorname=" + doctorname + ", patientId=" + patientId + ", observations="
				+ observations + ", medications=" + medications + "]";
	}
	public Doctor(long id, String doctorname, long patientId, String observations, String medications) {
		super();
		this.id = id;
		this.doctorname = doctorname;
		this.patientId = patientId;
		this.observations = observations;
		this.medications = medications;
	}
      public Doctor() {
    	  
      }
      
}
