package com.qianren.heroesports.shishile.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qianren.heroesports.utils.H5Utils;

/**
 * Servlet implementation class GamesShishile
 */
@WebServlet("/games/shishile")
public class GamesShishile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GamesShishile() {
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
				"  \"code\": 200,\n" + 
				"  \"data\": [\n" + 
				"    {\n" + 
				"      \"id\": 33606,\n" + 
				"      \"category\": 4,\n" + 
				"      \"state\": 0,\n" + 
				"      \"name\": \"王者时时乐\",\n" + 
				"      \"shortName\": \"aov lottery\",\n" + 
				"      \"eid\": \"20191012640\",\n" + 
				"      \"startDate\": \"2019-10-22 14:42:40\",\n" + 
				"      \"endDate\": \"2019-10-22 14:43:20\",\n" + 
				"      \"countDown\": 40,\n" + 
				"      \"lastWinner\": {\n" + 
				"        \"createDate\": \"2019-09-24 17:58:53\",\n" + 
				"        \"rowState\": 0,\n" + 
				"        \"id\": 180,\n" + 
				"        \"name\": \"甄姬\",\n" + 
				"        \"camp\": null,\n" + 
				"        \"feature\": null,\n" + 
				"        \"attack\": \"远程\",\n" + 
				"        \"attackShortName\": null,\n" + 
				"        \"sex\": 0,\n" + 
				"        \"hasMagic\": 1,\n" + 
				"        \"game\": \"gok\",\n" + 
				"        \"no\": 67,\n" + 
				"        \"eid\": null,\n" + 
				"        \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
				"      },\n" + 
				"      \"matches\": [\n" + 
				"        {\n" + 
				"          \"name\": \"英雄编号单双\",\n" + 
				"          \"shortName\": \"no even or odd\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 18,\n" + 
				"              \"name\": \"单\",\n" + 
				"              \"shortName\": \"even\",\n" + 
				"              \"odds\": 1.98\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 19,\n" + 
				"              \"name\": \"双\",\n" + 
				"              \"shortName\": \"odd\",\n" + 
				"              \"odds\": 1.98\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"name\": \"攻击方式\",\n" + 
				"          \"shortName\": \"attack type\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 24,\n" + 
				"              \"name\": \"近战\",\n" + 
				"              \"shortName\": \"melee\",\n" + 
				"              \"odds\": 1.84\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 25,\n" + 
				"              \"name\": \"远程\",\n" + 
				"              \"shortName\": \"remote\",\n" + 
				"              \"odds\": 2.01\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"name\": \"英雄性别\",\n" + 
				"          \"shortName\": \"sex\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 20,\n" + 
				"              \"name\": \"男\",\n" + 
				"              \"shortName\": \"male\",\n" + 
				"              \"odds\": 1.34\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 21,\n" + 
				"              \"name\": \"女\",\n" + 
				"              \"shortName\": \"female\",\n" + 
				"              \"odds\": 3.4\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"name\": \"有无魔法值\",\n" + 
				"          \"shortName\": \"has magic\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 22,\n" + 
				"              \"name\": \"有\",\n" + 
				"              \"shortName\": \"yes\",\n" + 
				"              \"odds\": 1.34\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 23,\n" + 
				"              \"name\": \"无\",\n" + 
				"              \"shortName\": \"no\",\n" + 
				"              \"odds\": 3.4\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      ]\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"id\": 33605,\n" + 
				"      \"category\": 3,\n" + 
				"      \"state\": 0,\n" + 
				"      \"name\": \"英雄时时乐\",\n" + 
				"      \"shortName\": \"lol lottery\",\n" + 
				"      \"eid\": \"20191012640\",\n" + 
				"      \"startDate\": \"2019-10-22 14:42:40\",\n" + 
				"      \"endDate\": \"2019-10-22 14:43:20\",\n" + 
				"      \"countDown\": 40,\n" + 
				"      \"lastWinner\": {\n" + 
				"        \"createDate\": \"2019-09-24 18:07:13\",\n" + 
				"        \"rowState\": 0,\n" + 
				"        \"id\": 318,\n" + 
				"        \"name\": \"兽灵行者 乌迪尔\",\n" + 
				"        \"camp\": null,\n" + 
				"        \"feature\": null,\n" + 
				"        \"attack\": \"近战\",\n" + 
				"        \"attackShortName\": null,\n" + 
				"        \"sex\": 1,\n" + 
				"        \"hasMagic\": 1,\n" + 
				"        \"game\": \"lol\",\n" + 
				"        \"no\": 121,\n" + 
				"        \"eid\": null,\n" + 
				"        \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
				"      },\n" + 
				"      \"matches\": [\n" + 
				"        {\n" + 
				"          \"name\": \"英雄编号单双\",\n" + 
				"          \"shortName\": \"no even or odd\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 10,\n" + 
				"              \"name\": \"单\",\n" + 
				"              \"shortName\": \"even\",\n" + 
				"              \"odds\": 1.98\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 11,\n" + 
				"              \"name\": \"双\",\n" + 
				"              \"shortName\": \"odd\",\n" + 
				"              \"odds\": 1.98\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"name\": \"攻击方式\",\n" + 
				"          \"shortName\": \"attack type\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 16,\n" + 
				"              \"name\": \"近战\",\n" + 
				"              \"shortName\": \"melee\",\n" + 
				"              \"odds\": 1.79\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 17,\n" + 
				"              \"name\": \"远程\",\n" + 
				"              \"shortName\": \"remote\",\n" + 
				"              \"odds\": 2.07\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"name\": \"英雄性别\",\n" + 
				"          \"shortName\": \"sex\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 12,\n" + 
				"              \"name\": \"男\",\n" + 
				"              \"shortName\": \"male\",\n" + 
				"              \"odds\": 1.47\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 13,\n" + 
				"              \"name\": \"女\",\n" + 
				"              \"shortName\": \"female\",\n" + 
				"              \"odds\": 2.76\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"name\": \"有无魔法值\",\n" + 
				"          \"shortName\": \"has magic\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 14,\n" + 
				"              \"name\": \"有\",\n" + 
				"              \"shortName\": \"yes\",\n" + 
				"              \"odds\": 1.13\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 15,\n" + 
				"              \"name\": \"无\",\n" + 
				"              \"shortName\": \"no\",\n" + 
				"              \"odds\": 6.33\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      ]\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"id\": 33604,\n" + 
				"      \"category\": 1,\n" + 
				"      \"state\": 0,\n" + 
				"      \"name\": \"dota时时乐\",\n" + 
				"      \"shortName\": \"dota lottery\",\n" + 
				"      \"eid\": \"20191012640\",\n" + 
				"      \"startDate\": \"2019-10-22 14:42:40\",\n" + 
				"      \"endDate\": \"2019-10-22 14:43:20\",\n" + 
				"      \"countDown\": 40,\n" + 
				"      \"lastWinner\": {\n" + 
				"        \"createDate\": \"2019-09-24 17:32:28\",\n" + 
				"        \"rowState\": 0,\n" + 
				"        \"id\": 48,\n" + 
				"        \"name\": \"卓尔游侠 崔希丝 \",\n" + 
				"        \"camp\": \"天辉\",\n" + 
				"        \"feature\": \"敏捷\",\n" + 
				"        \"attack\": \"远程\",\n" + 
				"        \"attackShortName\": null,\n" + 
				"        \"sex\": 0,\n" + 
				"        \"hasMagic\": 0,\n" + 
				"        \"game\": \"dota\",\n" + 
				"        \"no\": 48,\n" + 
				"        \"eid\": null,\n" + 
				"        \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
				"      },\n" + 
				"      \"matches\": [\n" + 
				"        {\n" + 
				"          \"name\": \"英雄编号单双\",\n" + 
				"          \"shortName\": \"no even or odd\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 1,\n" + 
				"              \"name\": \"单\",\n" + 
				"              \"shortName\": \"even\",\n" + 
				"              \"odds\": 1.98\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 2,\n" + 
				"              \"name\": \"双\",\n" + 
				"              \"shortName\": \"odd\",\n" + 
				"              \"odds\": 1.98\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"name\": \"英雄阵营\",\n" + 
				"          \"shortName\": \"camp\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 3,\n" + 
				"              \"name\": \"天辉\",\n" + 
				"              \"shortName\": \"radiant\",\n" + 
				"              \"odds\": 1.83\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 4,\n" + 
				"              \"name\": \"夜魇\",\n" + 
				"              \"shortName\": \"dire\",\n" + 
				"              \"odds\": 2.01\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"name\": \"攻击方式\",\n" + 
				"          \"shortName\": \"attack type\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 8,\n" + 
				"              \"name\": \"近战\",\n" + 
				"              \"shortName\": \"melee\",\n" + 
				"              \"odds\": 1.98\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 9,\n" + 
				"              \"name\": \"远程\",\n" + 
				"              \"shortName\": \"remote\",\n" + 
				"              \"odds\": 1.86\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"name\": \"英雄属性\",\n" + 
				"          \"shortName\": \"feature\",\n" + 
				"          \"odds\": [\n" + 
				"            {\n" + 
				"              \"id\": 5,\n" + 
				"              \"name\": \"智力\",\n" + 
				"              \"shortName\": \"smarty\",\n" + 
				"              \"odds\": 2.7\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 6,\n" + 
				"              \"name\": \"力量\",\n" + 
				"              \"shortName\": \"power\",\n" + 
				"              \"odds\": 2.9\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": 7,\n" + 
				"              \"name\": \"敏捷\",\n" + 
				"              \"shortName\": \"agility\",\n" + 
				"              \"odds\": 2.96\n" + 
				"            }\n" + 
				"          ]\n" + 
				"        }\n" + 
				"      ]\n" + 
				"    }\n" + 
				"  ],\n" + 
				"  \"message\": \"success\"\n" + 
				"}");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(req, resp);
		H5Utils.setHeaders(resp);
	}

}
