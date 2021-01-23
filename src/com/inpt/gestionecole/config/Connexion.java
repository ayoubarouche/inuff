package com.inpt.gestionecole.config;

// the connexion class connect to database 
// and it's contains only one public method to use wich is getconnection that return the connection to database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	private static String dbhost = "jdbc:mysql://localhost:3306/projetjee";
	private static String username = "root";
	private static String password = "hello";
	private static Connection conn = null;

	private static Connection createConnection() {
		try {
			conn = DriverManager.getConnection(dbhost, username, password);
		} catch (SQLException e) {
			System.out.println("Cannot create database connection");
			e.printStackTrace();
		}
		return conn;
	}

	public static Connection getConnection() {
		if (conn == null)
			return createConnection();
		return conn;
	}
}
