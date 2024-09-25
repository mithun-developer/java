package com.db;
import java.sql.*;




public class Jdbc1 {
	public static void main(String args[])throws SQLException {
	/*	Driver d = new Oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		*/
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott", "tiger");
		
		Statement st = c.createStatement();
		st.executeUpdate("create table emp(eno number(3)),ename varchar2(10)");
		
		c.close();
		
	}

}
