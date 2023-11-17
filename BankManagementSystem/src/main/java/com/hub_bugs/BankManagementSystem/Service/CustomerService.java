package com.hub_bugs.BankManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hub_bugs.BankManagementSystem.DAO.CustomerRepository;
import com.hub_bugs.BankManagementSystem.Entity.Customer;

@Service
public class CustomerService {
	@Autowired
CustomerRepository customerrepository;
	public Customer createcustomer(Customer customer)
	{
		return customerrepository.save(customer);
	}
	public Customer getcustomerbyid(Long id)
	{
		return customerrepository.findById(id).get();
	}
	public List<Customer> getAllCustomers()
	{
		return customerrepository.findAll();
	}
	public void deletecustomerbyid(Customer customer)
	{
		customerrepository.delete(customer);
	}
	public Customer updatecustomer(Customer correctcustomer ,Long id)
	{
		Customer customer=customerrepository.findById(id).get();
		if(customer.getName()!= null)
		{
			customer.setName(correctcustomer.getName());
		}
		if(customer.getAge() != null)
		{
			customer.setAge(correctcustomer.getAge());
		}
		if(customer.getAddress()!=null)
		{
			customer.setAddress(correctcustomer.getAddress());
		}
		if(customer.getContact()!=null)
		{
			customer.setContact(correctcustomer.getContact());
		}
		if(customer.getEmail()!=null)
		{
			customer.setEmail(correctcustomer.getEmail());
		}
		return customerrepository.save(customer);
	}
}
