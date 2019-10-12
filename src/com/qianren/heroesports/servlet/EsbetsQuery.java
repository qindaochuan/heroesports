package com.qianren.heroesports.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EsbetsQuery
 */
@WebServlet("/esbets/query")
public class EsbetsQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EsbetsQuery() {
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
				"                \"id\": 318,\n" + 
				"                \"category\": \"DOTA2\",\n" + 
				"                \"categoryId\": 1,\n" + 
				"                \"username\": \"zhongjun11\",\n" + 
				"                \"league\": null,\n" + 
				"                \"eid\": null,\n" + 
				"                \"gameId\": 49727,\n" + 
				"                \"gameName\": \"MDL 成都Major - 中国\",\n" + 
				"                \"startDate\": \"2019-10-07 15:31\",\n" + 
				"                \"round\": 1,\n" + 
				"                \"betType\": 2,\n" + 
				"                \"teamLeft\": \"Aster\",\n" + 
				"                \"teamRight\": \"EHOME\",\n" + 
				"                \"matchId\": 78961,\n" + 
				"                \"matchName\": \"杀敌数让分\",\n" + 
				"                \"winner\": 0,\n" + 
				"                \"value\": null,\n" + 
				"                \"odds\": 1.68,\n" + 
				"                \"matchState\": 0,\n" + 
				"                \"betState\": 0,\n" + 
				"                \"wager\": \"EHOME让分-4.5\",\n" + 
				"                \"amount\": 5,\n" + 
				"                \"win\": null,\n" + 
				"                \"createDate\": \"2019-10-07 15:02:13\",\n" + 
				"                \"rowState\": 0\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"id\": 317,\n" + 
				"                \"category\": \"DOTA2\",\n" + 
				"                \"categoryId\": 1,\n" + 
				"                \"username\": \"zhongjun11\",\n" + 
				"                \"league\": null,\n" + 
				"                \"eid\": null,\n" + 
				"                \"gameId\": 49727,\n" + 
				"                \"gameName\": \"MDL 成都Major - 中国\",\n" + 
				"                \"startDate\": \"2019-10-07 15:31\",\n" + 
				"                \"round\": 0,\n" + 
				"                \"betType\": 2,\n" + 
				"                \"teamLeft\": \"Aster\",\n" + 
				"                \"teamRight\": \"EHOME\",\n" + 
				"                \"matchId\": 78956,\n" + 
				"                \"matchName\": \"获胜者\",\n" + 
				"                \"winner\": 0,\n" + 
				"                \"value\": null,\n" + 
				"                \"odds\": 2.48,\n" + 
				"                \"matchState\": 0,\n" + 
				"                \"betState\": 0,\n" + 
				"                \"wager\": \"EHOME\",\n" + 
				"                \"amount\": 10,\n" + 
				"                \"win\": null,\n" + 
				"                \"createDate\": \"2019-10-07 14:56:31\",\n" + 
				"                \"rowState\": 0\n" + 
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
				"        \"totalElements\": 2,\n" + 
				"        \"last\": true,\n" + 
				"        \"first\": true,\n" + 
				"        \"sort\": {\n" + 
				"            \"sorted\": false,\n" + 
				"            \"unsorted\": true,\n" + 
				"            \"empty\": true\n" + 
				"        },\n" + 
				"        \"numberOfElements\": 2,\n" + 
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
		resp.addHeader("Access-Control-Allow-Headers", "Authorization");
		resp.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
		resp.setHeader("X-Powered-By", "3.2.1");
		resp.setHeader("Access-Control-Allow-Credentials", "true");

		resp.setHeader("Content-Type", "application/json;charset=utf-8");
	}

}
