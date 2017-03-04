package com.database;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;

public class Database_selenium_DDL {
	private Connection connection;
	private static Statement statement;
	private static int rs;

	@BeforeClass
	public void setUp() {
		String databaseURL = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "rvs@1234";
		connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to Database...");
			connection = DriverManager.getConnection(databaseURL, user, password);
			if (connection != null) {
				System.out.println("Connected to the Database...");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void getEmployeesFromDataBase() {
		try {
			
			// Query for update
			String query = "update emp set Name='Robert' where ID=967";
			statement = connection.createStatement();
			rs = statement.executeUpdate(query);
			System.out.println("Number of records updated is" +rs);

			// Query to Execute
			String query1 = "select * from emp;";
			// Execute the SQL Query. Store results in ResultSet
			ResultSet rs = statement.executeQuery(query1);
			while (rs.next()) {
				int ID = rs.getInt("ID");
				String Name = rs.getString("NAME");
				String Company = rs.getString("Company");;
				System.out.println(ID + "\t" + Name + "\t" + Company );
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
		if (connection != null) {
			try {
				System.out.println("Closing Database Connection...");
				connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
