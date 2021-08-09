package com.skillstorm.akcomms.model;

import java.util.List;


public class User {
	private int cid;
	private String username;
	private String password;
	private List<Device> device;
	private String email;
	private String mailingAddress;
	private int number;
	private List<DataPlan> DataPlan;
	
	
	public User() {
		super();
	}


	public User(int cid, String username, String password, List<Device> device, String email, String mailingAddress,
			int number, List<com.skillstorm.akcomms.model.DataPlan> dataPlan) {
		super();
		this.cid = cid;
		this.username = username;
		this.password = password;
		this.device = device;
		this.email = email;
		this.mailingAddress = mailingAddress;
		this.number = number;
		DataPlan = dataPlan;
	}


	public User(String username, String password, List<Device> device, String email, String mailingAddress, int number,
			List<com.skillstorm.akcomms.model.DataPlan> dataPlan) {
		super();
		this.username = username;
		this.password = password;
		this.device = device;
		this.email = email;
		this.mailingAddress = mailingAddress;
		this.number = number;
		DataPlan = dataPlan;
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


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public List<DataPlan> getDataPlan() {
		return DataPlan;
	}


	public void setDataPlan(List<DataPlan> dataPlan) {
		DataPlan = dataPlan;
	}


	@Override
	public String toString() {
		return "User [cid=" + cid + ", username=" + username + ", password=" + password + ", device=" + device
				+ ", email=" + email + ", mailingAddress=" + mailingAddress + ", number=" + number + ", DataPlan="
				+ DataPlan + "]";
	}
	
	
	
	

}
