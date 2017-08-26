package com.util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	//jdbc Connection
	public static Connection getConnectToMysql() 
	{
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			Connection con;
			//establish Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizsystem",
					"root","");
			System.out.println("Successfully established connection");
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
		
		
	}

}
