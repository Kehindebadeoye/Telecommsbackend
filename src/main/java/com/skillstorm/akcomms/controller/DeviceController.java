package com.skillstorm.akcomms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.skillstorm.akcomms.data.DeviceRepository;
import com.skillstorm.akcomms.data.UserRepository;
import com.skillstorm.akcomms.model.DataPlan;
import com.skillstorm.akcomms.model.Device;
import com.skillstorm.akcomms.model.User;

@RestController
@RequestMapping ("/devices")
public class DeviceController {
	
	@Autowired
	DeviceRepository deviceRepository;
	
//	@GetMapping
//	public ResponseEntity <List<Device>> finAllDevices(@RequestParam(value = "deviceprice", required = false) Double price) {
//		if(price != null) {
//			return new ResponseEntity<>(deviceRepository.findByOrderByPrice(price), HttpStatus.OK);
//		}
//		return ResponseEntity.ok(deviceRepository.findAll());
//		
//	}
	@GetMapping("/device/{id}")
	public ResponseEntity<Device> findById(@PathVariable("id") Integer id){
		if (id != null) {
			Optional<Device> optional = deviceRepository.findById(id);
			return optional.isPresent() ? ResponseEntity.ok(optional.get()) : ResponseEntity.badRequest().build();
		}
		return new ResponseEntity<Device>(HttpStatus.BAD_REQUEST);
		
		
	}
	@PostMapping("/device")
	public ResponseEntity<Device> saveDevice(Device device){
		Device body = deviceRepository.save(device);
		return new ResponseEntity<Device>(body, HttpStatus.CREATED);
	}
	
	@PutMapping("/device/{id}")
	public ResponseEntity<Void> updateDevice(@RequestBody Device device, @PathVariable("id") Integer id){
		if((device.getId() == id) && deviceRepository.findById(device.getId()).isPresent()) {
			deviceRepository.save(device);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return null;
		
	}
	@PutMapping("/device/")
	public ResponseEntity<Device> addDataPlanToDevice(@RequestBody Device device, @PathVariable("id") Integer id){
		Device body = deviceRepository.save(device);
		return new ResponseEntity<Device>(body, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping ("/device/{id}")
	public ResponseEntity<Void> removeDevice(@PathVariable("id") Integer id){
		deviceRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
