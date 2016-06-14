package com.niit.shoppingcart.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.shoppingcart.DAO.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
    String userid=(String)request.getParameter("userid");
    String password=(String)request.getParameter("password");
    
       
      UserDAO userdao=new UserDAO();
       if(userdao.isValidCredentials(userid, password)==true)
       {
    	   RequestDispatcher dispatcher=request.getRequestDispatcher("contact.html");
    			   dispatcher.forward(request,response);
      
       }
       
     else
       {
    	 PrintWriter out=response.getWriter();
         out.print("invalid");
    	 RequestDispatcher dispatcher=request.getRequestDispatcher("home.html");
    			   dispatcher.include(request,response);
    	   
       }
	}

}
