package com.hub_bugs.BankManagementSystem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hub_bugs.BankManagementSystem.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
