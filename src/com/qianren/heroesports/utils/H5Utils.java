package com.qianren.heroesports.utils;

import javax.servlet.http.HttpServletResponse;

public class H5Utils {
	public static void setHeaders(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		response.addHeader("Access-Control-Allow-Headers", "Authorization");
		response.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
		response.setHeader("X-Powered-By", "3.2.1");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Content-Type", "application/json;charset=utf-8");
	}
}
