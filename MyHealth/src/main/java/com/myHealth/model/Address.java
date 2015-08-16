package com.myHealth.model;

public class Address {

	private Integer addressId;
	
	private String flatNo;
	
	private String buildingName;
	
	private String streetName;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String zip;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Address(Integer addressId, String flatNo, String buildingName,
			String streetName, String city, String state, String country,
			String zip) {
		super();
		this.addressId = addressId;
		this.flatNo = flatNo;
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	
	
}
