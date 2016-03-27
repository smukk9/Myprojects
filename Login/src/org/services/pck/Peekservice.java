package org.services.pck;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.services.dao.UserDao;
import org.services.dto.User;

/**
 * Servlet implementation class Peekservice
 */
@WebServlet("/Peekservice")
public class Peekservice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Peekservice() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String peek_name = request.getParameter("username");
		UserDao peekservicer_dao = new UserDao();
		
		User u_details=peekservicer_dao.peekuser(peek_name);
		request.setAttribute("Shareduser", u_details);
		RequestDispatcher reqpsds = request.getRequestDispatcher("peeksucess.jsp");
		
		reqpsds.forward(request, response);
		
	}

}
