package com.nubeagenda.servlets;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nubeagenda.Contacto;
import com.nubeagenda.Usuario;
import com.nubeagenda.db.DBmock;

/**
 * Servlet implementation class agenda
 */
@WebServlet("/agenda")
public class agenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger("agenda");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public agenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// llegamos a agenda
		HttpSession session = request.getSession();
		DBmock db = DBmock.getInstance();
		db.initializeData();
		
    	int uid=((Integer)session.getAttribute("uid")).intValue();
    	Usuario currentUser = db.getuserbyID(uid);
    	
    	logger.log(Level.INFO,"Lista de usuarios obtenidos: "+currentUser.agenda!=null?currentUser.agenda.toString():"No hay agenda");
    	
    	List<Contacto> miscontactos=db.getContactosWithId(currentUser.agenda);
    	request.setAttribute("miscontactos", miscontactos);
    	
		RequestDispatcher rs = request.getRequestDispatcher("agenda.jsp");
        rs.include(request, response);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
