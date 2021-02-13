package com.inpt.gestionecole.config;

// the connexion class connect to database 
// and it's contains only one public method to use wich is getconnection that return the connection to database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
	private static String dbhost = "jdbc:mysql://localhost:3306/test";
	private static String username = "root";
	private static String password = "hello";
	private static Connection conn = null;
	private static Statement st = null;

	private static Connection createConnection() {
		try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbhost, username, password);
		} catch (Exception e) {
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
	public static void disconnect()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int Maj(String sql)
	{
		int nb=0;
		try {
			st = getConnection().createStatement();
			nb= st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nb;
	}
	public static ResultSet select(String sql)
	{
		ResultSet rs=null;
		try {
			st = getConnection().createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
