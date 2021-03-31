package com.springrest.boot.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@Autowired
	EmpService service;
	///All requests are restful so no need of any jsp views
	/**
	 *  1. Add a new employee
		2. Searching for specific employee
		3. Deleting an existing employee
		4. Finding all employees
		5. Editing/updating employee information.
		
	 */
	@RequestMapping("check")
	public String check() {
		return "Okay buddy"+service.checkAll();
	}
	@RequestMapping(value="/add",method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void AddEmp(@RequestBody Employee employee) {
		service.AddEmp(employee);
	}
	@RequestMapping(value="/getEmp/{id}")
	public Optional<Employee> getEmployeeByName(@PathVariable long id) {
		return service.getEmployeeByID(id);
	}
	@RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
	public void deleteEmpById(long id) {
		service.deleteEmpById(id);
	}
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updateEmpById(@PathVariable long id, @RequestBody Employee emp) {
		service.updateEmpById(id,emp);
	}
}