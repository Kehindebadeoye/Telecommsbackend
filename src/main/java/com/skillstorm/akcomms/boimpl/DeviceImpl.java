package com.skillstorm.akcomms.boimpl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.akcomms.data.DeviceRepository;
import com.skillstorm.akcomms.model.Device;

@Service
public class DeviceImpl {
	
	@Autowired
	DeviceRepository deviceRepository;
	
	public Device addDevice(Device device) {
		
		return device;
		
	}
	
//	public long generateNumber() {
//		Random randomNumber = new Random();
		
//		Long randomNumber = (long) (Math.floor(Math.random()*9_000_000_000L)+ 1_000_000_000L);
//		
//		return randomNumber;
//		
//	}
	
//	public long randomNumber() {
//		long newNumber;
//		do {newNumber = generateNumber();	
//		}while(deviceRepository.findAllByNumber(newNumber))
//	}
	
//	public boolean isUnlimitedStarter(String number) {
//		if(number != null) {
//			addSingleNumber(number, 0);
//		}else generateNumber();
//		
//		return false;
//		
//	}
	public String addSingleNumber(String name, double price) {
		
		return null;
		
	}
	
}
