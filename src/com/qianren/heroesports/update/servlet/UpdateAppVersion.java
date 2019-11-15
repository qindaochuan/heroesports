package com.qianren.heroesports.update.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

/**
 * Servlet implementation class UpdateAppVersion
 */
@WebServlet("/update/appversion")
public class UpdateAppVersion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateAppVersion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String user = request.getParameter("user");
		final String path = request.getSession().getServletContext().getRealPath("");
		// normal 正式用户
		// audit ios提升版本
		// opener 测试用户
		if (user != null && (user.equals("normal") || user.equals("audit") || user.equals("opener"))) {
			final String packagejson = path + "update/" + user + "/res/package.json";
			final String jsonStr = readJsonFile(packagejson);
			final JSONObject obj = JSONObject.parseObject(jsonStr);
			final String major = obj.getString("major");
			final String minor = obj.getString("minor");
			JSONObject resultObj = new JSONObject();
			JSONObject dataObj = new JSONObject();
			dataObj.put("major", major);
			dataObj.put("minor", minor);
			dataObj.put("updateUrl", "/update/" + user + "/");
			dataObj.put("forceUpdateUrl","https://fir.im/8knv");
			dataObj.put("pakcageJsonUrl","/update/" + user + "/res/package.json");
			resultObj.put("code", 200);
			resultObj.put("data", dataObj);
			resultObj.put("message", "success");
			PrintWriter out = response.getWriter();
			out.print(resultObj.toJSONString());
		} else {

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

	/**
	 * 读取json文件，返回json串
	 * 
	 * @param fileName
	 * @return
	 */
	public static String readJsonFile(String fileName) {
		String jsonStr = "";
		try {
			File jsonFile = new File(fileName);
			FileReader fileReader = new FileReader(jsonFile);

			Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
			int ch = 0;
			StringBuffer sb = new StringBuffer();
			while ((ch = reader.read()) != -1) {
				sb.append((char) ch);
			}
			fileReader.close();
			reader.close();
			jsonStr = sb.toString();
			return jsonStr;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
