package com.hub_bugs.BankManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hub_bugs.BankManagementSystem.Entity.Customer;
import com.hub_bugs.BankManagementSystem.Service.CustomerService;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	@Autowired
	CustomerService customerservice;
	@PostMapping("/save")
	public Customer createcustomer(@RequestBody Customer customer)
	{
		return customerservice.createcustomer(customer);
	}
	@GetMapping("/findby/{id}")
  public Customer getcustomerbyid(@PathVariable Long id)
  {
	  return customerservice.getcustomerbyid(id);
  }
	@GetMapping("/findAll")
	public List<Customer> getAllCustomers()
	{
		return customerservice.getAllCustomers();
	}
	@DeleteMapping("/deleteby/{id}")
	public String deletecustomerbyid(Customer customer)
	{
		customerservice.deletecustomerbyid(customer);
		return "Customer Deleted Successfully";
	}
	@PutMapping("/updatebyid/{id}")
	public Customer updatecustomer(@RequestBody Customer customer, @PathVariable Long id)
	{
		return customerservice.updatecustomer(customer, id);
		
		
	}
}