package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;

@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Rizky","Dwi","rizky@gmail.com"));
		this.userRepository.save(new User("Niky","Wulandari","wulan@gmail.com"));
		this.userRepository.save(new User("Test","Dwi","test@gmail.com"));
		
		
	}

}
