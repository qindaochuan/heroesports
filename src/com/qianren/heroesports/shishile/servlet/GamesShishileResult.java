package com.qianren.heroesports.shishile.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qianren.heroesports.utils.H5Utils;

/**
 * Servlet implementation class GamesShishileResult
 */
@WebServlet("/games/shishileResult")
public class GamesShishileResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GamesShishileResult() {
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
				"        \"createDate\": \"2019-09-24 18:07:13\",\n" + 
				"        \"rowState\": 0,\n" + 
				"        \"id\": 318,\n" + 
				"        \"name\": \"兽灵行者 乌迪尔\",\n" + 
				"        \"camp\": null,\n" + 
				"        \"feature\": null,\n" + 
				"        \"attack\": \"近战\",\n" + 
				"        \"attackShortName\": null,\n" + 
				"        \"sex\": 1,\n" + 
				"        \"hasMagic\": 1,\n" + 
				"        \"game\": \"lol\",\n" + 
				"        \"no\": 121,\n" + 
				"        \"eid\": null,\n" + 
				"        \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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

	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(req, resp);
		H5Utils.setHeaders(resp);
	}
}
