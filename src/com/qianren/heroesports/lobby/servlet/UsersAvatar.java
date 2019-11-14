package com.qianren.heroesports.lobby.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qianren.heroesports.utils.H5Utils;

/**
 * Servlet implementation class UsersAvatar
 */
@WebServlet("/users/avatar")
public class UsersAvatar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersAvatar() {
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
		response.setHeader("Content-Type", "image/png");
		String userId = request.getParameter("userId");
		String path = request.getSession().getServletContext().getRealPath("");
		String imagePath = path + "headImage/" + userId;
		File file = new File(imagePath);
		if (file.exists()) {
			FileInputStream in = new FileInputStream(file);
			byte[] buffer = new byte[(int) file.length()];
			in.read(buffer);
			ServletOutputStream output = response.getOutputStream();
			output.write(buffer);
			in.close();
		}else {
			File tempFile = new File(path + "headImage/temp.png");
			FileInputStream in = new FileInputStream(tempFile);
			byte[] buffer = new byte[(int) tempFile.length()];
			in.read(buffer);
			ServletOutputStream output = response.getOutputStream();
			output.write(buffer);
			in.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
