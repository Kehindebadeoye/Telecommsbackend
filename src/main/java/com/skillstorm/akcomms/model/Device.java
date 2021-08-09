package com.skillstorm.akcomms.model;

public class Device {
	
	private int id;
	private String name;
	private DataPlan dataplan;
	private Double price;
	private int number;
	private User user;
	
	public Device() {
		super();
	}

	public Device(int id, String name, DataPlan dataplan, Double price, int number, User user) {
		super();
		this.id = id;
		this.name = name;
		this.dataplan = dataplan;
		this.price = price;
		this.number = number;
		this.user = user;
	}

	public Device(String name, DataPlan dataplan, Double price, int number, User user) {
		super();
		this.name = name;
		this.dataplan = dataplan;
		this.price = price;
		this.number = number;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DataPlan getDataplan() {
		return dataplan;
	}

	public void setDataplan(DataPlan dataplan) {
		this.dataplan = dataplan;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", dataplan=" + dataplan + ", price=" + price + ", number="
				+ number + ", user=" + user + "]";
	}

	
}
