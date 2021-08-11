package com.skillstorm.akcomms.boimpl;

import org.springframework.stereotype.Service;

import com.skillstorm.akcomms.model.Device;

@Service
public class DeviceImpl {
	
	public Device addDevice(Device device) {
		
		return device;
		
	}
	
	public Integer generateNumber() {
		
		return null;
		
	}
	
	public boolean isUnlimitedStarter(String number) {
		if(number != null) {
			addSingleNumber(number, 0);
		}else generateNumber();
		
		return false;
		
	}
	public String addSingleNumber(String name, double price) {
		
		return null;
		
	}
}
