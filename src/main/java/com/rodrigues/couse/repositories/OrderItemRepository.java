package com.rodrigues.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigues.couse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
