package com.skillstorm.akcomms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.akcomms.data.DataPlanRepository;
import com.skillstorm.akcomms.model.DataPlan;
import com.skillstorm.akcomms.model.DataPlanTypes;
import com.skillstorm.akcomms.model.Device;


@RestController
@RequestMapping("/dataplans")
@CrossOrigin(origins = "*")
public class DataPlanController {
	
	@Autowired
	DataPlanRepository dataPlanRepository;
	
	@GetMapping("dataplan/{id}")
	public ResponseEntity<DataPlan> findById(@PathVariable("id") Integer id){
		if (id != null) {
			Optional<DataPlan> optional = dataPlanRepository.findById(id);
			return optional.isPresent() ? ResponseEntity.ok(optional.get()) : ResponseEntity.badRequest().build();
			
		}
		return new ResponseEntity<DataPlan>(HttpStatus.BAD_REQUEST);
		
		
	}
	
	@GetMapping
	public ResponseEntity<List<DataPlan>> findAll(DataPlan dataPlan){
		
		return ResponseEntity.ok(dataPlanRepository.findAll());
		
	}
	
	@PostMapping("/dataplan")
	public ResponseEntity<DataPlan> saveDevice(DataPlan dataPlan){
		DataPlan body = dataPlanRepository.save(dataPlan);
		return new ResponseEntity<DataPlan>(body, HttpStatus.CREATED);
	}
	
	@PutMapping("/dataplan/{id}")
	public ResponseEntity<Void> updateDataPlan(@RequestBody DataPlan dataPlan, @PathVariable("id") Integer id){
		if((dataPlan.getId() == id) && dataPlanRepository.findById(dataPlan.getId()).isPresent()) {
			dataPlanRepository.save(dataPlan);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return null;	
	}
	
	@GetMapping("/dataplan/device")
	public ResponseEntity <List<DataPlan>> finAllDevices(@RequestParam(value = "id", required = true) Integer device) {
		if(device != null) {
			return new ResponseEntity<>(dataPlanRepository.findAllByDeviceId(device), HttpStatus.OK);
		}
		return ResponseEntity.ok(dataPlanRepository.findAll());
		
	}
	@GetMapping("/dataplan/user")
	public ResponseEntity <List<DataPlan>> finAllUser(@RequestParam(value = "cid", required = true) Integer user) {
		if(user != null) {
			return new ResponseEntity<>(dataPlanRepository.findAllByUserCid(user), HttpStatus.OK);
		}
		return ResponseEntity.ok(dataPlanRepository.findAll());
		
	}
	
	@DeleteMapping ("/dataplan/{id}")
	public ResponseEntity<Void> deletePlan(@PathVariable("id") Integer id){
		dataPlanRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
