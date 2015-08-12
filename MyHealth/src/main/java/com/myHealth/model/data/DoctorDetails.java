package com.myHealth.model.data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MH_DOCTOR")
public class DoctorDetails {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Doctorid")
	private Integer doctorId;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="HOMEADDRESSID")
	private AddressDetails homeAddress;
	
	private String degree;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CLINICADDRESSID")
	private AddressDetails clinicAddress;

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}



	public AddressDetails getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(AddressDetails homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public AddressDetails getClinicAddress() {
		return clinicAddress;
	}

	public void setClinicAddress(AddressDetails clinicAddress) {
		this.clinicAddress = clinicAddress;
	}

	
	
}