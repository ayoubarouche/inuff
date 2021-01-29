package com.inpt.gestionecole.shared;

public interface UserController {
	public String login(String username, String password);

	public String register(User user);
}
