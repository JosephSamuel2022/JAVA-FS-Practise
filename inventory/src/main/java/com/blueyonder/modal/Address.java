package com.blueyonder.modal;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
//@Scope("prototype")
@Data
public class Address {
	public Address() {
		super();
	}
	public Address(String landMark, String street, String city, String state, String country) {
		super();
		this.landMark = landMark;
		this.street = street;
		this.city = city;
		State = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [landMark=" + landMark + ", street=" + street + ", city=" + city + ", State=" + State
				+ ", country=" + country + "]";
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String landMark;
	private String street;
	private String city;
	private String State;
	private String country;

}
