package com.nubeagenda.db;

import java.util.ArrayList;
import java.util.List;

import com.nubeagenda.Usuario;

public class DBmock {
	 private static DBmock instance = null;
	private List<Usuario> listaUsuarios = null;
//	hacer lista de contactos
	protected DBmock() {
		// Exists only to defeat instantiation.

	}

	public static DBmock getInstance() {
		if (instance == null) {
			instance = new DBmock();
		}

		return instance;
	}

	public void initializeData() {
		if (this.listaUsuarios == null) {
			this.listaUsuarios = new ArrayList<Usuario>();

			Usuario tempUsuario = new Usuario();
			tempUsuario.email = "pepe@mail.com";
			// ...poner mas datos del contacto

			listaUsuarios.add(tempUsuario);

		}
	}

	public String getSomeValue() {
		return somevalue;
	}

	public void setSomeValue(String otroValor) {
		this.somevalue = otroValor;
	}

}
