package com.rodrigues.couse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigues.couse.entities.Product;
import com.rodrigues.couse.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		
		List<Product> list = repository.findAll();
		return list;
		
	}
	
	public Product findById(Long id){
		
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}
	
}
