package com.curso.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
