package com.vunnam.boot.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vunnam.boot.model.Products;

@Repository
public interface DaoRepo extends MongoRepository<Products, String> {
}
