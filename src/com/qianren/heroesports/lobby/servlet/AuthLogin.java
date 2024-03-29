package com.qianren.heroesports.lobby.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.qianren.heroesports.utils.H5Utils;

/**
 * Servlet implementation class AuthLlogin
 */
@WebServlet("/auth/login")
public class AuthLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		H5Utils.setHeaders(response);
		PrintWriter out = response.getWriter();
		out.println("{\n" + "  \"code\": 200,\n" + "  \"data\": {\n" + "    \"balance\": 0,\n" + "    \"coins\": 0,\n"
				+ "    \"deposit\": 0,\n" + "    \"hasAvatar\": 0,\n" + "    \"id\": 0,\n"
				+ "    \"lastLoginDate\": \"2019-09-26T12:25:43.731Z\",\n" + "    \"lastLoginLocation\": \"string\",\n"
				+ "    \"level\": 0,\n" + "    \"nextLevelPoint\": 0,\n" + "    \"nickname\": \"string\",\n"
				+ "    \"point\": 0,\n" + "    \"token\": \"string\",\n" + "    \"truename\": \"string\",\n"
				+ "    \"username\": \"string\"\n" + "  },\n" + "  \"message\": {}\n" + "}");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(req, resp);
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
		resp.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
		resp.setHeader("X-Powered-By", "3.2.1");
		resp.setHeader("Access-Control-Allow-Credentials", "true");

		resp.setHeader("Content-Type", "application/json;charset=utf-8");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		H5Utils.setHeaders(response);
		PrintWriter out = response.getWriter();
		String postData = H5Utils.getPostData(request.getInputStream(), request.getContentLength(), null);
		JSONObject object = JSONObject.parseObject(postData);
		String username = object.getString("username");
		if(username.equals("error")) {
			out.println("{\n" + 
					"    \"code\": 400,\n" + 
					"    \"data\": null,\n" + 
					"    \"message\": {\n" + 
					"        \"en\": \"username or password is incorrect\",\n" + 
					"        \"zh\": \"用户名或者密码不正确\"\n" + 
					"    }\n" + 
					"}");
		}else {
			out.println("{\n" + "  \"code\": 200,\n" + "  \"data\": {\n" + "    \"balance\": 0,\n" + "    \"coins\": 0,\n"
					+ "    \"deposit\": 0,\n" + "    \"hasAvatar\": 0,\n" + "    \"id\": 0,\n"
					+ "    \"lastLoginDate\": \"2019-09-26T12:25:43.731Z\",\n" + "    \"lastLoginLocation\": \"string\",\n"
					+ "    \"level\": 0,\n" + "    \"nextLevelPoint\": 0,\n" + "    \"nickname\": \"string\",\n"
					+ "    \"point\": 0,\n" + "    \"token\": \"string\",\n" + "    \"truename\": \"string\",\n"
					+ "    \"username\": \"string\"\n" + "  },\n" + "  \"message\": {}\n" + "}");
		}
	}

}
