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
 * Servlet implementation class TasksList
 */
@WebServlet("/tasks/list")
public class TasksList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TasksList() {
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
				"        \"fixedItems\": [\n" + 
				"            {\n" + 
				"                \"type\": 2,\n" + 
				"                \"name\": \"设置资金密码\",\n" + 
				"                \"amount\": 20,\n" + 
				"                \"state\": 2,\n" + 
				"                \"categoryId\": 8,\n" + 
				"                \"taskId\": 112,\n" + 
				"                \"link\": \"/account/settings/safe?category=user&&task=true\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 1,\n" + 
				"                \"name\": \"首次设置头像\",\n" + 
				"                \"amount\": 15,\n" + 
				"                \"state\": 2,\n" + 
				"                \"categoryId\": 2,\n" + 
				"                \"taskId\": 115,\n" + 
				"                \"link\": \"/account/settings?category=user\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 1,\n" + 
				"                \"name\": \"设置生日\",\n" + 
				"                \"amount\": 50,\n" + 
				"                \"state\": null,\n" + 
				"                \"categoryId\": 1,\n" + 
				"                \"taskId\": null,\n" + 
				"                \"link\": \"/account/settings?category=user\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 1,\n" + 
				"                \"name\": \"首次设置昵称\",\n" + 
				"                \"amount\": 5,\n" + 
				"                \"state\": null,\n" + 
				"                \"categoryId\": 3,\n" + 
				"                \"taskId\": null,\n" + 
				"                \"link\": \"/account/settings?category=user\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 1,\n" + 
				"                \"name\": \"首次绑定银行卡\",\n" + 
				"                \"amount\": 100,\n" + 
				"                \"state\": null,\n" + 
				"                \"categoryId\": 9,\n" + 
				"                \"taskId\": null,\n" + 
				"                \"link\": \"/account/settings/card?category=user\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"todayItems\": [\n" + 
				"            {\n" + 
				"                \"type\": 2,\n" + 
				"                \"name\": \"登录\",\n" + 
				"                \"amount\": 5,\n" + 
				"                \"state\": 1,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"taskId\": 218,\n" + 
				"                \"link\": null\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 2,\n" + 
				"                \"name\": \"签到\",\n" + 
				"                \"amount\": 5,\n" + 
				"                \"state\": 1,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"taskId\": 221,\n" + 
				"                \"link\": \"/sign\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 2,\n" + 
				"                \"name\": \"充值\",\n" + 
				"                \"amount\": 10,\n" + 
				"                \"state\": null,\n" + 
				"                \"categoryId\": 6,\n" + 
				"                \"taskId\": null,\n" + 
				"                \"link\": \"/account/deposit/?category=user\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 2,\n" + 
				"                \"name\": \"提款\",\n" + 
				"                \"amount\": 10,\n" + 
				"                \"state\": null,\n" + 
				"                \"categoryId\": 7,\n" + 
				"                \"taskId\": null,\n" + 
				"                \"link\": \"/account/deposit/withdrawal?category=user\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"rechargeItems\": [\n" + 
				"            {\n" + 
				"                \"type\":3,\n" + 
				"                \"name\": \"<color=#BCD3F7>完成</c><color=#0000FF>首次</color><color=#BCD3F7>充值</color>\",\n" + 
				"                \"amount\": 1,\n" + 
				"                \"state\": 1,\n" + 
				"                \"categoryId\": 4,\n" + 
				"                \"taskId\": 218,\n" + 
				"                \"link\": null\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 3,\n" + 
				"                \"name\": \"<color=#BCD3F7>累计充值达</c><color=#0000FF>10</color><color=#BCD3F7>元</color>\",\n" + 
				"                \"amount\": 2,\n" + 
				"                \"state\": 1,\n" + 
				"                \"categoryId\": 5,\n" + 
				"                \"taskId\": 221,\n" + 
				"                \"link\": \"/sign\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 3,\n" + 
				"                \"name\": \"<color=#BCD3F7>累计充值达</c><color=#0000FF>50</color><color=#BCD3F7>元</color>\",\n" + 
				"                \"amount\": 5,\n" + 
				"                \"state\": null,\n" + 
				"                \"categoryId\": 6,\n" + 
				"                \"taskId\": null,\n" + 
				"                \"link\": \"/account/deposit/?category=user\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 3,\n" + 
				"                \"name\": \"<color=#BCD3F7>累计充值达</c><color=#0000FF>100</color><color=#BCD3F7>元</color>\",\n" + 
				"                \"amount\": 10,\n" + 
				"                \"state\": null,\n" + 
				"                \"categoryId\": 7,\n" + 
				"                \"taskId\": null,\n" + 
				"                \"link\": \"/account/deposit/withdrawal?category=user\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 3,\n" + 
				"                \"name\": \"<color=#BCD3F7>累计充值达</c><color=#0000FF>200</color><color=#BCD3F7>元</color>\",\n" + 
				"                \"amount\": 20,\n" + 
				"                \"state\": null,\n" + 
				"                \"categoryId\": 7,\n" + 
				"                \"taskId\": null,\n" + 
				"                \"link\": \"/account/deposit/withdrawal?category=user\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"type\": 3,\n" + 
				"                \"name\": \"<color=#BCD3F7>累计充值达</c><color=#0000FF>500</color><color=#BCD3F7>元</color>\",\n" + 
				"                \"amount\": 50,\n" + 
				"                \"state\": null,\n" + 
				"                \"categoryId\": 7,\n" + 
				"                \"taskId\": null,\n" + 
				"                \"link\": \"/account/deposit/withdrawal?category=user\"\n" + 
				"            }\n" + 
				"        ]\n" + 
				"    },\n" + 
				"    \"message\": \"success\"\n" + 
				"}\n" + 
				"\n" + 
				"");
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
