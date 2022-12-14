package com.brunnodanyel.hruser.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brunnodanyel.hruser.entities.User;
import com.brunnodanyel.hruser.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserResources {

	@Autowired
	private UserRepository repository;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		User end = repository.findByEmail(email);
		return ResponseEntity.ok(end);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
}
