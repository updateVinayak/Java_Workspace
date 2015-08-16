package com.myHealth.model;

import com.myHealth.model.data.AddressDetails;

public class Doctor {

	private Integer doctorId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String email;
	
	private Address homeAddress;
	
	private Address clinicAddress;

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getClinicAddress() {
		return clinicAddress;
	}

	public void setClinicAddress(Address clinicAddress) {
		this.clinicAddress = clinicAddress;
	}

	public Doctor(Integer doctorId, String firstName, String middleName,
			String lastName, String email) {
		super();
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
	}
	

	
	

}
