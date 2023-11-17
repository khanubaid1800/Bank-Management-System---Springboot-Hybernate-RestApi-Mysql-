package com.hub_bugs.BankManagementSystem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hub_bugs.BankManagementSystem.Entity.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, Long>{

}
