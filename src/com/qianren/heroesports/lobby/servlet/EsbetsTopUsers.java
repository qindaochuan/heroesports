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
 * Servlet implementation class EsbetsTopUsers
 */
@WebServlet("/esbets/topUsers")
public class EsbetsTopUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EsbetsTopUsers() {
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
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 3157,\n" + 
				"                \"hasAvatar\": 1,\n" + 
				"                \"username\": \"ls547664\",\n" + 
				"                \"totalBetAmount\": 26575,\n" + 
				"                \"totalWinAmount\": 9855.4,\n" + 
				"                \"createDate\": \"2019-09-10 10:36:21\",\n" + 
				"                \"lastLoginDate\": \"2019-09-27 13:28:21\",\n" + 
				"                \"lastLoginIp\": \"192.168.0.87\",\n" + 
				"                \"loginCount\": 68\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 3142,\n" + 
				"                \"hasAvatar\": 1,\n" + 
				"                \"username\": \"liushuang3\",\n" + 
				"                \"totalBetAmount\": 8637,\n" + 
				"                \"totalWinAmount\": 5247.8,\n" + 
				"                \"createDate\": \"2019-09-01 14:12:11\",\n" + 
				"                \"lastLoginDate\": \"2019-09-27 13:36:15\",\n" + 
				"                \"lastLoginIp\": \"192.168.0.181\",\n" + 
				"                \"loginCount\": 182\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 421,\n" + 
				"                \"hasAvatar\": 0,\n" + 
				"                \"username\": \"1075592013\",\n" + 
				"                \"totalBetAmount\": 72,\n" + 
				"                \"totalWinAmount\": 301.5,\n" + 
				"                \"createDate\": \"2017-12-24 00:28:54\",\n" + 
				"                \"lastLoginDate\": \"2017-12-24 00:29:21\",\n" + 
				"                \"lastLoginIp\": null,\n" + 
				"                \"loginCount\": 2\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"hasAvatar\": 1,\n" + 
				"                \"username\": \"zhongjun11\",\n" + 
				"                \"totalBetAmount\": 160,\n" + 
				"                \"totalWinAmount\": 176.2,\n" + 
				"                \"createDate\": \"2019-09-04 17:28:34\",\n" + 
				"                \"lastLoginDate\": \"2019-09-27 13:41:43\",\n" + 
				"                \"lastLoginIp\": \"192.168.0.105\",\n" + 
				"                \"loginCount\": 828\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 1509,\n" + 
				"                \"hasAvatar\": 0,\n" + 
				"                \"username\": \"111111\",\n" + 
				"                \"totalBetAmount\": 190,\n" + 
				"                \"totalWinAmount\": 144.6,\n" + 
				"                \"createDate\": \"2018-05-30 21:53:04\",\n" + 
				"                \"lastLoginDate\": \"2018-05-30 22:55:40\",\n" + 
				"                \"lastLoginIp\": null,\n" + 
				"                \"loginCount\": 2\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 1664,\n" + 
				"                \"hasAvatar\": 0,\n" + 
				"                \"username\": \"0987654\",\n" + 
				"                \"totalBetAmount\": 240,\n" + 
				"                \"totalWinAmount\": 95.7,\n" + 
				"                \"createDate\": \"2018-06-13 16:16:11\",\n" + 
				"                \"lastLoginDate\": \"2018-06-13 16:16:12\",\n" + 
				"                \"lastLoginIp\": null,\n" + 
				"                \"loginCount\": 1\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 1695,\n" + 
				"                \"hasAvatar\": 0,\n" + 
				"                \"username\": \"1060429mm\",\n" + 
				"                \"totalBetAmount\": 60,\n" + 
				"                \"totalWinAmount\": 39.5,\n" + 
				"                \"createDate\": \"2018-06-14 16:31:26\",\n" + 
				"                \"lastLoginDate\": \"2018-06-14 22:18:04\",\n" + 
				"                \"lastLoginIp\": null,\n" + 
				"                \"loginCount\": 5\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 2521,\n" + 
				"                \"hasAvatar\": 0,\n" + 
				"                \"username\": \"1010273171\",\n" + 
				"                \"totalBetAmount\": 1040,\n" + 
				"                \"totalWinAmount\": 18.3,\n" + 
				"                \"createDate\": \"2018-08-20 12:20:21\",\n" + 
				"                \"lastLoginDate\": \"2018-08-20 12:20:21\",\n" + 
				"                \"lastLoginIp\": null,\n" + 
				"                \"loginCount\": 1\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 1765,\n" + 
				"                \"hasAvatar\": 0,\n" + 
				"                \"username\": \"1049075255\",\n" + 
				"                \"totalBetAmount\": 30,\n" + 
				"                \"totalWinAmount\": 11.7,\n" + 
				"                \"createDate\": \"2018-06-17 17:22:07\",\n" + 
				"                \"lastLoginDate\": \"2018-06-17 17:22:07\",\n" + 
				"                \"lastLoginIp\": null,\n" + 
				"                \"loginCount\": 1\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 668,\n" + 
				"                \"hasAvatar\": 0,\n" + 
				"                \"username\": \"1043723444\",\n" + 
				"                \"totalBetAmount\": 40,\n" + 
				"                \"totalWinAmount\": 10.1,\n" + 
				"                \"createDate\": \"2018-01-02 08:11:05\",\n" + 
				"                \"lastLoginDate\": \"2018-01-02 09:15:41\",\n" + 
				"                \"lastLoginIp\": null,\n" + 
				"                \"loginCount\": 4\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 2366,\n" + 
				"                \"hasAvatar\": 0,\n" + 
				"                \"username\": \"0804aa\",\n" + 
				"                \"totalBetAmount\": 120,\n" + 
				"                \"totalWinAmount\": 2.9,\n" + 
				"                \"createDate\": \"2018-07-26 15:54:51\",\n" + 
				"                \"lastLoginDate\": \"2018-08-06 01:01:29\",\n" + 
				"                \"lastLoginIp\": null,\n" + 
				"                \"loginCount\": 10\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"merchantId\": 0,\n" + 
				"                \"userId\": 3162,\n" + 
				"                \"hasAvatar\": 1,\n" + 
				"                \"username\": \"lxk123\",\n" + 
				"                \"totalBetAmount\": 7600,\n" + 
				"                \"totalWinAmount\": 0,\n" + 
				"                \"createDate\": \"2019-09-16 15:01:55\",\n" + 
				"                \"lastLoginDate\": \"2019-09-19 18:14:45\",\n" + 
				"                \"lastLoginIp\": \"192.168.0.87\",\n" + 
				"                \"loginCount\": 12\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"pageable\": {\n" + 
				"            \"sort\": {\n" + 
				"                \"sorted\": false,\n" + 
				"                \"unsorted\": true,\n" + 
				"                \"empty\": true\n" + 
				"            },\n" + 
				"            \"pageSize\": 20,\n" + 
				"            \"pageNumber\": 0,\n" + 
				"            \"offset\": 0,\n" + 
				"            \"unpaged\": false,\n" + 
				"            \"paged\": true\n" + 
				"        },\n" + 
				"        \"totalPages\": 1,\n" + 
				"        \"totalElements\": 12,\n" + 
				"        \"last\": true,\n" + 
				"        \"first\": true,\n" + 
				"        \"sort\": {\n" + 
				"            \"sorted\": false,\n" + 
				"            \"unsorted\": true,\n" + 
				"            \"empty\": true\n" + 
				"        },\n" + 
				"        \"numberOfElements\": 12,\n" + 
				"        \"size\": 20,\n" + 
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
