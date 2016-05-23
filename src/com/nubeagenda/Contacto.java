package com.nubeagenda;

public class Contacto {
	public int id;
	public String nombre;
	public int telefono;
	
	public Contacto crearNuevo(){
		return new Contacto();
	}
	public boolean borrar(){
		return false;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
