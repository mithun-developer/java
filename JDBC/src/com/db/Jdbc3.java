package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc3 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
		Statement st = c.createStatement();
		
		st.executeUpdate("insert into dept(dno,dname,dloc) values(1,'Testing','Hyd')");
		c.close();
		System.out.println("done");
		
		
	}

}
