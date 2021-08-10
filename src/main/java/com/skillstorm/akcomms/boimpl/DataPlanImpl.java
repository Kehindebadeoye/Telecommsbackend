package com.skillstorm.akcomms.boimpl;

import org.springframework.stereotype.Service;

import com.skillstorm.akcomms.bo.Idataplan;
import com.skillstorm.akcomms.model.DataPlan;


@Service
public class DataPlanImpl implements Idataplan{

	@Override
	public double calculateUnlimitedStarter(double price) {
	
		return price + DataPlan.UNLIMITEDSTARTER;
	}

	@Override
	public double calculateUnlimitedExtra(double price) {
		// TODO Auto-generated method stub
		return price + DataPlan.UNLIMITEDEXTRA;
	}

	@Override
	public double calculateUnlimitedElite(double price) {
		// TODO Auto-generated method stub
		return price + DataPlan.UNLIMITEDELITE;
	}

}
