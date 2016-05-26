package com.nubeagenda.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class UsuarioDAOImpl extends UsuarioDAO{

	@Override
	public boolean connect() throws Exception {
		Connection conn = DriverManager.getConnection(url, user, password);
		conn.close();
		return false;
	}

}
