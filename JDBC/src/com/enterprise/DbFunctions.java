package com.enterprise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DbFunctions {
	
	/**
	 * @author Hugo_Braga
	 * Create the data base.
	 */
	public Connection connect_to_db(String dbname, String user, String pass) {
		Connection connect = null;

		try {
			Class.forName("org.postgresql.Driver");
			connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
			if (connect != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Connection Failed");
			}

		} catch (Exception e) {
			System.err.println(e);
		}

		return connect;

	}
	
	/**
	 * @author Hugo_Braga
	 * Create tables
	 */
	public void createTable(Connection connection, String tableName) {
		Statement statement;
		try {
			String query = "create table " + tableName
					+ "(empId SERIAL, name varchar(200), address varchar(200), primary key(empId));";
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Table created");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	/**
	 * 
	 * @author Hugo_Braga
	 * Insert data into the tables
	 */
	public void insertRow(Connection connection, String tableName, String name, String  address) {
		Statement statement;
		try {
			String query = String.format("insert into %s(name,address) values ('%s', '%s');", tableName, name, address);
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Row inserted");
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}
	
	/**
	 * 
	 * @author Hugo_Braga
	 * Consults everything inside the table
	 */
	public void readData(Connection connection, String tableName) {
		Statement statement;
		ResultSet rs = null;
		try {
			String query = String.format("select * from %s", tableName);
			statement =  connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getString("empId") + " ");
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getString("address") + "\n");
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	
	public void updateName(Connection connection, String tableName, String oldName, String newName) {
		Statement statement;
		try {
			String query = String.format("update %s set name = '%s' where name = '%s';", tableName, newName, oldName);
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Data Updated");
		} catch (Exception e) {
			System.err.println(e);		
		}
	}
	
	
	public void serachByName(Connection connection, String tableName, String name) {
		Statement statement;
		ResultSet rs = null;
		try {
			String query = String.format("select * from %s where name = '%s';", tableName, name);
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("empId") + " ");
				System.out.println(rs.getString("name") + " ");
				System.out.println(rs.getString("address") + " ");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	
	public void serachById(Connection connection, String tableName, int id) {
		Statement statement;
		ResultSet rs = null;
		try {
			String query = String.format("select * from %s where empid = '%s';", tableName, id);
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("empId") + " ");
				System.out.println(rs.getString("name") + " ");
				System.out.println(rs.getString("address") + " ");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	
	public void deleteRowByName(Connection connection, String tableName, String name) {
		Statement statement;
		try {
			String query = String.format("delete from %s where name = '%s';", tableName, name);
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Data removed");
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	
	public void deleteRowById(Connection connection, String tableName, int id) {
		Statement statement;
		try {
			String query = String.format("delete from %s where empid = '%s';", tableName, id);
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Data removed");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	
	public void deleteTable(Connection connection, String tableName) {
		Statement statement;
		try {
			String query = String.format("drop table %s;", tableName);
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Table deleted succefully");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}