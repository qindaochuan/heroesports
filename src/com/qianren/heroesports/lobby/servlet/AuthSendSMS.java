package com.qianren.heroesports.lobby.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthSendSMS
 */
@WebServlet("/auth/sendSMS")
public class AuthSendSMS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthSendSMS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		response.addHeader("Access-Control-Allow-Headers", "Authorization");
		response.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
		response.setHeader("X-Powered-By", "3.2.1");
		response.setHeader("Access-Control-Allow-Credentials", "true");

		response.setHeader("Content-Type", "application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("{\n" + 
				"  \"code\": 200,\n" + 
				"  \"data\": {},\n" + 
				"  \"message\": {}\n" + 
				"}");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(req, resp);
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
		resp.addHeader("Access-Control-Allow-Headers", "Authorization");
		resp.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
		resp.setHeader("X-Powered-By", "3.2.1");
		resp.setHeader("Access-Control-Allow-Credentials", "true");

		resp.setHeader("Content-Type", "application/json;charset=utf-8");
	}
}
