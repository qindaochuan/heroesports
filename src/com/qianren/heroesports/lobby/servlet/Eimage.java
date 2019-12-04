package com.qianren.heroesports.lobby.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qianren.heroesports.utils.H5Utils;

/**
 * Servlet implementation class Eimage
 */
@WebServlet("/eimage")
public class Eimage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Eimage() {
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
		response.setHeader("Content-Type", "image/png");
		String fileName = request.getParameter("file");
		String path = request.getSession().getServletContext().getRealPath("");
		String imagePath = path + "partylogo/" + fileName;
		File file = new File(imagePath);
		ServletOutputStream output = response.getOutputStream();
		if (file.exists()) {
			FileInputStream in = new FileInputStream(file);
			byte[] buffer = new byte[(int) file.length()];
			in.read(buffer);
			output.write(buffer);
			in.close();
		}else {
			System.out.println("下载"+fileName);
			String url = "https://www.nmgdjkj.com/file/" + fileName;
			H5Utils.downloadImg(url,imagePath,output);
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

//	@Override
//	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doOptions(req, resp);
//		H5Utils.setHeaders(resp);
//	}
}
