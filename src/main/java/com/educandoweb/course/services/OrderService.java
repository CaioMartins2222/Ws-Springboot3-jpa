package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;


@Component
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order>findAll(){
		return repository.findAll();
	}
	
	public Order findByID(Long id) {
		Optional<Order>obj = repository.findById(id);
		return obj.get();
	}

}