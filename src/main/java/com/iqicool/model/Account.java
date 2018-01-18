package com.iqicool.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Index;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames="username")})
public class Account extends BaseObject {

	@Index(name="idx_username")
	private String username;
	private String nickname;
	private String password;
	private String phoneRegion;
	private String phone;
	private String email;
    private long role;
	//The hotels this user can see
	//private Set<Hotel> hotels;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneRegion() {
		return phoneRegion;
	}
	public void setPhoneRegion(String phoneRegion) {
		this.phoneRegion = phoneRegion;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getRole() {
		return role;
	}
	public void setRole(long role) {
		this.role = role;
	}
}
