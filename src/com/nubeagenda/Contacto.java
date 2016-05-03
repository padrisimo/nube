package com.nubeagenda;

public class Contacto {
	public String nombre;
	public int telefono;
	
	public Contacto crearNuevo(){
		return new Contacto();
	}
	public boolean borrar(){
		return false;
	}
}
