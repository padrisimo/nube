package com.nubeagenda.db;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.nubeagenda.Contacto;
import com.nubeagenda.Usuario;

public class DBmock {
	private static DBmock instance = null;
	private List<Usuario> listaUsuarios = null;
	private List<Contacto> listaContactos = null;
	private static Logger logger=Logger.getLogger("DBMock");

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
	
	public int checarUsuario (String mail,String password){
		
		for (int i =0; i< listaUsuarios.size(); i++ ){
//			logger.log(Level.INFO, listaUsuarios.get(i).email+":"+listaUsuarios.get(i).password);
			if(listaUsuarios.get(i).email.equals(mail) && listaUsuarios.get(i).password.equals(password) ){
				return listaUsuarios.get(i).ID;
			}
		}
		
		return 0;
	}
	
	public Usuario getuserbyID (int uid){
		
		for (int i =0; i< listaUsuarios.size(); i++ ){
//			logger.log(Level.INFO, listaUsuarios.get(i).email+":"+listaUsuarios.get(i).password);
			if( listaUsuarios.get(i).ID == uid ){
				return listaUsuarios.get(i);
			}
		}
		
		return null;
	}

}
