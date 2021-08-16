package com.skillstorm.akcomms.model;

import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name="DATA_PLAN")
public class DataPlan {
//	public static final double UNLIMITEDSTARTER = 35.00;
//	public static final double UNLIMITEDEXTRA = 40.00;
//	public static final double UNLIMITEDELITE = 50.00;
	@Column
	private String name;
	@Column
	private int amount;
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	@JsonIgnore
	private User user;
	
	
	
//	@Column
//	private DataPlanTypes dataPlanType;
	
//	@Column
	@OneToMany (mappedBy= "dataplan")
//	@JsonIgnore
	private List<Device> device;

	public DataPlan() {
		super();
	}



	public DataPlan(String name, int amount, int id) {
		super();
		this.name = name;
		this.amount = amount;
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public List<Device> getDevice() {
		return device;
	}



	public void setDevice(List<Device> device) {
		this.device = device;
	}



	@Override
	public String toString() {
		return "DataPlan [name=" + name + ", amount=" + amount + ", id=" + id + "]";
	}



	

	
	
	

}
