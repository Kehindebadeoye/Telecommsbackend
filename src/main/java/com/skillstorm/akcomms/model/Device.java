package com.skillstorm.akcomms.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table
public class Device {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@NotBlank
	private String name;
	

	@ManyToOne//(fetch =FetchType.LAZY)
	@JoinColumn (name = "DATA_PLAN_ID")
	private DataPlan dataplan;
	
	@Column
	@Min(value = 0, message = "Price is more than one")
	private Double price;
	
	@NotBlank
	@Pattern(regexp = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$")
	private String number;
	
	@ManyToOne//(fetch =FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	@JsonIgnore
	private User user;
	
	public Device() {
		super();
	}

	public Device(String name, Double price, String number, User user, DataPlan dataplan) {
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
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
		return "Device [id=" + id + ", name=" + name +  ", price=" + price + ", number="
				+ number + ", user=" + user + ", dataplan=" + dataplan + "]";
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataplan == null) ? 0 : dataplan.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (dataplan == null) {
			if (other.dataplan != null)
				return false;
		} else if (!dataplan.equals(other.dataplan))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	
}
