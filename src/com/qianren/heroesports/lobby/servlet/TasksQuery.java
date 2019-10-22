package com.qianren.heroesports.lobby.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TasksQuery
 */
@WebServlet("/tasks/query")
public class TasksQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TasksQuery() {
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
				"                \"createDate\": \"2019-09-04 17:28:34\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 30,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-04 09:28:34\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-04 17:29:09\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 31,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:37\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 5,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"签到\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": \"/sign\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:37\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-04 09:29:09\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-05 11:41:36\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 40,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-05 03:41:36\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-06 11:07:33\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 48,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-06 11:07:33\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-18 09:53:01\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 103,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-18 01:53:01\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-18 09:56:19\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 104,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:37\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 5,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"签到\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": \"/sign\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:37\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-18 01:56:19\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-19 10:02:16\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 109,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-19 02:02:16\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-19 11:35:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 112,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 8,\n" + 
				"                \"state\": 2,\n" + 
				"                \"finishDate\": \"2019-09-20T09:31:32.000+0000\",\n" + 
				"                \"amount\": 20,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:37\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 8,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 1,\n" + 
				"                    \"name\": \"设置资金密码\",\n" + 
				"                    \"amount\": 20,\n" + 
				"                    \"link\": \"/account/settings/safe?category=user&&task=true\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 07:57:26\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-20 09:31:31\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-19 14:01:48\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 113,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:37\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 5,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"签到\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": \"/sign\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:37\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-19 06:01:48\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-19 14:24:09\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 115,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 2,\n" + 
				"                \"state\": 2,\n" + 
				"                \"finishDate\": \"2019-09-23T08:44:54.000+0000\",\n" + 
				"                \"amount\": 15,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 2,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 1,\n" + 
				"                    \"name\": \"首次设置头像\",\n" + 
				"                    \"amount\": 15,\n" + 
				"                    \"link\": \"/account/settings?category=user\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-23 08:44:53\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-20 16:34:00\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 138,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-20 08:34:00\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-20 17:40:41\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 140,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:37\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 5,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"签到\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": \"/sign\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:37\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-20 09:40:41\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-23 10:14:13\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 172,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 2,\n" + 
				"                \"finishDate\": \"2019-09-23T08:44:56.000+0000\",\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-23 08:44:56\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-23 10:14:22\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 173,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"state\": 2,\n" + 
				"                \"finishDate\": \"2019-09-23T08:44:59.000+0000\",\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:37\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 5,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"签到\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": \"/sign\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:37\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-23 08:44:59\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-24 09:56:35\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 186,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 2,\n" + 
				"                \"finishDate\": \"2019-09-24T01:56:59.000+0000\",\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-24 01:56:58\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-24 09:56:39\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 187,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"state\": 2,\n" + 
				"                \"finishDate\": \"2019-09-24T01:57:00.000+0000\",\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:37\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 5,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"签到\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": \"/sign\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:37\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-24 01:56:59\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-25 10:42:47\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 203,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-25 02:42:47\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-25 10:42:53\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 204,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:37\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 5,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"签到\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": \"/sign\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:37\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-25 02:42:53\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-26 13:42:33\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 214,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-26 13:42:33\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-26 13:42:37\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 215,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:37\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 5,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"签到\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": \"/sign\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:37\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-26 13:42:37\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 11:37:08\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 218,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:36\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 4,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"登录\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": null,\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:36\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 11:37:08\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 13:41:29\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 221,\n" + 
				"                \"userId\": 3150,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"state\": 1,\n" + 
				"                \"finishDate\": null,\n" + 
				"                \"amount\": 5,\n" + 
				"                \"category\": {\n" + 
				"                    \"createDate\": \"2019-09-02 12:03:37\",\n" + 
				"                    \"rowState\": 0,\n" + 
				"                    \"id\": 5,\n" + 
				"                    \"amountType\": 1,\n" + 
				"                    \"type\": 2,\n" + 
				"                    \"name\": \"签到\",\n" + 
				"                    \"amount\": 5,\n" + 
				"                    \"link\": \"/sign\",\n" + 
				"                    \"hibernateLazyInitializer\": {},\n" + 
				"                    \"lastModifiedDate\": \"2019-09-02 04:03:37\"\n" + 
				"                },\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 13:41:29\"\n" + 
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
				"            \"unpaged\": false,\n" + 
				"            \"paged\": true\n" + 
				"        },\n" + 
				"        \"totalPages\": 1,\n" + 
				"        \"totalElements\": 22,\n" + 
				"        \"last\": true,\n" + 
				"        \"first\": true,\n" + 
				"        \"sort\": {\n" + 
				"            \"sorted\": false,\n" + 
				"            \"unsorted\": true,\n" + 
				"            \"empty\": true\n" + 
				"        },\n" + 
				"        \"numberOfElements\": 22,\n" + 
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
