package com.Qa.account_application;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import com.google.gson.Gson;

public class Service{
	
	private String jsonString;
	
	private Map<Integer, Account> account = new HashMap<Integer, Account>();
	
	public void addAccount(Account newAccount){
		
		account.put(newAccount.getAccountNumber(), newAccount );
		
	}
	
	
	public void retriveAccount(Account accountNumber){
		
		account.get(accountNumber);
	
	}
	
	public void convertToJson(Account convertAccount) {
		
		 jsonString = new Gson().toJson(convertAccount);
		 
	}
	
	public void printJson() {
		
		System.out.println(jsonString);
		
	}
	
	public int searchAccounts(String searchName) {
	
		
		
	return (int) account.values().stream()
	.filter(x -> x.getFirstName().equals(searchName)).count();
	
	
	
}
	
}
