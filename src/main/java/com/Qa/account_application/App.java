package com.Qa.account_application;

public class App 
{
	
    public static void main( String[] args )
    
    {
        System.out.println( "Hello World to the standard out" );
        
        Account smn = new Account("farhan","owusu",1);  
        Account smn1 = new Account("john","doe",2); 
        
        Service smn2 = new Service();  
        Service smn3 = new Service(); 
        
        smn2.convertToJson(smn);
        smn3.convertToJson(smn1);
        
        smn2.printJson();
        smn3.printJson();
        
    }
    
}


