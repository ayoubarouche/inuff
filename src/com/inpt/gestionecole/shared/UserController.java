package com.inpt.gestionecole.shared;

import java.security.SecureRandom;

public class UserController {
	static char[] allowedCharacters = {'a','b','c','1','2','3','4'};

	public static String generatePassword(){
		SecureRandom random = new SecureRandom();
		StringBuffer password = new StringBuffer();

		for(int i = 0; i < 6; i++) {
		    password.append(allowedCharacters[ random.nextInt(allowedCharacters.length) ]);
		}
		return password.toString();
	};
	public static String generateUsername(String username , String password) {
		return username+"_"+password;
	}
}
