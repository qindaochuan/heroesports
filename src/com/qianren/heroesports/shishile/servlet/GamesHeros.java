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
 * Servlet implementation class GamesHeros
 */
@WebServlet("/games/heros")
public class GamesHeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GamesHeros() {
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
		final String game = request.getParameter("game");
		if(game.equals("lol")) {
			System.out.println("111");
			out.println("{\n" + 
					"    \"code\": 200,\n" + 
					"    \"data\": [\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:09\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 202,\n" + 
					"            \"name\": \"暗裔剑魔 亚托克斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 1,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:09\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:09\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 203,\n" + 
					"            \"name\": \"九尾妖狐 阿狸\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 2,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:09\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:09\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 204,\n" + 
					"            \"name\": \"离群之刺 阿卡丽\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 3,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:09\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:09\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 205,\n" + 
					"            \"name\": \"牛头酋长 阿利斯塔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 4,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:09\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:09\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 206,\n" + 
					"            \"name\": \"殇之木乃伊 阿木木\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 5,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:09\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 207,\n" + 
					"            \"name\": \"冰晶凤凰 艾尼维亚\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 6,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 208,\n" + 
					"            \"name\": \"黑暗之女 安妮\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 7,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 209,\n" + 
					"            \"name\": \"寒冰射手 艾希\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 8,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 210,\n" + 
					"            \"name\": \"铸星龙王 奥瑞利安·索尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 9,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 211,\n" + 
					"            \"name\": \"沙漠皇帝 阿兹尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 10,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 212,\n" + 
					"            \"name\": \"星界游神 巴德\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 11,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 213,\n" + 
					"            \"name\": \"蒸汽机器人 布里茨\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 12,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 214,\n" + 
					"            \"name\": \"复仇焰魂 布兰德\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 13,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 215,\n" + 
					"            \"name\": \"弗雷尔卓德之心 布隆\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 14,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 216,\n" + 
					"            \"name\": \"皮城女警 凯特琳\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 15,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 217,\n" + 
					"            \"name\": \"青钢影 卡蜜尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 16,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 218,\n" + 
					"            \"name\": \"魔蛇之拥 卡西奥佩娅\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 17,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 219,\n" + 
					"            \"name\": \"虚空恐惧 科加斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 18,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 220,\n" + 
					"            \"name\": \"英勇投弹手 库奇\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 19,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:10\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 221,\n" + 
					"            \"name\": \"诺克萨斯之手 德莱厄斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 20,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 222,\n" + 
					"            \"name\": \"皎月女神 黛安娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 21,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 223,\n" + 
					"            \"name\": \"荣耀行刑官 德莱文\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 22,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 224,\n" + 
					"            \"name\": \"祖安狂人 蒙多医生\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 23,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 225,\n" + 
					"            \"name\": \"时间刺客 艾克\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 24,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 226,\n" + 
					"            \"name\": \"痛苦之拥 伊芙琳\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 26,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 227,\n" + 
					"            \"name\": \"探险家 伊泽瑞尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 27,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 228,\n" + 
					"            \"name\": \"末日使者 费德提克\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 28,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 229,\n" + 
					"            \"name\": \"无双剑姬 菲奥娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 29,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 230,\n" + 
					"            \"name\": \"潮汐海灵 菲兹\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 30,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 231,\n" + 
					"            \"name\": \"正义巨像 加里奥\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 31,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 232,\n" + 
					"            \"name\": \"海洋之灾 普朗克\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 32,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 233,\n" + 
					"            \"name\": \"德玛西亚之力 盖伦\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 33,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 234,\n" + 
					"            \"name\": \"酒桶 古拉加斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 35,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 235,\n" + 
					"            \"name\": \"法外狂徒 格雷福斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 36,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:11\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 236,\n" + 
					"            \"name\": \"战争之影 赫卡里姆\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 37,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:12\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 237,\n" + 
					"            \"name\": \"大发明家 黑默丁格\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 38,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:12\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 238,\n" + 
					"            \"name\": \"海兽祭司 俄洛伊\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 39,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:12\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 239,\n" + 
					"            \"name\": \"刀锋舞者 艾瑞莉娅\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 40,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:12\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 240,\n" + 
					"            \"name\": \"翠神 艾翁\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 41,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:12\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 241,\n" + 
					"            \"name\": \"风暴之怒 迦娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 42,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:12\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 242,\n" + 
					"            \"name\": \"德玛西亚皇子 嘉文四世\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 43,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:12\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 243,\n" + 
					"            \"name\": \"武器大师 贾克斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 44,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:12\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 244,\n" + 
					"            \"name\": \"戏命师 烬\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 46,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:12\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 245,\n" + 
					"            \"name\": \"暴走萝莉 金克丝\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 47,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:12\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 246,\n" + 
					"            \"name\": \"虚空之女 卡莎\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 48,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 247,\n" + 
					"            \"name\": \"复仇之矛 卡莉丝塔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 49,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 248,\n" + 
					"            \"name\": \"天启者 卡尔玛\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 50,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 249,\n" + 
					"            \"name\": \"死亡颂唱者 卡尔萨斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 51,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 250,\n" + 
					"            \"name\": \"虚空行者 卡萨丁\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 52,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 251,\n" + 
					"            \"name\": \"不祥之刃 卡特琳娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 53,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 252,\n" + 
					"            \"name\": \"审判天使 凯尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 54,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 253,\n" + 
					"            \"name\": \"影流之镰 凯隐\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 55,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 254,\n" + 
					"            \"name\": \"狂暴之心 凯南\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 56,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 255,\n" + 
					"            \"name\": \"虚空掠夺者 卡兹克\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 57,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 256,\n" + 
					"            \"name\": \"永猎双子 千珏\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 58,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 257,\n" + 
					"            \"name\": \"暴怒骑士 克烈\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 59,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 258,\n" + 
					"            \"name\": \"深渊巨口 克格莫\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 60,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 259,\n" + 
					"            \"name\": \"诡术妖姬 乐芙兰\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 61,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 260,\n" + 
					"            \"name\": \"盲僧 李青\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 62,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 261,\n" + 
					"            \"name\": \"曙光女神 蕾欧娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 63,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 262,\n" + 
					"            \"name\": \"冰霜女巫 丽桑卓\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 64,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 263,\n" + 
					"            \"name\": \"圣枪游侠 卢锡安\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 65,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 264,\n" + 
					"            \"name\": \"仙灵女巫 璐璐\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 66,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 265,\n" + 
					"            \"name\": \"光辉女郎 拉克丝\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 67,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 266,\n" + 
					"            \"name\": \"熔岩巨兽 墨菲特\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 68,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 267,\n" + 
					"            \"name\": \"虚空先知 玛尔扎哈\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 69,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 268,\n" + 
					"            \"name\": \"扭曲树精 茂凯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 70,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 269,\n" + 
					"            \"name\": \"无极剑圣 易\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 71,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-10-07 16:00:31\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 270,\n" + 
					"            \"name\": \"赏金猎人 厄运小姐\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 72,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 271,\n" + 
					"            \"name\": \"齐天大圣 孙悟空\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 73,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 272,\n" + 
					"            \"name\": \"铁铠冥魂 莫德凯撒\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 74,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 273,\n" + 
					"            \"name\": \"堕落天使 莫甘娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 75,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 274,\n" + 
					"            \"name\": \"唤潮鲛姬 娜美\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 76,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 275,\n" + 
					"            \"name\": \"沙漠死神 内瑟斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 77,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 276,\n" + 
					"            \"name\": \"深海泰坦 诺提勒斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 78,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 277,\n" + 
					"            \"name\": \"万花通灵 妮蔻\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 79,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 278,\n" + 
					"            \"name\": \"永恒梦魇 魔腾\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 81,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 279,\n" + 
					"            \"name\": \"雪原双子 努努和威朗普\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 82,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 280,\n" + 
					"            \"name\": \"狂战士 奥拉夫\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 83,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 281,\n" + 
					"            \"name\": \"发条魔灵 奥莉安娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 84,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 282,\n" + 
					"            \"name\": \"山隐之焰 奥恩\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 85,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 283,\n" + 
					"            \"name\": \"战争之王 潘森\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 86,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 284,\n" + 
					"            \"name\": \"圣锤之毅 波比\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 87,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 285,\n" + 
					"            \"name\": \"血港鬼影 派克\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 88,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 286,\n" + 
					"            \"name\": \"德玛西亚之翼 奎因\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 89,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 287,\n" + 
					"            \"name\": \"幻翎 洛\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 90,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 288,\n" + 
					"            \"name\": \"披甲龙龟 拉莫斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 91,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 289,\n" + 
					"            \"name\": \"虚空遁地兽 雷克塞\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 92,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 290,\n" + 
					"            \"name\": \"荒漠屠夫 雷克顿\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 93,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 291,\n" + 
					"            \"name\": \"傲之追猎者 雷恩加尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 94,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 292,\n" + 
					"            \"name\": \"放逐之刃 锐雯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 95,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 293,\n" + 
					"            \"name\": \"机械公敌 兰博\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 96,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 294,\n" + 
					"            \"name\": \"符文法师 瑞兹\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 97,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 295,\n" + 
					"            \"name\": \"北地之怒 瑟庄妮\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 98,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 296,\n" + 
					"            \"name\": \"恶魔小丑 萨科\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 99,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 297,\n" + 
					"            \"name\": \"暮光之眼 慎\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 100,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 298,\n" + 
					"            \"name\": \"龙血武姬 希瓦娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 101,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 299,\n" + 
					"            \"name\": \"炼金术士 辛吉德\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 102,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 300,\n" + 
					"            \"name\": \"亡灵战神 赛恩\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 103,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 301,\n" + 
					"            \"name\": \"战争女神 希维尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 104,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 302,\n" + 
					"            \"name\": \"水晶先锋 斯卡纳\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 105,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 303,\n" + 
					"            \"name\": \"琴瑟仙女 娑娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 106,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 304,\n" + 
					"            \"name\": \"众星之子 索拉卡\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 107,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 305,\n" + 
					"            \"name\": \"诺克萨斯统领 斯维因\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 108,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 306,\n" + 
					"            \"name\": \"暗黑元首 辛德拉\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 109,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 307,\n" + 
					"            \"name\": \"河流之王 塔姆\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 110,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 308,\n" + 
					"            \"name\": \"岩雀 塔莉垭\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 111,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 309,\n" + 
					"            \"name\": \"刀锋之影 泰隆\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 112,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 310,\n" + 
					"            \"name\": \"瓦洛兰之盾 塔里克\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 113,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 311,\n" + 
					"            \"name\": \"迅捷斥候 提莫\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 114,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 312,\n" + 
					"            \"name\": \"魂锁典狱长 锤石\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 115,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 313,\n" + 
					"            \"name\": \"麦林炮手 崔丝塔娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 116,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 314,\n" + 
					"            \"name\": \"巨魔之王 特朗德尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 117,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 315,\n" + 
					"            \"name\": \"蛮族之王 泰达米尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 118,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 316,\n" + 
					"            \"name\": \"卡牌大师 崔斯特\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 119,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 317,\n" + 
					"            \"name\": \"瘟疫之源 图奇\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 120,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 318,\n" + 
					"            \"name\": \"兽灵行者 乌迪尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 121,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 319,\n" + 
					"            \"name\": \"无畏战车 厄加特\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 122,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 320,\n" + 
					"            \"name\": \"惩戒之箭 韦鲁斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 123,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 321,\n" + 
					"            \"name\": \"暗夜猎手 薇恩\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 124,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 322,\n" + 
					"            \"name\": \"邪恶小法师 维迦\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 125,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 323,\n" + 
					"            \"name\": \"虚空之眼 维克兹\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 126,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 324,\n" + 
					"            \"name\": \"皮城执法官 蔚\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 127,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 325,\n" + 
					"            \"name\": \"机械先驱 维克托\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 128,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 326,\n" + 
					"            \"name\": \"猩红收割者 弗拉基米尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 129,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 327,\n" + 
					"            \"name\": \"雷霆咆哮 沃利贝尔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 130,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 328,\n" + 
					"            \"name\": \"祖安怒兽 沃里克\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 131,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 329,\n" + 
					"            \"name\": \"逆羽 霞\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 132,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 330,\n" + 
					"            \"name\": \"远古巫灵 泽拉斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 133,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 331,\n" + 
					"            \"name\": \"德邦总管 赵信\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 134,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 332,\n" + 
					"            \"name\": \"疾风剑豪 亚索\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 135,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 333,\n" + 
					"            \"name\": \"牧魂人 约里克\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 136,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 334,\n" + 
					"            \"name\": \"生化魔人 扎克\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 137,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 335,\n" + 
					"            \"name\": \"影流之主 劫\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 138,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 336,\n" + 
					"            \"name\": \"爆破鬼才 吉格斯\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 139,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 337,\n" + 
					"            \"name\": \"时光守护者 基兰\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 140,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 338,\n" + 
					"            \"name\": \"暮光星灵 佐伊\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 141,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 18:07:13\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 339,\n" + 
					"            \"name\": \"荆棘之兴 婕拉\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"lol\",\n" + 
					"            \"no\": 142,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
					"        }\n" + 
					"    ],\n" + 
					"    \"message\": \"success\"\n" + 
					"}");
		}else if(game.equals("")) {
			
		}
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
