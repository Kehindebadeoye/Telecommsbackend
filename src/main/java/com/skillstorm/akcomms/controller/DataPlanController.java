package com.skillstorm.akcomms.controller;

import java.util.List;

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

import com.skillstorm.akcomms.data.DataPlanRepository;
import com.skillstorm.akcomms.model.DataPlan;
import com.skillstorm.akcomms.model.DataPlanTypes;

@RestController
@RequestMapping("/dataplans")
public class DataPlanController {
	
	@Autowired
	DataPlanRepository dataPlanRepository;
	
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
	
//	@GetMapping
//	public ResponseEntity <List<DataPlan>> finAllDevices(@RequestParam(value = "deviceprice", required = false) DataPlanTypes dataPlanType) {
//		if(dataPlanType != null) {
//			return new ResponseEntity<>(dataPlanRepository.findByOrderByDataPlanType(dataPlanType), HttpStatus.OK);
//		}
//		return ResponseEntity.ok(dataPlanRepository.findAll());
//		
//	}
	
	@DeleteMapping ("/dataplan/{id}")
	public ResponseEntity<Void> deletePlan(@PathVariable("id") Integer id){
		dataPlanRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
