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
		if(game == null || game.equals("lol")) {
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
		}else if(game.equals("gok")) {
			out.println("{\n" + 
					"    \"code\": 200,\n" + 
					"    \"data\": [\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:50\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 114,\n" + 
					"            \"name\": \"上官婉儿\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 1,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:50\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:50\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 115,\n" + 
					"            \"name\": \"孙策\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 2,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:50\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:50\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 116,\n" + 
					"            \"name\": \"盾山\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 3,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:50\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 117,\n" + 
					"            \"name\": \"伽罗\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 4,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 118,\n" + 
					"            \"name\": \"李信\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 5,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 119,\n" + 
					"            \"name\": \"米莱狄\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 6,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 120,\n" + 
					"            \"name\": \"狂铁\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 7,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 121,\n" + 
					"            \"name\": \"裴擒虎\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 8,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 122,\n" + 
					"            \"name\": \"明世隐\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 9,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 123,\n" + 
					"            \"name\": \"沈梦溪\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 10,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 124,\n" + 
					"            \"name\": \"公孙离\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 11,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 125,\n" + 
					"            \"name\": \"梦奇\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 12,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 126,\n" + 
					"            \"name\": \"弈星\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 13,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 127,\n" + 
					"            \"name\": \"百里守约\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 14,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 128,\n" + 
					"            \"name\": \"百里玄策\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 15,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:51\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 129,\n" + 
					"            \"name\": \"苏烈\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 16,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 130,\n" + 
					"            \"name\": \"铠\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 17,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 131,\n" + 
					"            \"name\": \"黄忠\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 18,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 132,\n" + 
					"            \"name\": \"大乔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 19,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 133,\n" + 
					"            \"name\": \"诸葛亮\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 20,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 134,\n" + 
					"            \"name\": \"鬼谷子\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 21,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 135,\n" + 
					"            \"name\": \"东皇太一\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 22,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 136,\n" + 
					"            \"name\": \"太乙真人\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 23,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 137,\n" + 
					"            \"name\": \"蔡文姬\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 24,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 138,\n" + 
					"            \"name\": \"雅典娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 25,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 139,\n" + 
					"            \"name\": \"干将莫邪\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 26,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 140,\n" + 
					"            \"name\": \"哪吒\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 27,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 141,\n" + 
					"            \"name\": \"女娲\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 28,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 142,\n" + 
					"            \"name\": \"杨戬\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 29,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 143,\n" + 
					"            \"name\": \"成吉思汗\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 30,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 144,\n" + 
					"            \"name\": \"杨玉环\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 31,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 145,\n" + 
					"            \"name\": \"钟馗\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 32,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 146,\n" + 
					"            \"name\": \"虞姬\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 33,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 147,\n" + 
					"            \"name\": \"李元芳\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 34,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 148,\n" + 
					"            \"name\": \"张飞\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 35,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 149,\n" + 
					"            \"name\": \"刘备\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 36,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 150,\n" + 
					"            \"name\": \"后羿\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 37,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 151,\n" + 
					"            \"name\": \"牛魔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 38,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 152,\n" + 
					"            \"name\": \"孙悟空\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 39,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 153,\n" + 
					"            \"name\": \"亚瑟\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 40,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 154,\n" + 
					"            \"name\": \"橘右京\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 41,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 155,\n" + 
					"            \"name\": \"娜可露露\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 42,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 156,\n" + 
					"            \"name\": \"不知火舞\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 43,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 157,\n" + 
					"            \"name\": \"张良\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 44,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 158,\n" + 
					"            \"name\": \"花木兰\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 45,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 159,\n" + 
					"            \"name\": \"兰陵王\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 46,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:52\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 160,\n" + 
					"            \"name\": \"王昭君\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 47,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 161,\n" + 
					"            \"name\": \"韩信\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 48,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 162,\n" + 
					"            \"name\": \"刘邦\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 49,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 163,\n" + 
					"            \"name\": \"姜子牙\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 50,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 164,\n" + 
					"            \"name\": \"露娜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 51,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 165,\n" + 
					"            \"name\": \"程咬金\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 52,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 166,\n" + 
					"            \"name\": \"安琪拉\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 53,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 167,\n" + 
					"            \"name\": \"貂蝉\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 54,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 168,\n" + 
					"            \"name\": \"关羽\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 55,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 169,\n" + 
					"            \"name\": \"老夫子\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 56,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 170,\n" + 
					"            \"name\": \"司马懿\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 57,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 171,\n" + 
					"            \"name\": \"武则天\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 58,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 172,\n" + 
					"            \"name\": \"项羽\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 59,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 173,\n" + 
					"            \"name\": \"达摩\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 60,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 174,\n" + 
					"            \"name\": \"狄仁杰\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 61,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 175,\n" + 
					"            \"name\": \"马可波罗\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 62,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 176,\n" + 
					"            \"name\": \"李白\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 63,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 177,\n" + 
					"            \"name\": \"宫本武藏\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 64,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 178,\n" + 
					"            \"name\": \"典韦\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 65,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 179,\n" + 
					"            \"name\": \"曹操\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 66,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 180,\n" + 
					"            \"name\": \"甄姬\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 67,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 181,\n" + 
					"            \"name\": \"夏侯惇\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 68,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 182,\n" + 
					"            \"name\": \"元歌\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 69,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 183,\n" + 
					"            \"name\": \"周瑜\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 70,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 184,\n" + 
					"            \"name\": \"吕布\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 71,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 185,\n" + 
					"            \"name\": \"芈月\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 72,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 186,\n" + 
					"            \"name\": \"白起\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 73,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 187,\n" + 
					"            \"name\": \"扁鹊\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 74,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 188,\n" + 
					"            \"name\": \"孙膑\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 75,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 189,\n" + 
					"            \"name\": \"钟无艳\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 76,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:59:43\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 190,\n" + 
					"            \"name\": \"阿轲\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 77,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 191,\n" + 
					"            \"name\": \"高渐离\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 78,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 192,\n" + 
					"            \"name\": \"刘禅\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 79,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 193,\n" + 
					"            \"name\": \"庄周\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 80,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 194,\n" + 
					"            \"name\": \"鲁班七号\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 81,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 195,\n" + 
					"            \"name\": \"孙尚香\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 82,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 196,\n" + 
					"            \"name\": \"嬴政\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 83,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 197,\n" + 
					"            \"name\": \"妲己\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 84,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 198,\n" + 
					"            \"name\": \"墨子\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 85,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 199,\n" + 
					"            \"name\": \"赵云\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 86,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 200,\n" + 
					"            \"name\": \"小乔\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 87,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:58:53\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 201,\n" + 
					"            \"name\": \"廉颇\",\n" + 
					"            \"camp\": null,\n" + 
					"            \"feature\": null,\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 1,\n" + 
					"            \"hasMagic\": 1,\n" + 
					"            \"game\": \"gok\",\n" + 
					"            \"no\": 88,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:58:53\"\n" + 
					"        }\n" + 
					"    ],\n" + 
					"    \"message\": \"success\"\n" + 
					"}");
		}
		else if(game.equals("dota")) {
			out.println("{\n" + 
					"    \"code\": 200,\n" + 
					"    \"data\": [\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 1,\n" + 
					"            \"name\": \"大地之灵 考林\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 1,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 2,\n" + 
					"            \"name\": \"孽主 维洛格罗斯\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 2,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 3,\n" + 
					"            \"name\": \"地狱领主 亚巴顿\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 3,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 4,\n" + 
					"            \"name\": \"军团指挥官 特斯丁\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 4,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 5,\n" + 
					"            \"name\": \"凤凰 伊卡洛斯\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 5,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 6,\n" + 
					"            \"name\": \"上古巨神 牛头人酋长\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 6,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 7,\n" + 
					"            \"name\": \"钢背兽 黎格沃\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 7,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 8,\n" + 
					"            \"name\": \"巨牙海民 尤弥尔\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 8,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 9,\n" + 
					"            \"name\": \"地精撕裂者 瑞兹拉克\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 9,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 10,\n" + 
					"            \"name\": \"半人猛犸 玛格纳斯\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 10,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 11,\n" + 
					"            \"name\": \"不朽尸王 吟葬者·德兹\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 11,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:25\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 12,\n" + 
					"            \"name\": \"混沌骑士 耐萨基\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 12,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:25\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 13,\n" + 
					"            \"name\": \"狼人 贝恩霍勒\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 13,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 14,\n" + 
					"            \"name\": \"裂魂人 巴拉森\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 14,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 15,\n" + 
					"            \"name\": \"末日使者 路西法\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 15,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 16,\n" + 
					"            \"name\": \"暗夜魔王 暗夜魔王\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 16,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 17,\n" + 
					"            \"name\": \"噬魂鬼 奈克斯\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 17,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 18,\n" + 
					"            \"name\": \"半人马战行者 布兰德瓦登\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 18,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 19,\n" + 
					"            \"name\": \"精灵守卫 埃欧\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 19,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 20,\n" + 
					"            \"name\": \"树精卫士 鲁夫特仑\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 20,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 21,\n" + 
					"            \"name\": \"酒仙 曼吉克斯\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 21,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 22,\n" + 
					"            \"name\": \"炼金术士 拉泽尔?黑酿\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 22,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 23,\n" + 
					"            \"name\": \"神灵武士 哈斯卡\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 23,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 24,\n" + 
					"            \"name\": \"全能骑士 普利斯特·雷霆\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 24,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:26\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 25,\n" + 
					"            \"name\": \"发条技师 瑞托崔普\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 25,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:26\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 26,\n" + 
					"            \"name\": \"龙骑士 戴维安\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 26,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 27,\n" + 
					"            \"name\": \"兽王 卡洛克\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 27,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 28,\n" + 
					"            \"name\": \"海军上将 昆卡\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 28,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 29,\n" + 
					"            \"name\": \"骷髅王 奥斯塔里昂\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 29,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 30,\n" + 
					"            \"name\": \"潮汐猎人 利维坦\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 30,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 31,\n" + 
					"            \"name\": \"鱼人守卫 斯拉达\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 31,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 32,\n" + 
					"            \"name\": \"山岭巨人 小小\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 32,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 33,\n" + 
					"            \"name\": \"流浪剑客 斯温\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 33,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 34,\n" + 
					"            \"name\": \"撼地者 雷格石蹄\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 34,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 35,\n" + 
					"            \"name\": \"沙王 克里瑟历斯\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 35,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 36,\n" + 
					"            \"name\": \"屠夫 帕吉\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 36,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 37,\n" + 
					"            \"name\": \"斧王 蒙哥可汗\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"力量\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 37,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 38,\n" + 
					"            \"name\": \"齐天大圣 孙悟空\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 38,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 39,\n" + 
					"            \"name\": \"恐怖利刃 Terrorblade\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 39,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:27\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 40,\n" + 
					"            \"name\": \"天穹守望者 泽特\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 40,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:27\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 41,\n" + 
					"            \"name\": \"灰烬之灵 焮\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 41,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 42,\n" + 
					"            \"name\": \"巨魔战将 扎·拉卡\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 42,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 43,\n" + 
					"            \"name\": \"蛇发女妖 美杜莎\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 43,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 44,\n" + 
					"            \"name\": \"赏金猎人 刚铎\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 44,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 45,\n" + 
					"            \"name\": \"复仇之魂 仙德尔莎\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 45,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 46,\n" + 
					"            \"name\": \"熊战士 乌尔萨\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 46,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 47,\n" + 
					"            \"name\": \"圣堂刺客 拉娜娅\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 47,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 48,\n" + 
					"            \"name\": \"卓尔游侠 崔希丝 \",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 48,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 49,\n" + 
					"            \"name\": \"矮人直升机 奥雷尔\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 49,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 50,\n" + 
					"            \"name\": \"隐形刺客 力丸\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 50,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 51,\n" + 
					"            \"name\": \"月之公主 米拉娜\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 51,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 52,\n" + 
					"            \"name\": \"幻影长矛手 阿兹瑞斯\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 52,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 53,\n" + 
					"            \"name\": \"娜迦海妖 司里希丝\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 53,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 54,\n" + 
					"            \"name\": \"变体精灵 墨斐琳\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 54,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 55,\n" + 
					"            \"name\": \"月之骑士 露娜\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 55,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 56,\n" + 
					"            \"name\": \"德鲁伊 悉拉\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 56,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 57,\n" + 
					"            \"name\": \"主宰 尤涅若\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 57,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 58,\n" + 
					"            \"name\": \"虚空假面 暗惧者\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 58,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 59,\n" + 
					"            \"name\": \"鱼人夜行者 斯拉克\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 59,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 60,\n" + 
					"            \"name\": \"冥界亚龙 蝮蛇\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 60,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 61,\n" + 
					"            \"name\": \"剃刀 闪电幽魂\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 61,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 62,\n" + 
					"            \"name\": \"地卜师 米波\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 62,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 63,\n" + 
					"            \"name\": \"剧毒术士 里瑟尔\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 63,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 64,\n" + 
					"            \"name\": \"幽鬼 墨丘利\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 64,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 65,\n" + 
					"            \"name\": \"影魔 奈文摩尔\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 65,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 66,\n" + 
					"            \"name\": \"幻影刺客 茉崔蒂\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 66,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 67,\n" + 
					"            \"name\": \"编织者 斯吉茨格尔\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 67,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 68,\n" + 
					"            \"name\": \"司夜刺客 阿努比·阿拉克\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 68,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 69,\n" + 
					"            \"name\": \"育母蜘蛛 布蕾克·艾拉齐娜\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 69,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 70,\n" + 
					"            \"name\": \"骷髅弓箭手 克林克兹\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 70,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 71,\n" + 
					"            \"name\": \"血魔 史德利古尔\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 71,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 72,\n" + 
					"            \"name\": \"狙击手 卡德尔·鹰眼\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 72,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 73,\n" + 
					"            \"name\": \"敌法师 玛吉纳\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"敏捷\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 73,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 74,\n" + 
					"            \"name\": \"神谕者 奈里夫\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 74,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 75,\n" + 
					"            \"name\": \"寒冬飞龙 冰龙\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 75,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 76,\n" + 
					"            \"name\": \"炸弹人 哥布林工程师\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 76,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 77,\n" + 
					"            \"name\": \"天怒法师 扎贡纳斯\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 77,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 78,\n" + 
					"            \"name\": \"双头龙 杰奇洛\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 78,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 79,\n" + 
					"            \"name\": \"魅惑魔女 爱由莎\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 79,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 80,\n" + 
					"            \"name\": \"先知 特夸亚\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 80,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 81,\n" + 
					"            \"name\": \"死灵飞龙 维萨吉\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 81,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 82,\n" + 
					"            \"name\": \"地精修补匠 鲍什\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 82,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 83,\n" + 
					"            \"name\": \"暗影恶魔 艾瑞达\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 83,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 84,\n" + 
					"            \"name\": \"暗影萨满 罗斯塔\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 84,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 85,\n" + 
					"            \"name\": \"食人魔魔法 师安格贡\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 85,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 86,\n" + 
					"            \"name\": \"沉默术士 诺崇\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 86,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 87,\n" + 
					"            \"name\": \"祈求者 卡尔\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 87,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 88,\n" + 
					"            \"name\": \"圣骑士 陈\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 88,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 89,\n" + 
					"            \"name\": \"光之守卫 伊扎洛\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 89,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 90,\n" + 
					"            \"name\": \"干扰者 萨尔\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 90,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 91,\n" + 
					"            \"name\": \"大魔导师 拉比克\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 91,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 92,\n" + 
					"            \"name\": \"黑暗贤者 依什卡菲尔\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"近战\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 92,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 93,\n" + 
					"            \"name\": \"殁境神蚀者 哈比恩格\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 93,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 94,\n" + 
					"            \"name\": \"受折磨的灵魂 拉席克\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 94,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 95,\n" + 
					"            \"name\": \"蝙蝠骑士 金扎卡\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 95,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 96,\n" + 
					"            \"name\": \"极寒幽魂 卡尔德\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 96,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 97,\n" + 
					"            \"name\": \"暗影牧师 戴泽\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 97,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 98,\n" + 
					"            \"name\": \"秀逗魔导士 莉娜\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 98,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 99,\n" + 
					"            \"name\": \"众神之王 宙斯\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 99,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 100,\n" + 
					"            \"name\": \"风行者 莱瑞蕾\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 100,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 101,\n" + 
					"            \"name\": \"风暴之灵 风暴烈酒\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 101,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 102,\n" + 
					"            \"name\": \"仙女龙 帕克\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 102,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 103,\n" + 
					"            \"name\": \"遗忘法师 帕格纳\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 103,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 104,\n" + 
					"            \"name\": \"水晶室女 莉莱\",\n" + 
					"            \"camp\": \"天辉\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 104,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 105,\n" + 
					"            \"name\": \"死亡先知 克萝贝露丝\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 105,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 106,\n" + 
					"            \"name\": \"痛苦女王 阿卡莎\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 106,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 107,\n" + 
					"            \"name\": \"术士 戴蒙·拉尼克\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 107,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 108,\n" + 
					"            \"name\": \"瘟疫法师 罗坦德吉利\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 108,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 109,\n" + 
					"            \"name\": \"谜团 达奇罗\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 109,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 110,\n" + 
					"            \"name\": \"祸乱之源 阿特洛波斯\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 110,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 111,\n" + 
					"            \"name\": \"巫妖 艾斯瑞安\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 111,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 112,\n" + 
					"            \"name\": \"恶魔巫师 萊恩\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 112,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        },\n" + 
					"        {\n" + 
					"            \"createDate\": \"2019-09-24 17:32:28\",\n" + 
					"            \"rowState\": 0,\n" + 
					"            \"id\": 113,\n" + 
					"            \"name\": \"巫医 扎瓦克\",\n" + 
					"            \"camp\": \"夜魇\",\n" + 
					"            \"feature\": \"智力\",\n" + 
					"            \"attack\": \"远程\",\n" + 
					"            \"attackShortName\": null,\n" + 
					"            \"sex\": 0,\n" + 
					"            \"hasMagic\": 0,\n" + 
					"            \"game\": \"dota\",\n" + 
					"            \"no\": 113,\n" + 
					"            \"eid\": null,\n" + 
					"            \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
					"        }\n" + 
					"    ],\n" + 
					"    \"message\": \"success\"\n" + 
					"}");
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
