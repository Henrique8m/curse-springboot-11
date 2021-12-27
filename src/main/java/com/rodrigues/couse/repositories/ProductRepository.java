package com.rodrigues.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigues.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
