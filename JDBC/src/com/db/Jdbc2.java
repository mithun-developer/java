package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc2 {
	
	public static void main(String args[]) {
		
		
		System.out.println("strt");
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/test","root","admin");  

			
			
					Statement st = con.createStatement();
			st.executeUpdate("create table emp1(ename varchar(10))");
			con.close();
			
			
			System.out.println("done");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
