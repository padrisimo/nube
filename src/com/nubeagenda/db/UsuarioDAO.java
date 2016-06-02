package com.nubeagenda.db;

import java.util.List;

import com.nubeagenda.Contacto;

public abstract class UsuarioDAO extends DAO{
	public abstract boolean connect() throws Exception;
	public abstract List<Contacto> getAllContactos() throws Exception;


}
