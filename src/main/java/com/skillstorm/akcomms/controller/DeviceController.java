package com.skillstorm.akcomms.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.akcomms.model.Device;
import com.skillstorm.akcomms.model.User;

@RestController
@RequestMapping ("/devices")
public class DeviceController {
	
	@GetMapping
	public ResponseEntity <List<Device>> finAllDevices(@RequestParam(value = "", required = false) User user) {
		
		
		return null;
		
	}
	@PostMapping("/device")
	public ResponseEntity<Device>saveDevice(Device device){
		
		return null;
		
		
	}
	
	@PutMapping("/device/{id}")
	public ResponseEntity<Void>updateDeviceNumber(@RequestBody Device device, @PathVariable("id") Integer id){
		
		return null;
		
	}
	@PutMapping("/device/")
	public ResponseEntity<Device>addDataPlanToDevice(@RequestBody Device device, @PathVariable("id") Integer id){
		
		return null;
		
	}
	
	@DeleteMapping ("/device/remove")
	public ResponseEntity<Void> removeDevice(Integer id){
		
		return null;
		
		
	}

}
