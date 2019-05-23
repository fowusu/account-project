package com.Qa.account_application;

public class App 
{
	
    public static void main( String[] args )
    
    {
        System.out.println( "Hello World to the standard out" );
        
        Account smn1 = new Account("john","doe",1234); 
        Account smn = new Account("Jane","Doe",1235);  
        Account jim = new Account("Jim","Tayor",1236);  
        
          
         
        Service smn2 = new Service();
        Service smn3 = new Service();
        Service jim1 = new Service(); 
        
        smn2.convertToJson(smn);
        smn3.convertToJson(smn1);
        jim1.convertToJson(jim);
        
        smn2.printJson();
        smn3.printJson();
        jim1.printJson();
        
    }
    
}


