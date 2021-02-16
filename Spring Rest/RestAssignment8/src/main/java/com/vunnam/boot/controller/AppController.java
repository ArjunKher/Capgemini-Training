package com.vunnam.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vunnam.boot.model.Products;
import com.vunnam.boot.service.ServiceClass;

@RestController
public class AppController {
	/*
	1. A user can place an order
	2. A user can update an order
	3. A user can view specific order
	4. A user can view all the orders
	5. A user can delete a specific order.*/
	@Autowired
	ServiceClass service;
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public void addProd(@RequestBody Products product) {
		service.placeProduct(product);
	}
	
	@RequestMapping(value="/updateProduct/{id}",method=RequestMethod.PUT)
	public void updateProd(@PathVariable String id, @RequestBody Products product) {
		service.updateProduct(id, product);
	}
	@RequestMapping(value="/find/{id}",method=RequestMethod.GET)
	public Optional<Products> viewProd(@PathVariable String id) {
		return service.viewProduct(id);
	}
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Products> viewProds() {
		return service.viewProducts();
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void deleteOrder(@PathVariable String id) {
		service.deleteProducts(id);
	}
}
