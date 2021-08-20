package com.skillstorm.akcomms.model;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column
	@NotBlank
	private String username;
	
	@Column
	private String password;
	
	@OneToMany(mappedBy = "user")
//	@JsonIgnore
	private List<DataPlan> dataPlan;
	
	@OneToMany(mappedBy = "user")
//	@JsonIgnore
	private List<Device> device;
	
	@Email
	private String email;
	private String mailingAddress;
	
//	@NotBlank
//	@Pattern(regexp = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$")
//	private long number;
	
	
	
	
	public User() {
		super();
	}


	public User(int cid, String username, String password, String email, String mailingAddress) {
		super();
		this.cid = cid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mailingAddress = mailingAddress;
//		this.number = number;
	}

	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Device> getDevice() {
		return device;
	}


	public void setDevice(List<Device> device) {
		this.device = device;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMailingAddress() {
		return mailingAddress;
	}


	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}


//	public long getNumber() {
//		return number;
//	}
//
//
//	public void setNumber(int number) {
//		this.number = number;
//	}


	public List<DataPlan> getDataPlan() {
		return dataPlan;
	}


	public void setDataPlan(List<DataPlan> dataPlan) {
		this.dataPlan = dataPlan;
	}


	@Override
	public String toString() {
		return "User [cid=" + cid + ", username=" + username + ", password=" + password + ", email=" + email + ", mailingAddress=" + mailingAddress  + "]";
	}
	
	
	
	

}
