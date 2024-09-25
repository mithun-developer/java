package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc4 {

	public static void main(String args[]) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
			Statement st = c.createStatement();
			
			
			
			ResultSet rs = st.executeQuery("select * from emp");
			System.out.println("ename"+" "+"eno"+" "+"eloc"+" "+"ejob");
		while(rs.next()) {
			
			System.out.println(rs.getString("ename")+" "+rs.getInt("eno")+" "+rs.getString("eloc")+" "+rs.getString("ejob"));	
		}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
