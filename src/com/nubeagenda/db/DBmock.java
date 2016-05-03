package com.nubeagenda.db;

import java.util.ArrayList;
import java.util.List;

import com.nubeagenda.Contacto;
import com.nubeagenda.Usuario;

public class DBmock {
	private static DBmock instance = null;
	private List<Usuario> listaUsuarios = null;
	private List<Contacto> listaContactos = null;

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
			tempUsuario.email = "pepito@mail.com";
			tempUsuario.ID = 1;
			tempUsuario.password = "admin";
			tempUsuario.agenda=null;
			// ...poner mas datos del contacto

			listaUsuarios.add(tempUsuario);

		}
	}



}
