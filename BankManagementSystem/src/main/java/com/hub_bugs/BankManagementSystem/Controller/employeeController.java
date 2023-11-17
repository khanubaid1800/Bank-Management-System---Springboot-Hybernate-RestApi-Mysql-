package com.hub_bugs.BankManagementSystem.Controller;

import java.util.List;

import javax.xml.transform.ErrorListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hub_bugs.BankManagementSystem.Entity.Employee;
import com.hub_bugs.BankManagementSystem.Service.employeeService;

@RestController
@RequestMapping("/Employee")
public class employeeController {
	
	@Autowired
	employeeService empservice;
	
	@PostMapping("/save")
	private Employee saveEmployee( @RequestBody Employee employee)
	{
		return empservice.saveEmployee(employee);
	}
	
	@GetMapping("FindById/{id}")
	private Employee findById(@PathVariable Long id)
	{
		return empservice.findById(id);
	}
	@GetMapping("/FindAll")
	private List<Employee> findAll()
	{
		return empservice.findAll();
	}
	@DeleteMapping("/Delete/{id}")
	private String deleteEmployee(@PathVariable Long id)
	{
		 empservice.deleteEmployee(id);
		 return "Employee Data Deleted Successfully";
		
	}
	@PutMapping("/update/{id}")
	private Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id)
	{
		return empservice.updateEmployee(employee, id);
	}

}
