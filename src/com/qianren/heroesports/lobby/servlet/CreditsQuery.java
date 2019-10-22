package com.qianren.heroesports.lobby.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreditsQuery
 */
@WebServlet("/credits/query")
public class CreditsQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditsQuery() {
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
				"        \"content\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-10-21 16:38:59\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 1128,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"amount\": 10,\n" + 
				"                \"creditBefore\": 30,\n" + 
				"                \"balanceBefore\": 999.5,\n" + 
				"                \"creditAfter\": 20,\n" + 
				"                \"balanceAfter\": 1009.5,\n" + 
				"                \"platformId\": 13,\n" + 
				"                \"type\": 2,\n" + 
				"                \"status\": 2,\n" + 
				"                \"remark\": null,\n" + 
				"                \"tnxNo\": \"ES201910211638594\",\n" + 
				"                \"user\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-10-21 16:38:59\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-10-21 16:38:42\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 1127,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"amount\": 20,\n" + 
				"                \"creditBefore\": 10,\n" + 
				"                \"balanceBefore\": 1019.5,\n" + 
				"                \"creditAfter\": 30,\n" + 
				"                \"balanceAfter\": 999.5,\n" + 
				"                \"platformId\": 13,\n" + 
				"                \"type\": 1,\n" + 
				"                \"status\": 2,\n" + 
				"                \"remark\": null,\n" + 
				"                \"tnxNo\": \"ES201910211638416\",\n" + 
				"                \"user\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-10-21 16:38:41\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-10-21 16:38:05\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 1126,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"amount\": 10,\n" + 
				"                \"creditBefore\": 0,\n" + 
				"                \"balanceBefore\": 1029.5,\n" + 
				"                \"creditAfter\": 10,\n" + 
				"                \"balanceAfter\": 1019.5,\n" + 
				"                \"platformId\": 13,\n" + 
				"                \"type\": 1,\n" + 
				"                \"status\": 2,\n" + 
				"                \"remark\": null,\n" + 
				"                \"tnxNo\": \"ES201910211638052\",\n" + 
				"                \"user\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-10-21 16:38:05\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"pageable\": {\n" + 
				"            \"sort\": {\n" + 
				"                \"sorted\": false,\n" + 
				"                \"unsorted\": true,\n" + 
				"                \"empty\": true\n" + 
				"            },\n" + 
				"            \"pageSize\": 100,\n" + 
				"            \"pageNumber\": 0,\n" + 
				"            \"offset\": 0,\n" + 
				"            \"paged\": true,\n" + 
				"            \"unpaged\": false\n" + 
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
				"        \"size\": 100,\n" + 
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
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
		resp.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
		resp.setHeader("X-Powered-By", "3.2.1");
		resp.setHeader("Access-Control-Allow-Credentials", "true");

		resp.setHeader("Content-Type", "application/json;charset=utf-8");
	}
}
