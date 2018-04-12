package com.curso.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.curso.projeto1.entity.User;
import com.curso.projeto1.repository.UserRepository;

import ch.qos.logback.core.net.SyslogOutputStream;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>  {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Entrou aquiiiiiiiii!!!!!!!!!");
		
		List<User> users = userRepository.findAll();
		
		if(users.isEmpty()) {
			
			createUser("Gui", "mopa@email.com");
			createUser("Gui2", "mopa1@email.com");
			createUser("Gui3", "mopa2@email.com");
		}
		
		User user = userRepository.getOne(1L);
		
		user.setName("Guilherme");
		
		userRepository.save(user);
	
		
		
	}
	
	public void createUser(String name, String email) {
		
		User user = new User(name, email);
		userRepository.save(user);
		
	}

}


