package com.skillstorm.akcomms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
@Table
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@NotBlank
	private String name;
	
	@OneToOne
	@NotBlank
	private DataPlan dataplan;
	
	@Min(value = 0, message = "Price is more than one")
	private Double price;
	
	@NotBlank
	@Pattern(regexp = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$")
	private int number;
	
	@OneToOne
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
