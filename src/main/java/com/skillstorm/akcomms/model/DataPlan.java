package com.skillstorm.akcomms.model;

import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="DATA_PLAN")
public class DataPlan {
	public static final double UNLIMITEDSTARTER = 35.00;
	public static final double UNLIMITEDEXTRA = 40.00;
	public static final double UNLIMITEDELITE = 50.00;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	
	
	@Column
	private DataPlanTypes dataPlanType;
	
//	@Column
//	private List<Device> device;

	public DataPlan() {
		super();
	}

public DataPlan(User user, DataPlanTypes dataPlanType) {
	super();
	this.user = user;
	this.dataPlanType = dataPlanType;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public DataPlanTypes getDataPlanType() {
	return dataPlanType;
}

public void setDataPlanType(DataPlanTypes dataPlanType) {
	this.dataPlanType = dataPlanType;
}

public static double getUnlimitedstarter() {
	return UNLIMITEDSTARTER;
}

public static double getUnlimitedextra() {
	return UNLIMITEDEXTRA;
}

public static double getUnlimitedelite() {
	return UNLIMITEDELITE;
}

@Override
public String toString() {
	return "DataPlan [user=" + user + ", id=" + id + ", dataPlanType=" + dataPlanType + "]";
}

	
	
	

}
