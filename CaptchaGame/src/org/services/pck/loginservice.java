package org.services.pck;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.services.dao.UserDao;
import org.services.dto.User;

/**
 * Servlet implementation class loginservice
 */
@WebServlet("/loginservice")
public class loginservice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservice() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String u_name= (String)request.getParameter("user");
		String pwd = (String) request.getParameter("pwd");
		
		UserDao userdao = new UserDao();
		
		User result = userdao.userExists(u_name, pwd);
		if(result!=null){
			System.out.println("--------------------");
			System.out.println(result.getUser_Name());
			HttpSession session = request.getSession();
			session.setAttribute("saveduser", result);
			RequestDispatcher reqds = request.getRequestDispatcher("Loginsucess.jsp");
			reqds.forward(request, response);
		
			
		}else
		{
			pw.write("No user exists with that name \n please enter username agin");
			throw new RuntimeException("Unable to find Account for account number :" );
		}
		
		
	}
	
	

}
