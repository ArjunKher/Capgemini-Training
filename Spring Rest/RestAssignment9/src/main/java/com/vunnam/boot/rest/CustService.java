package com.vunnam.boot.rest;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustService {
	///All requests are restful so no need of any jsp views
		/**
		 *  1. Add a new employee
			2. Searching for specific employee
			3. Deleting an existing employee
			4. Finding all employees
			5. Editing/updating employee information.
		 */
	@Autowired
	private DaoRepo dao;
		public void addCust(Customer employee) {
			dao.save(employee);
		}
		public Optional<Customer> getCustomerByID(long id) {
			return dao.findById(id);
		}
		public void deleteCustById(long id) {
			dao.deleteById(id);
		}
		public List<Customer> getAllCustomers(){
			List<Customer> employees= new ArrayList<>();
			dao.findAll().forEach(employees::add);
			return employees;
		}
		public void updateCustById(long Id, Customer emp) {
			dao.save(emp);
		}
		public String checkAll() {
			return "service is ok";
		}
}
