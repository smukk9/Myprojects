package org.services.pck;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.services.dao.UserDao;
import org.services.dto.User;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
	
		String u_name=request.getParameter("u_name");
		String e_mail=request.getParameter("e_mail");
		Long p_number=(Long.parseLong(request.getParameter("p_number")));
		String country=request.getParameter("country_name");
		String password = request.getParameter("pwd");
		UserDao userdao= new UserDao();
		boolean result = userdao.add_user(password, u_name, e_mail, p_number, country);
		if(result){
			
			//pw.write(user.getUser_Name() +"you have registred succesfully");
			System.out.println("you entered all the details");
			response.sendRedirect("Login.jsp");
		}
		else
		{
			pw.write("something went wrong");
		}
		
		
	}

}
