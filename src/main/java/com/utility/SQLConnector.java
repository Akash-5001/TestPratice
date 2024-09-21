package com.utility;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnector {

	
	public static void SQLConnetor() throws SQLException {
	
		String url="jdbc:mysql://localhost:3306/employees";
	    String user="root";
	    String password="Akash@123";
	    
	    String query="select * from employees";
	    
		//Estabilized Connetion
		Connection connection = DriverManager.getConnection(url, user, password);
		
		//Create a Statement
		Statement statement = connection.createStatement();
		ResultSet result =statement.executeQuery(query);
	
		while (result.next()) {
			int empno = result.getInt(1);
			System.out.println(empno);
			Date date = result.getDate(2);
			System.out.println(date);
		}
		
	}
	
	    public static void main(String[] args) {
			;
			
		}

		
	}
