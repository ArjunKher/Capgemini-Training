package com.springrest.boot.rest;

import org.springframework.stereotype.Repository;

@Repository
public interface DaoRepo extends CrudRepository<Employee, Long>{
	
}
