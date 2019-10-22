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
 * Servlet implementation class GamesShishileRecords
 */
@WebServlet("/games/shishileRecords")
public class GamesShishileRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GamesShishileRecords() {
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
				"            \"eid\": \"20191012639\",\n" + 
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
				"            \"eid\": \"20191012638\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012637\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012636\",\n" + 
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
				"            \"eid\": \"20191012635\",\n" + 
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
				"            \"eid\": \"20191012634\",\n" + 
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
				"            \"eid\": \"20191012633\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012632\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
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
				"            \"eid\": \"20191012631\",\n" + 
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
				"            \"eid\": \"20191012630\",\n" + 
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
				"            \"eid\": \"20191012629\",\n" + 
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
				"            \"eid\": \"20191012628\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012627\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012626\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012625\",\n" + 
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
				"            \"eid\": \"20191012624\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012623\",\n" + 
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
				"            \"eid\": \"20191012622\",\n" + 
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
				"            \"eid\": \"20191012621\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012620\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012619\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012618\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012617\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
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
				"            \"eid\": \"20191012616\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012615\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012614\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012613\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012612\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012611\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
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
				"            \"eid\": \"20191012610\",\n" + 
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
				"            \"eid\": \"20191012609\",\n" + 
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
				"            \"eid\": \"20191012608\",\n" + 
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
				"            \"eid\": \"20191012607\",\n" + 
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
				"            \"eid\": \"20191012606\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012605\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:09\"\n" + 
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
				"            \"eid\": \"20191012604\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012603\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012602\",\n" + 
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
				"            \"eid\": \"20191012601\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012600\",\n" + 
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
				"            \"eid\": \"20191012599\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012598\",\n" + 
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
				"            \"eid\": \"20191012597\",\n" + 
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
				"            \"eid\": \"20191012596\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012595\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
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
				"            \"eid\": \"20191012594\",\n" + 
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
				"            \"eid\": \"20191012593\",\n" + 
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
				"            \"eid\": \"20191012592\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012591\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012590\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012589\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012588\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012587\",\n" + 
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
				"            \"eid\": \"20191012586\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012585\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012584\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012583\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012582\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012581\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012580\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012579\",\n" + 
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
				"            \"eid\": \"20191012578\",\n" + 
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
				"            \"eid\": \"20191012577\",\n" + 
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
				"            \"eid\": \"20191012576\",\n" + 
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
				"            \"eid\": \"20191012575\",\n" + 
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
				"            \"eid\": \"20191012574\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012573\",\n" + 
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
				"            \"eid\": \"20191012572\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
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
				"            \"eid\": \"20191012571\",\n" + 
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
				"            \"eid\": \"20191012570\",\n" + 
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
				"            \"eid\": \"20191012569\",\n" + 
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
				"            \"eid\": \"20191012568\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012567\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012566\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012565\",\n" + 
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
				"            \"eid\": \"20191012564\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012563\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012562\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:09\"\n" + 
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
				"            \"eid\": \"20191012561\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012560\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
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
				"            \"eid\": \"20191012559\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012558\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:12\"\n" + 
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
				"            \"eid\": \"20191012557\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012556\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012555\",\n" + 
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
				"            \"eid\": \"20191012554\",\n" + 
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
				"            \"eid\": \"20191012553\",\n" + 
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
				"            \"eid\": \"20191012552\",\n" + 
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
				"            \"eid\": \"20191012551\",\n" + 
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
				"            \"eid\": \"20191012550\",\n" + 
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
				"            \"eid\": \"20191012549\",\n" + 
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
				"            \"eid\": \"20191012548\",\n" + 
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
				"            \"eid\": \"20191012547\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012546\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012545\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
				"            \"eid\": \"20191012544\",\n" + 
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
				"            \"eid\": \"20191012543\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
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
				"            \"eid\": \"20191012542\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
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
				"            \"eid\": \"20191012541\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-24 18:07:10\"\n" + 
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
	}

	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(req, resp);
		H5Utils.setHeaders(resp);
	}
}
