package com.qianren.heroesports.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Announcements
 */
@WebServlet("/announcements")
public class Announcements extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Announcements() {
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
		response.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
		response.setHeader("X-Powered-By", "3.2.1");
		response.setHeader("Access-Control-Allow-Credentials", "true");

		response.setHeader("Content-Type", "application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("{\n" + 
				"    \"code\": 200,\n" + 
				"    \"data\": {\n" + 
				"        \"content\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-21 14:48:34\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 53,\n" + 
				"                \"title\": \"这是第三条公告标题\",\n" + 
				"                \"content\": \"这是第三条公告内容\",\n" + 
				"                \"adminId\": 1,\n" + 
				"                \"startDate\": \"2019-09-21\",\n" + 
				"                \"endDate\": \"2019-09-30\",\n" + 
				"                \"groups\": \"user\",\n" + 
				"                \"order\": 3,\n" + 
				"                \"admin\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-09-21 06:48:34\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-21 14:25:32\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52,\n" + 
				"                \"title\": \"这是第二个公告标题\",\n" + 
				"                \"content\": \"这是第二个公告内容\",\n" + 
				"                \"adminId\": 1,\n" + 
				"                \"startDate\": \"2019-09-21\",\n" + 
				"                \"endDate\": \"2019-09-30\",\n" + 
				"                \"groups\": \"user\",\n" + 
				"                \"order\": 2,\n" + 
				"                \"admin\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-09-21 06:25:32\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-21 14:24:55\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 51,\n" + 
				"                \"title\": \"这是一个公告标题\",\n" + 
				"                \"content\": \"这是公告内容\",\n" + 
				"                \"adminId\": 1,\n" + 
				"                \"startDate\": \"2019-09-20\",\n" + 
				"                \"endDate\": \"2019-09-30\",\n" + 
				"                \"groups\": \"user\",\n" + 
				"                \"order\": 1,\n" + 
				"                \"admin\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-09-21 06:24:55\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"pageable\": {\n" + 
				"            \"sort\": {\n" + 
				"                \"sorted\": false,\n" + 
				"                \"unsorted\": true,\n" + 
				"                \"empty\": true\n" + 
				"            },\n" + 
				"            \"pageSize\": 10,\n" + 
				"            \"pageNumber\": 0,\n" + 
				"            \"offset\": 0,\n" + 
				"            \"unpaged\": false,\n" + 
				"            \"paged\": true\n" + 
				"        },\n" + 
				"        \"totalPages\": 1,\n" + 
				"        \"totalElements\": 3,\n" + 
				"        \"last\": true,\n" + 
				"        \"first\": true,\n" + 
				"        \"sort\": {\n" + 
				"            \"sorted\": false,\n" + 
				"            \"unsorted\": true,\n" + 
				"            \"empty\": true\n" + 
				"        },\n" + 
				"        \"numberOfElements\": 3,\n" + 
				"        \"size\": 10,\n" + 
				"        \"number\": 0,\n" + 
				"        \"empty\": false\n" + 
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
