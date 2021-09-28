package com.rodrigues.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigues.couse.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
