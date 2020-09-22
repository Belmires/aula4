package br.com.control;

import br.com.model.User;

public class UserLoger {
	
	public boolean validacaoLogin(String login, String senha) {
		
		User user = dummyUser();
		
		return user.getLogin().equals(login) && user.getSenha().equals(senha);
		
	}

	public User dummyUser() {
		return new User ("teste", "teste");
	}
		
	
	
}
