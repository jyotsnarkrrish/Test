package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Database_selenium_Select {
	@Test
	public static void Database() throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/employee";

		// Query to Execute
		// String query = "select * from emp;";
		// String query="select company from emp";
		String query = "select distinct company from emp";
		
		
		// Load mysql jdbc driver
		Class.forName("com.mysql.jdbc.Driver");

		// Create Connection to DB
		Connection con = DriverManager.getConnection(dbUrl, "root", "rvs@1234");

		// Create Statement Object
		Statement stmt = con.createStatement();

		// Execute the SQL Query. Store results in ResultSet
		ResultSet rs = stmt.executeQuery(query);

		// While Loop to iterate through all data and print results
		while (rs.next()) {
			// String Name = rs.getString(1);
			String Company = rs.getString("Company");
			// String ID = rs.getString(3);
			System.out.println(Company);
			// System.out.println(Name + " " + Company + " " + ID);
		}
		// closing DB Connection
		con.close();
	}

}
