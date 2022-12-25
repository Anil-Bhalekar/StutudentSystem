package com.studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class cp {
	
  static  Connection con;
    
    public static Connection createC() {
    try {
    	 //load the driver 
    	Class.forName("com.mysql.jdbc.Driver");
    	
    	//create the connection...
    	String user = "root";
    	String password = "anilbhalekar123";
    	String url ="jdbc:mysql://localhost:3306/student_manage";
    	
    	con = DriverManager.getConnection(url, user, password);
    	
    } catch (Exception e) {
    	e.printStackTrace();
    }
	return con;
}
}
