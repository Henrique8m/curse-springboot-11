package com.rodrigues.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigues.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
