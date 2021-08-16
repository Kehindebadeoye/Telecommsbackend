//package com.skillstorm.akcomms.boimpl;
//
//import org.springframework.stereotype.Service;
//
//import com.skillstorm.akcomms.bo.Idataplan;
//import com.skillstorm.akcomms.model.DataPlan;
//
//
//@Service
//public class DataPlanImpl implements Idataplan{
//
//	@Override
//	public double calculateUnlimitedStarter(double totalPrice) {
//	
//		return totalPrice + DataPlan.UNLIMITEDSTARTER;
//	}
//
//	@Override
//	public double calculateUnlimitedExtra(double totalPrice) {
//		// TODO Auto-generated method stub
//		return totalPrice + DataPlan.UNLIMITEDEXTRA;
//	}
//
//	@Override
//	public double calculateUnlimitedElite(double totalPrice) {
//		// TODO Auto-generated method stub
//		return totalPrice + DataPlan.UNLIMITEDELITE;
//	}
//	
//	public void planLogic(String dataplan) {
//		switch(dataplan) {
//		case "UNLIMITEDSTARTER": {
//			//add one device only
//			break;
//		}
//		case "UNLIMITEDEXTRA": {
//			//limit device to 2
//			break;
//		}
//		case "UNLIMITEDELITE" : {
//			// limit device to 3
//		}
//		break;
//		}
//		
//	}
//}
