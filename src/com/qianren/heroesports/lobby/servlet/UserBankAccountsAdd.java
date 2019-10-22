package com.qianren.heroesports.lobby.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserBankAccountsAdd
 */
@WebServlet("/userBankAccounts/add")
public class UserBankAccountsAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserBankAccountsAdd() {
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
				"        \"createDate\": \"2019-10-17 10:49:26\",\n" + 
				"        \"rowState\": 0,\n" + 
				"        \"id\": 267,\n" + 
				"        \"userId\": 3177,\n" + 
				"        \"bank\": \"民生银行\",\n" + 
				"        \"bankBranch\": \"广东省-深圳市\",\n" + 
				"        \"accountNumber\": \"6226220639132158\",\n" + 
				"        \"accountName\": \"钟俊\",\n" + 
				"        \"enabled\": 1,\n" + 
				"        \"remark\": null,\n" + 
				"        \"user\": null,\n" + 
				"        \"lastModifiedDate\": \"2019-10-17 10:49:26\"\n" + 
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

}
