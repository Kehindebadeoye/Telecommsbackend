package com.skillstorm.akcomms.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
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
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@PostMapping(value = "/user")
	public ResponseEntity<User> save(@RequestBody @Valid User user) {
		User body = userRepository.save(user);
		return new ResponseEntity<User>(body, HttpStatus.CREATED);
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> findById(@PathVariable("id") Integer id) {
		if (id != null) {
			Optional<User> optional = userRepository.findById(id);
			return optional.isPresent() ? ResponseEntity.ok(optional.get()) : ResponseEntity.badRequest().build();
		}
		return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(User user){
		
		return ResponseEntity.ok(userRepository.findAll());
		
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<Void> update(@RequestBody User user, @PathVariable("id") Integer id) {
		if ((user.getCid() == id) && userRepository.findById(user.getCid()).isPresent()) {
			userRepository.save(user);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		userRepository.deleteById(id);

		return new ResponseEntity<>(HttpStatus.OK);

	}

}
