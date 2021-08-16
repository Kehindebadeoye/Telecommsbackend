package com.skillstorm.akcomms.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.akcomms.model.DataPlan;
import com.skillstorm.akcomms.model.DataPlanTypes;
import com.skillstorm.akcomms.model.Device;

@Repository
public interface DataPlanRepository extends JpaRepository<DataPlan, Integer> {
	
	public List<DataPlan> findAllByDeviceId(Integer device);
	
	public List<DataPlan> findAllByUserCid(Integer user);


}
