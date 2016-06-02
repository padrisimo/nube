package com.nubeagenda.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import com.nubeagenda.Contacto;
import com.nubeagenda.db.UsuarioDAO;
import com.nubeagenda.db.UsuarioDAOImpl;

public class UsuarioDAOImplTest {

	@Test
	public void testConnect() {
		
		try {
			UsuarioDAO dao = UsuarioDAOImpl.getInstance();
			dao.connect();
			assertTrue(true);
		} catch (Exception e) {
			fail("Error!!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void getAllContactos() {
		try {
			UsuarioDAO dao = UsuarioDAOImpl.getInstance();
			List<Contacto> listaContactos = dao.getAllContactos();
			assertTrue(listaContactos.size()>0);
		} catch (Exception e) {
			fail("Error:" + e.getMessage());
		}
	}

}
