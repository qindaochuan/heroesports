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
 * Servlet implementation class Tasks
 */
@WebServlet("/tasks")
public class Tasks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Tasks() {
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
		String categoryId = request.getParameter("categoryId");
		if (categoryId != null && categoryId.equals("5")) {
			out.println(
					"{\n" + "    \"code\": 200,\n" + "    \"data\": null,\n" + "    \"message\": \"success\"\n" + "}");
		} else {
			out.println("{\n" + "    \"code\": 400,\n" + "    \"data\": null,\n"
					+ "    \"message\": \"该任务已经进行过,不能重复进行\"\n" + "}");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
