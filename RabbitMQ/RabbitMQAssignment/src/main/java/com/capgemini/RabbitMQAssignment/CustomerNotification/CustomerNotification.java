package com.capgemini.RabbitMQAssignment.CustomerNotification;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.RabbitMQAssignment.Config.MessageConfig;
import com.capgemini.RabbitMQAssignment.Model.Customer;
import com.capgemini.RabbitMQAssignment.Repository.CustomerRepository;


@Component
public class CustomerNotification {
	
	@Autowired
	private CustomerRepository repository;

	@RabbitListener(queues=MessageConfig.QUEUE)
	public void consumeMessageFromQueue(Customer customer){
		repository.save(customer);
		
	}
}
