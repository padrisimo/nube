package com.nubeagenda.servlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nubeagenda.db.DBmock;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger("Login");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//  llegamos a login

		RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
        rs.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// obtenemos los parametros
		
		String email = request.getParameter("email");
        String pass = request.getParameter("password");
        
        logger.log(Level.INFO, "email: "+email+" ,pass: "+pass);
        
        DBmock db = DBmock.getInstance();
        db.initializeData();
        
        int uid = db.checarUsuario(email, pass);
        if ( uid >0 ){
        	HttpSession session = request.getSession();
        	session.setAttribute("uid", new Integer(uid));
        	
        	RequestDispatcher rs = request.getRequestDispatcher("agenda");
            rs.include(request, response);
        }else{
        	request.setAttribute("mssError", "Maaal, muy maaal, ni loquearse saben oiga");
        	RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
            rs.include(request, response);
        }
		
	}

}
