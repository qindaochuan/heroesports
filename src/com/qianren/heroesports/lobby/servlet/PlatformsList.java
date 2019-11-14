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
 * Servlet implementation class PlatformsList
 */
@WebServlet("/platforms/list")
public class PlatformsList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlatformsList() {
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
				"            \"createDate\": \"2018-10-12 11:10:43\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 11,\n" + 
				"            \"name\": \"IBC\",\n" + 
				"            \"description\": \"IBC\",\n" + 
				"            \"transferInEnabled\": 1,\n" + 
				"            \"transferOutEnabled\": 1,\n" + 
				"            \"enabled\": 1,\n" + 
				"            \"visibleToUser\": 1,\n" + 
				"            \"fieldName\": \"ibc\",\n" + 
				"            \"lastModifiedDate\": \"2019-10-22 15:04:01\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"createDate\": \"2019-10-19 06:23:36\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 13,\n" + 
				"            \"name\": \"EPSPORT\",\n" + 
				"            \"description\": \"电竞\",\n" + 
				"            \"transferInEnabled\": 1,\n" + 
				"            \"transferOutEnabled\": 1,\n" + 
				"            \"enabled\": 1,\n" + 
				"            \"visibleToUser\": 1,\n" + 
				"            \"fieldName\": \"esport\",\n" + 
				"            \"lastModifiedDate\": \"2019-10-21 16:37:23\"\n" + 
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
