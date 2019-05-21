package com.Qa.account_application;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class Service{

	private Map<Integer, Account> account = new HashMap<>();
	
	public void addAccount(Account newAccount){
		
		account.put(newAccount.getAccountNumber(), newAccount );
		
	}
	
	public void retriveAccount(Account accountNumber){
		
		account.get(accountNumber);
	
	}
	
	public void convertToJson(Account convertAccount) {
		
		 String jsonString = new Gson().toJson(convertAccount);
		 
		 System.out.println(jsonString);
		
	}
	
	
}
