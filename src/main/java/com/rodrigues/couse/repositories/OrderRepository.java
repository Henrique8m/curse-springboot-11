package com.rodrigues.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigues.couse.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
