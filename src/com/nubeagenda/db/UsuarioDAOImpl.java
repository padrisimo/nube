package com.nubeagenda.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.nubeagenda.Contacto;

public class UsuarioDAOImpl extends UsuarioDAO{
	private static UsuarioDAOImpl instance = null;
	private static Logger logger=Logger.getLogger("UsuarioDAOImpl");
	
	protected UsuarioDAOImpl() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	}

	public static UsuarioDAO getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		if (instance == null) {
			instance = new UsuarioDAOImpl();
		}

		return instance;
	}

	@Override
	public boolean connect() throws Exception {
		Connection conn = DriverManager.getConnection(url, user, password);
		conn.close();
		return false;
	}

	@Override
	public List<Contacto> getAllContactos() throws Exception {
		ArrayList<Contacto> listaRespuesta=new ArrayList<Contacto>();
		// Load the Connector/J driver
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		
		Contacto aContacto=null;
		
		//stmt.executeUpdate("INSERT INTO mytable " + "VALUES (2, 'Dna', 'Log', '0')");
		ResultSet rs = stmt.executeQuery("SELECT * FROM Contactos");
		while (rs.next()) {
			aContacto=new Contacto();
			aContacto.id = rs.getInt("id");
			aContacto.idUsuario = rs.getInt("id_usuario");
			aContacto.nombre= rs.getString("nombre");
			aContacto.telefono = rs.getInt("telefono");
			
			listaRespuesta.add(aContacto);
		}
		stmt.close();
		conn.close();

		return listaRespuesta;
	}

}
