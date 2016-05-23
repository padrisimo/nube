package com.nubeagenda;

import java.util.List;

public class Usuario {
	public int ID;
	public String email;
	public String password;
	public int[] agenda;
	
	public boolean logIn(){
		return true;
	}
		
	public boolean logOut(){
		return false;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int[] getAgenda() {
		return agenda;
	}

	public void setAgenda(int[] agenda) {
		this.agenda = agenda;
	};
}
