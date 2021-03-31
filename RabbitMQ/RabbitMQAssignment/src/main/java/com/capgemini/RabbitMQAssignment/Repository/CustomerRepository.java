package com.capgemini.RabbitMQAssignment.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.RabbitMQAssignment.Model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer>{

}
