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
 * Servlet implementation class MessagesList
 */
@WebServlet("/messages/list")
public class MessagesList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessagesList() {
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
				"    \"data\": {\n" + 
				"        \"content\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-05 16:55:02\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 994,\n" + 
				"                \"userId\": null,\n" + 
				"                \"title\": \"1111111111\",\n" + 
				"                \"content\": \"2\",\n" + 
				"                \"group\": 0,\n" + 
				"                \"autoSend\": 0,\n" + 
				"                \"user\": null,\n" + 
				"                \"state\": 1,\n" + 
				"                \"lastModifiedDate\": \"2019-09-05 16:55:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-05 16:55:03\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 995,\n" + 
				"                \"userId\": null,\n" + 
				"                \"title\": \"1111111111\",\n" + 
				"                \"content\": \"2\",\n" + 
				"                \"group\": 0,\n" + 
				"                \"autoSend\": 0,\n" + 
				"                \"user\": null,\n" + 
				"                \"state\": 1,\n" + 
				"                \"lastModifiedDate\": \"2019-09-05 16:55:03\"\n" + 
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
				"            \"paged\": true,\n" + 
				"            \"unpaged\": false\n" + 
				"        },\n" + 
				"        \"totalPages\": 1,\n" + 
				"        \"totalElements\": 2,\n" + 
				"        \"last\": true,\n" + 
				"        \"first\": true,\n" + 
				"        \"sort\": {\n" + 
				"            \"sorted\": false,\n" + 
				"            \"unsorted\": true,\n" + 
				"            \"empty\": true\n" + 
				"        },\n" + 
				"        \"numberOfElements\": 2,\n" + 
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
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(req, resp);
		H5Utils.setHeaders(resp);
	}
}
