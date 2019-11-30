package com.belalsoft.onlineshoppingbackend;

import java.sql.*;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
       Class.forName("org.h2.Driver");
       
       Connection conn=
     
                DriverManager.getConnection("jdbc:h2:tcp://localhost/~/shopping", "sa", "");
     
      
        	System.out.println("connection succesful");
    
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    		System.out.println("something wroing");
			// TODO: handle exception
		}
    }
}
