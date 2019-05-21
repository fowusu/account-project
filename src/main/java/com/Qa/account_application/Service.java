package com.Qa.account_application;

import java.util.HashMap;
import java.util.Map;

public class Service{

	private Map<Integer, Account> account = new HashMap<>();
	
	public void addAccount(Account newAccount){
		
		account.put(newAccount.getAccountNumber(), newAccount );
		
	}
	
	public void retriveAccount(Account accountNumber){
		
		account.get(accountNumber);
	
	}
	
	
}
