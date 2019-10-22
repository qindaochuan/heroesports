package com.qianren.heroesports.lobby.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qianren.heroesports.utils.H5Utils;

/**
 * Servlet implementation class MessagesLogs
 */
@WebServlet("/messages/logs")
public class MessagesLogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessagesLogs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		H5Utils.setHeaders(response);
		PrintWriter out = response.getWriter();
		out.println("{\n" + 
				"    \"code\": 200,\n" + 
				"    \"data\": [\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-09-28 19:20:27\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 163408,\n" + 
				"            \"adminId\": null,\n" + 
				"            \"userId\": 3150,\n" + 
				"            \"agentId\": null,\n" + 
				"            \"operation\": \"登录成功\",\n" + 
				"            \"createIp\": \"192.168.0.105\",\n" + 
				"            \"remark\": null,\n" + 
				"            \"adminname\": null,\n" + 
				"            \"username\": null,\n" + 
				"            \"agentname\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-09-28 19:20:27\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-09-28 17:27:41\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 163407,\n" + 
				"            \"adminId\": null,\n" + 
				"            \"userId\": 3150,\n" + 
				"            \"agentId\": null,\n" + 
				"            \"operation\": \"登录成功\",\n" + 
				"            \"createIp\": \"192.168.0.105\",\n" + 
				"            \"remark\": null,\n" + 
				"            \"adminname\": null,\n" + 
				"            \"username\": null,\n" + 
				"            \"agentname\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-09-28 17:27:41\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-09-28 17:07:04\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 163406,\n" + 
				"            \"adminId\": null,\n" + 
				"            \"userId\": 3150,\n" + 
				"            \"agentId\": null,\n" + 
				"            \"operation\": \"登录成功\",\n" + 
				"            \"createIp\": \"192.168.0.105\",\n" + 
				"            \"remark\": null,\n" + 
				"            \"adminname\": null,\n" + 
				"            \"username\": null,\n" + 
				"            \"agentname\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-09-28 17:07:04\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-09-28 17:05:33\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 163405,\n" + 
				"            \"adminId\": null,\n" + 
				"            \"userId\": 3150,\n" + 
				"            \"agentId\": null,\n" + 
				"            \"operation\": \"登录成功\",\n" + 
				"            \"createIp\": \"192.168.0.105\",\n" + 
				"            \"remark\": null,\n" + 
				"            \"adminname\": null,\n" + 
				"            \"username\": null,\n" + 
				"            \"agentname\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-09-28 17:05:33\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-09-28 17:01:38\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 163404,\n" + 
				"            \"adminId\": null,\n" + 
				"            \"userId\": 3150,\n" + 
				"            \"agentId\": null,\n" + 
				"            \"operation\": \"登录成功\",\n" + 
				"            \"createIp\": \"192.168.0.105\",\n" + 
				"            \"remark\": null,\n" + 
				"            \"adminname\": null,\n" + 
				"            \"username\": null,\n" + 
				"            \"agentname\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-09-28 17:01:38\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-09-28 16:57:32\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 163403,\n" + 
				"            \"adminId\": null,\n" + 
				"            \"userId\": 3150,\n" + 
				"            \"agentId\": null,\n" + 
				"            \"operation\": \"登录成功\",\n" + 
				"            \"createIp\": \"192.168.0.105\",\n" + 
				"            \"remark\": null,\n" + 
				"            \"adminname\": null,\n" + 
				"            \"username\": null,\n" + 
				"            \"agentname\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-09-28 16:57:32\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-09-28 15:48:14\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 163398,\n" + 
				"            \"adminId\": null,\n" + 
				"            \"userId\": 3150,\n" + 
				"            \"agentId\": null,\n" + 
				"            \"operation\": \"登录成功\",\n" + 
				"            \"createIp\": \"192.168.0.105\",\n" + 
				"            \"remark\": null,\n" + 
				"            \"adminname\": null,\n" + 
				"            \"username\": null,\n" + 
				"            \"agentname\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-09-28 15:48:14\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-09-28 15:46:26\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 163397,\n" + 
				"            \"adminId\": null,\n" + 
				"            \"userId\": 3150,\n" + 
				"            \"agentId\": null,\n" + 
				"            \"operation\": \"登录成功\",\n" + 
				"            \"createIp\": \"192.168.0.105\",\n" + 
				"            \"remark\": null,\n" + 
				"            \"adminname\": null,\n" + 
				"            \"username\": null,\n" + 
				"            \"agentname\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-09-28 15:46:26\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-09-28 15:41:37\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 163396,\n" + 
				"            \"adminId\": null,\n" + 
				"            \"userId\": 3150,\n" + 
				"            \"agentId\": null,\n" + 
				"            \"operation\": \"登录成功\",\n" + 
				"            \"createIp\": \"192.168.0.105\",\n" + 
				"            \"remark\": null,\n" + 
				"            \"adminname\": null,\n" + 
				"            \"username\": null,\n" + 
				"            \"agentname\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-09-28 15:41:37\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-09-28 15:40:40\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 163395,\n" + 
				"            \"adminId\": null,\n" + 
				"            \"userId\": 3150,\n" + 
				"            \"agentId\": null,\n" + 
				"            \"operation\": \"登录成功\",\n" + 
				"            \"createIp\": \"192.168.0.105\",\n" + 
				"            \"remark\": null,\n" + 
				"            \"adminname\": null,\n" + 
				"            \"username\": null,\n" + 
				"            \"agentname\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-09-28 15:40:40\"\n" + 
				"        }\n" + 
				"    ],\n" + 
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
		H5Utils.setHeaders(resp);
	}
}
