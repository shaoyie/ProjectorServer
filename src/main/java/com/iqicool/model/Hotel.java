package com.iqicool.model;

import javax.persistence.Entity;

@Entity
public class Hotel extends BaseObject {

	private String name;
	private String description;
	private String address;
	private Long city;
	private double price;
	private int payType;
	//The users who have privilege to view/admin this hotel
	//private Set<User> admins; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getCity() {
		return city;
	}
	public void setCity(Long city) {
		this.city = city;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPayType() {
		return payType;
	}
	public void setPayType(int payType) {
		this.payType = payType;
	}
	
}
