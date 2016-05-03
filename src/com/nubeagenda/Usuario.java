package com.nubeagenda;

import java.util.List;

public class Usuario {
	public int ID;
	public String email;
	public String password;
	public List<Contacto> agenda;
	
	public boolean logIn(){
		return true;
	}
		
	public boolean logOut(){
		return false;
	};
}
