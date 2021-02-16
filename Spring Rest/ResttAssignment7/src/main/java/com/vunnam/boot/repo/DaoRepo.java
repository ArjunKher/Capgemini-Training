package com.vunnam.boot.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vunnam.boot.model.Orders;

@Repository
public interface DaoRepo extends MongoRepository<Orders, String> {
}
