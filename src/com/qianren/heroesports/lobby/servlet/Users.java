package com.qianren.heroesports.lobby.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Users
 */
@WebServlet("/users")
public class Users extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Users() {
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
				"    \"code\": 200,\n" + 
				"    \"data\": {\n" + 
				"        \"nickname\": null,\n" + 
				"        \"truename\": null,\n" + 
				"        \"email\": null,\n" + 
				"        \"birthdate\": null,\n" + 
				"        \"hasSecureCode\": 1,\n" + 
				"        \"profile\": null,\n" + 
				"        \"telephone\": null,\n" + 
				"        \"point\": 55,\n" + 
				"        \"level\": 0,\n" + 
				"        \"nextLevelPoint\": 220,\n" + 
				"        \"coins\": 0,\n" + 
				"        \"lastLoginDate\": \"2019-09-28 11:51:05\",\n" + 
				"        \"lastLoginLocation\": \"本地\"\n" + 
				"    },\n" + 
				"    \"message\": \"success\"\n" + 
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
