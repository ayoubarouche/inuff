package com.inpt.gestionecole.shared;

public interface UserController {
	public void login(String username, String password);

	public void register(User user);
}
