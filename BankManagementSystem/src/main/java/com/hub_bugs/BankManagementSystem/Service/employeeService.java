package com.hub_bugs.BankManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hub_bugs.BankManagementSystem.DAO.employeeRepository;
import com.hub_bugs.BankManagementSystem.Entity.Employee;

@Service
public class employeeService {
	
	@Autowired
	employeeRepository Repo;
	
	public Employee saveEmployee(Employee employee)
	{
		return Repo.save(employee);
	}
	public Employee findById(Long id)
	{
		return Repo.findById(id).get();
	}
	public List<Employee> findAll()
	{
		return Repo.findAll();
	}
	public void deleteEmployee(Long id) {
		Repo.deleteById(id);
	}
	public Employee updateEmployee(Employee correctemployee,Long id)
	{
		Employee emp =Repo.findById(id).get();
		if(emp.getName() != null)
		{
			emp.setName(correctemployee.getName());
		}
		if(emp.getAddress() != null)
		{
			emp.setAddress(correctemployee.getAddress());
		}
		if(emp.getContact() != null)
		{
			emp.setContact(correctemployee.getContact());
		}
		if(emp.getSalary() != null)
		{
			emp.setSalary(correctemployee.getSalary());
		}
		return Repo.save(emp);
		
		
	}

}
