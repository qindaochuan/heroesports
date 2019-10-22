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
 * Servlet implementation class GamesCategory
 */
@WebServlet("/games/category")
public class GamesCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GamesCategory() {
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
				"    \"data\": [\n" + 
				"        {\n" + 
				"            \"id\": 1,\n" + 
				"            \"name\": \"DOTA2\",\n" + 
				"            \"title\": \"DOTA2\",\n" + 
				"            \"icon\": \"DOTA2.svg\",\n" + 
				"            \"color\": \"#cb2828\",\n" + 
				"            \"total\": 19,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 2,\n" + 
				"            \"name\": \"CS:GO\",\n" + 
				"            \"title\": \"CSGO\",\n" + 
				"            \"icon\": \"CSGO.svg\",\n" + 
				"            \"color\": \"#f0c44c\",\n" + 
				"            \"total\": 30,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 3,\n" + 
				"            \"name\": \"LOL\",\n" + 
				"            \"title\": \"英雄联盟\",\n" + 
				"            \"icon\": \"英雄联盟.svg\",\n" + 
				"            \"color\": \"#e5b362\",\n" + 
				"            \"total\": 28,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 4,\n" + 
				"            \"name\": \"KOG\",\n" + 
				"            \"title\": \"王者荣耀\",\n" + 
				"            \"icon\": \"王者荣耀.svg\",\n" + 
				"            \"color\": \"#cb2828\",\n" + 
				"            \"total\": 2,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 5,\n" + 
				"            \"name\": \"Basketball\",\n" + 
				"            \"title\": \"篮球\",\n" + 
				"            \"icon\": \"篮球.svg\",\n" + 
				"            \"color\": \"#e46c48\",\n" + 
				"            \"total\": 7,\n" + 
				"            \"sport\": 1,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 6,\n" + 
				"            \"name\": \"Soccer\",\n" + 
				"            \"title\": \"足球\",\n" + 
				"            \"icon\": \"足球.svg\",\n" + 
				"            \"color\": \"#04b46e\",\n" + 
				"            \"total\": 42,\n" + 
				"            \"sport\": 1,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 7,\n" + 
				"            \"name\": \"Paladins\",\n" + 
				"            \"title\": \"枪火游侠\",\n" + 
				"            \"icon\": \"枪火游侠.png\",\n" + 
				"            \"color\": \"#00eeec\",\n" + 
				"            \"total\": 0,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 8,\n" + 
				"            \"name\": \"Clash Royale\",\n" + 
				"            \"title\": \"皇室战争\",\n" + 
				"            \"icon\": \"皇室战争.png\",\n" + 
				"            \"color\": \"#ffe49b\",\n" + 
				"            \"total\": 0,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 9,\n" + 
				"            \"name\": \"CF\",\n" + 
				"            \"title\": \"穿越火线\",\n" + 
				"            \"icon\": \"穿越火线.svg\",\n" + 
				"            \"color\": \"#cbdbf4\",\n" + 
				"            \"total\": 0,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 10,\n" + 
				"            \"name\": \"Overwatch\",\n" + 
				"            \"title\": \"守望先锋\",\n" + 
				"            \"icon\": \"守望先锋.svg\",\n" + 
				"            \"color\": \"#b9cff0\",\n" + 
				"            \"total\": 1,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 11,\n" + 
				"            \"name\": \"StarCraft2\",\n" + 
				"            \"title\": \"星际争霸II\",\n" + 
				"            \"icon\": \"星际争霸II.svg\",\n" + 
				"            \"color\": \"#2994d6\",\n" + 
				"            \"total\": 1,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 12,\n" + 
				"            \"name\": \"Rocket League\",\n" + 
				"            \"title\": \"火箭联盟\",\n" + 
				"            \"icon\": \"火箭联盟.svg\",\n" + 
				"            \"color\": \"#b9cff0\",\n" + 
				"            \"total\": 0,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 13,\n" + 
				"            \"name\": \"Rainbow 6\",\n" + 
				"            \"title\": \"彩虹六号\",\n" + 
				"            \"icon\": \"彩虹六号.svg\",\n" + 
				"            \"color\": \"#b9cff0\",\n" + 
				"            \"total\": 8,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 14,\n" + 
				"            \"name\": \"Hearthstone\",\n" + 
				"            \"title\": \"炉石传说\",\n" + 
				"            \"icon\": \"炉石传说.svg\",\n" + 
				"            \"color\": \"#2994d6\",\n" + 
				"            \"total\": 4,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 15,\n" + 
				"            \"name\": \"NBA2K\",\n" + 
				"            \"title\": \"NBA2K\",\n" + 
				"            \"icon\": \"NBA2K.svg\",\n" + 
				"            \"color\": \"#d40339\",\n" + 
				"            \"total\": 0,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 16,\n" + 
				"            \"name\": \"FIFA\",\n" + 
				"            \"title\": \"FIFA\",\n" + 
				"            \"icon\": \"FIFA.svg\",\n" + 
				"            \"color\": \"#b9cff0\",\n" + 
				"            \"total\": 0,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 17,\n" + 
				"            \"name\": \"WOW3\",\n" + 
				"            \"title\": \"魔兽争霸3\",\n" + 
				"            \"icon\": \"魔兽争霸3.svg\",\n" + 
				"            \"color\": \"#dbb130\",\n" + 
				"            \"total\": 0,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 18,\n" + 
				"            \"name\": \"COD\",\n" + 
				"            \"title\": \"使命召唤\",\n" + 
				"            \"icon\": \"使命召唤.svg\",\n" + 
				"            \"color\": \"#b9cff0\",\n" + 
				"            \"total\": 0,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 19,\n" + 
				"            \"name\": \"PUBG\",\n" + 
				"            \"title\": \"绝地求生\",\n" + 
				"            \"icon\": \"绝地求生.svg\",\n" + 
				"            \"color\": \"#f0c44c\",\n" + 
				"            \"total\": 2,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 20,\n" + 
				"            \"name\": \"Heroes of the Storm\",\n" + 
				"            \"title\": \"风暴英雄\",\n" + 
				"            \"icon\": \"风暴英雄.svg\",\n" + 
				"            \"color\": \"#2994d6\",\n" + 
				"            \"total\": 0,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"id\": 21,\n" + 
				"            \"name\": \"Artifact\",\n" + 
				"            \"title\": \"石器牌\",\n" + 
				"            \"icon\": \"石器牌.svg\",\n" + 
				"            \"color\": \"#f0c44c\",\n" + 
				"            \"total\": 0,\n" + 
				"            \"sport\": 0,\n" + 
				"            \"children\": []\n" + 
				"        }\n" + 
				"    ],\n" + 
				"    \"message\": \"success\"\n" + 
				"}");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		H5Utils.setHeaders(response);
	}

}
