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
			
			inicializeUsuarios();
			inicializeContactos();
		}
	}
	public void inicializeUsuarios(){
		this.listaUsuarios = new ArrayList<Usuario>();

		Usuario tempUsuario = new Usuario();
		tempUsuario.ID = 1;
		tempUsuario.email = "pepito@mail.com";
		tempUsuario.password = "admin";
		tempUsuario.agenda=new int[]{1,2};

		listaUsuarios.add(tempUsuario);
		
		
		
		tempUsuario = new Usuario();
		tempUsuario.ID = 2;
		tempUsuario.email = "pepito2@mail.com";
		tempUsuario.password = "admin";
		tempUsuario.agenda=new int[]{3};

		listaUsuarios.add(tempUsuario);
		
		
	}
	public void inicializeContactos(){
		//inincializar la lista de contactos
		this.listaContactos = new ArrayList<Contacto>();
		
		Contacto tempContacto = new Contacto();
		tempContacto.id=1;
		tempContacto.nombre = "Fulano de Tal";
		tempContacto.telefono = 555777888;
//		...
		this.listaContactos.add(tempContacto);
		
		
		tempContacto = new Contacto();
		tempContacto.id=2;
		tempContacto.nombre = "Padrisimo Coder";
		tempContacto.telefono = 985008003;
//		...
		this.listaContactos.add(tempContacto);
		
		tempContacto = new Contacto();
		tempContacto.id=3;
		tempContacto.nombre = "Menganito de Cual";
		tempContacto.telefono = 686868688;
//		...
		this.listaContactos.add(tempContacto);
		
		
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
	//Con esto ya tengo un metodo que me devuelve la lista de contactos
	public Contacto[] getContactosWithId(int[] idsdecontacto){
		List<Contacto> resultadoLista = new ArrayList<Contacto>();
		for (int i = 0; i < idsdecontacto.length; i++) {
			Contacto tempContacto = getContactosById( idsdecontacto[i] );
			if( tempContacto!=null ) resultadoLista.add(tempContacto);
		}
		return (Contacto[]) resultadoLista.toArray();
	}
	
	private Contacto getContactosById(int idcontacto){
		for (int i = 0; i < listaContactos.size(); i++) {
			if( listaContactos.get(i).id == idcontacto )return listaContactos.get(i);
		}
		return null;
	}

}
