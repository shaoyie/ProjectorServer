package com.iqicool.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Index;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames="sn")})
public class Device extends BaseObject {

	@Index(name="idx_hotelId")
	private Long hotelId;
	private String room;
	@Index(name="idx_sn")
	private String sn;
	private double price;
	private int payType;
	private Date availableTime;
	
	public Date getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(Date availableTime) {
		this.availableTime = availableTime;
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
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
}
