package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DbConnect {
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		Connection connection;
		String dbURL = "jdbc:mysql://localhost:3306/wious" ;
		String dbDriver = "com.mysql.jdbc.Driver";
		String dbUsername = "root" ;
		String dbPassword = "";
		
		try {
			Class.forName(dbDriver).newInstance();
			connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
				
			if (connection == null || connection.isClosed() ) {
				JOptionPane.showMessageDialog(null, "Error Connection");
			}
			
			return connection ;
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}

	}
}
