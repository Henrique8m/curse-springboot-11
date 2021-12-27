package com.rodrigues.couse.services;

import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigues.couse.entities.User;
import com.rodrigues.couse.repositories.UserRepository;
import com.rodrigues.couse.services.exception.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		
		List<User> list = userRepository.findAll();
		return list;
		
	}
	
	public User findById(Long id) {
		
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
	
	public User insert(User obj) {
		
		return userRepository.save(obj);
		
	}
	
	public void delete(Long id) {
		
		userRepository.deleteById(id);
		
	}
	
	public User update(Long id, User obj) {
		
		User entity = userRepository.getOne(id); //get one monitora o objeto a ser alterado, e nao o tras como o getid
		updateData(entity, obj);
		return userRepository.save(entity);
		
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
	
}
