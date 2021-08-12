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
	public static final double UNLIMITEDSTARTER = 35.00;
	public static final double UNLIMITEDEXTRA = 40.00;
	public static final double UNLIMITEDELITE = 50.00;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	@JsonIgnore
	private User user;
	
	
	
	@Column
	private DataPlanTypes dataPlanType;
	
//	@Column
	@OneToMany (mappedBy= "dataplan")
	@JsonIgnore
	private List<Device> device;

	public DataPlan() {
		super();
	}

	public DataPlan(int id, User user, DataPlanTypes dataPlanType) {
		super();
		this.id = id;
		this.user = user;
		this.dataPlanType = dataPlanType;
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

	public DataPlanTypes getDataPlanType() {
		return dataPlanType;
	}

	public void setDataPlanType(DataPlanTypes dataPlanType) {
		this.dataPlanType = dataPlanType;
	}

	public List<Device> getDevice() {
		return device;
	}

	public void setDevice(List<Device> device) {
		this.device = device;
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
		return "DataPlan [id=" + id + ", user=" + user + ", dataPlanType=" + dataPlanType + "]";
	}


	
	
	

}
