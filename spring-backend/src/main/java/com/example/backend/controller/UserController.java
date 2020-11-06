package com.example.backend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;

//@CrossOrigin( origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@CrossOrigin( origins = "http://localhost:3000")
	@GetMapping("users")
	public List<User> getUser(){
		return this.userRepository.findAll();
	}

}
