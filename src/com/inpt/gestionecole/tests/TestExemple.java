package com.inpt.gestionecole.tests;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.models.TestModelExemple;

// it's only a class for testing the database exemples here an exemple of how to do it
public class TestExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestModelExemple student = new TestModelExemple();
		Connection conn = Connexion.getConnection();
		String sql_select = "Select * From test";
		try {
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery(sql_select);
			while (results.next()) {

				TestModelExemple stdObject = new TestModelExemple();
				stdObject.setId(Integer.valueOf(results.getString("id")));
				stdObject.setName(results.getString("name"));
				System.out.println(
						"the student is => id is : " + stdObject.getId() + " and the name is : " + stdObject.getName());

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
