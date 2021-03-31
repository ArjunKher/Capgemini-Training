package com.capgemini.RabbitMQAssignment.CustomerService;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.RabbitMQAssignment.Config.MessageConfig;
import com.capgemini.RabbitMQAssignment.Model.Customer;
import com.capgemini.RabbitMQAssignment.Repository.CustomerRepository;



@RestController
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		
		template.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTING_KEY, customer);
		return "Success !!";
	}
	
	@GetMapping("/getCustomers")
	public List<Customer> getCustomers(){
		return repository.findAll();
	}

}
