package com.curso.projeto1.entity;

import java.util.Set;
import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String email;
	
	@ManyToMany
	private Set<Role> roles;
	
	public User() {
	}
	
	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
