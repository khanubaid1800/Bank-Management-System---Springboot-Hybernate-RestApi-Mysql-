package com.hub_bugs.BankManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hub_bugs.BankManagementSystem.DAO.AccountRepository;
import com.hub_bugs.BankManagementSystem.Entity.Accounts;

@Service
public class AccountService {
        @Autowired
        AccountRepository accountRepository;
        public Accounts createAccount(Accounts accounts)
        {
        	return accountRepository.save(accounts);
        }
        public Accounts getAccountsByNo(Long accno)
        {
        	return accountRepository.findById(accno).get();
        }
        public List<Accounts> getAllAccounts()
        {
        	return accountRepository.findAll();
        }
        public void deleteAccounts(Long accno)
        {
        	accountRepository.deleteById(accno);
        }
        public Accounts updateAccounts(Accounts correctaccounts,Long accno)
        {
        	Accounts accounts=accountRepository.findById(accno).get();
        	if(accounts.getAccholdername()!=null)
        	{
        		accounts.setAccholdername(correctaccounts.getAccholdername());
        	}
        	if(accounts.getBankname()!=null)
        	{
        		accounts.setBankname(correctaccounts.getBankname());
        	}
        	if(accounts.getAcctype()!=null)
        	{
        		accounts.setAcctype(correctaccounts.getAcctype());
        	}
        	if(accounts.getAccbalance()!=null)
        	{
        		accounts.setAccbalance(correctaccounts.getAccbalance());
        	}
        	if(accounts.getAccno()!=null)
        	{
        		accounts.setAccno(correctaccounts.getAccno());
        	}
        	return accountRepository.save(accounts);
        }
}