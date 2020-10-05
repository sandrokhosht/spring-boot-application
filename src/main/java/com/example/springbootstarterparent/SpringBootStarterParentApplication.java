package com.example.springbootstarterparent;

import com.example.springbootstarterparent.repository.UserRepository;
import com.example.springbootstarterparent.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarterParentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterParentApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String...args) throws Exception {
		this.userRepository.save(new User("Aleksandre", "Khoshtaria", "sandrokhosht@gmail.com"));
		this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
		this.userRepository.save(new User("Tony", "Stark", "tony@gmail.com"));
	}
}
