package com.example.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.customException.ResourceNotFoundException;
import com.example.crud.model.Employee;
import com.example.crud.repository.EmployeeRespository;

@RestController
@RequestMapping("/emp")
@CrossOrigin
public class EmployeeController {

	@Autowired
	private EmployeeRespository employeeRespository;

	/*
	 * Get all the employees list
	 */
	@GetMapping("employees")
	public List<Employee> getAllEmployees() {
		return employeeRespository.findAll();
	}

	/*
	 * Create new employee
	 */
	@PostMapping("employees")
	public Employee createEmployee(@RequestBody Employee emp) {
		return employeeRespository.save(emp);

	}

	/*
	 * Get employee by id
	 */

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) throws ResourceNotFoundException {

		Employee emp = employeeRespository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id" + id));

		return ResponseEntity.ok(emp);
	}
	
	/*
	 * Update employee using id
	 */
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
		
		Employee emp = employeeRespository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id" + id));
		emp.setFirstName(employeeDetails.getFirstName());
		emp.setLastName(employeeDetails.getLastName());
		emp.setEmail(employeeDetails.getEmail());
		emp.setDesignation(employeeDetails.getDesignation());
		
		Employee newEmployee = employeeRespository.save(emp);
		return ResponseEntity.ok(newEmployee);
	
	}
	
	/*
	 * Delete employee by id
	 */
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployeeById(@PathVariable Long id) throws ResourceNotFoundException
	{
		Employee emp = employeeRespository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id" + id));
		employeeRespository.delete(emp);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
