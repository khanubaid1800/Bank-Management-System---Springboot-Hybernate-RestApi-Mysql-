package com.hub_bugs.BankManagementSystem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hub_bugs.BankManagementSystem.Entity.Employee;

public interface employeeRepository extends JpaRepository<Employee, Long> {

}
