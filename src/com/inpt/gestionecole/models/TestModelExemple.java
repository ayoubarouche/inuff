package com.inpt.gestionecole.models;

// its a model for testing the connexion to database view the com.inpt.gestionecole.tests.TestExemple class
public class TestModelExemple {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TestModelExemple() {
		// TODO Auto-generated constructor stub
	}

	public TestModelExemple(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
