package com.qianren.heroesports.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GamesList
 */
@WebServlet("/games/list")
public class GamesList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GamesList() {
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
				"                \"id\": 12176,\n" + 
				"                \"name\": \"SL-i 群星联赛 - 亚洲\",\n" + 
				"                \"round\": 3,\n" + 
				"                \"category\": 2,\n" + 
				"                \"state\": 0,\n" + 
				"                \"type\": 0,\n" + 
				"                \"startDate\": \"2019-09-27 14:15:00\",\n" + 
				"                \"matches\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 52002,\n" + 
				"                        \"gameId\": 12176,\n" + 
				"                        \"state\": 0,\n" + 
				"                        \"name\": \"获胜者\",\n" + 
				"                        \"value\": \"\",\n" + 
				"                        \"type\": 1,\n" + 
				"                        \"canStart\": 0,\n" + 
				"                        \"startDate\": \"09-27 14:15\",\n" + 
				"                        \"betType\": 0,\n" + 
				"                        \"round\": 0,\n" + 
				"                        \"eid\": 1217616847,\n" + 
				"                        \"match\": null,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"odds\": [\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 116322,\n" + 
				"                                \"matchId\": 52002,\n" + 
				"                                \"eid\": 21519855,\n" + 
				"                                \"teamId\": 22,\n" + 
				"                                \"name\": \"5POWER\",\n" + 
				"                                \"odds\": 1.22,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-27 03:47:02\"\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 116323,\n" + 
				"                                \"matchId\": 52002,\n" + 
				"                                \"eid\": 21519856,\n" + 
				"                                \"teamId\": 1162,\n" + 
				"                                \"name\": \"JiJieHao\",\n" + 
				"                                \"odds\": 4.13,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-27 03:47:02\"\n" + 
				"                            }\n" + 
				"                        ],\n" + 
				"                        \"game\": null,\n" + 
				"                        \"betAmount\": null,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"teamLeftId\": 22,\n" + 
				"                \"teamRightId\": 1162,\n" + 
				"                \"scoreLeft\": 0,\n" + 
				"                \"scoreRight\": 0,\n" + 
				"                \"teams\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-08-21 03:12:48\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 16406,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/a69bccffc8b8030792ef076959f90630.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-08-21 03:12:48\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-18 03:06:08\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 18027630,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/2c1bc68e92c4b9f12feb1fe0095bfef1.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-09-18 03:06:08\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"playCount\": 74\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"id\": 12211,\n" + 
				"                \"name\": \"SL-i 群星联赛 - 亚洲\",\n" + 
				"                \"round\": 3,\n" + 
				"                \"category\": 2,\n" + 
				"                \"state\": 0,\n" + 
				"                \"type\": 0,\n" + 
				"                \"startDate\": \"2019-09-27 17:30:00\",\n" + 
				"                \"matches\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:53:05\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 52110,\n" + 
				"                        \"gameId\": 12211,\n" + 
				"                        \"state\": 0,\n" + 
				"                        \"name\": \"获胜者\",\n" + 
				"                        \"value\": \"\",\n" + 
				"                        \"type\": 1,\n" + 
				"                        \"canStart\": 0,\n" + 
				"                        \"startDate\": \"09-27 17:30\",\n" + 
				"                        \"betType\": 0,\n" + 
				"                        \"round\": 0,\n" + 
				"                        \"eid\": 1221116847,\n" + 
				"                        \"match\": null,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"odds\": [\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-27 00:53:05\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 116546,\n" + 
				"                                \"matchId\": 52110,\n" + 
				"                                \"eid\": 21521331,\n" + 
				"                                \"teamId\": 1026,\n" + 
				"                                \"name\": \"AUGUST\",\n" + 
				"                                \"odds\": 1.77,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-27 00:53:05\"\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-27 00:53:05\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 116547,\n" + 
				"                                \"matchId\": 52110,\n" + 
				"                                \"eid\": 21521332,\n" + 
				"                                \"teamId\": 1304,\n" + 
				"                                \"name\": \"EHOME\",\n" + 
				"                                \"odds\": 2.01,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-27 00:53:05\"\n" + 
				"                            }\n" + 
				"                        ],\n" + 
				"                        \"game\": null,\n" + 
				"                        \"betAmount\": null,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:53:05\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"teamLeftId\": 1026,\n" + 
				"                \"teamRightId\": 1304,\n" + 
				"                \"scoreLeft\": 0,\n" + 
				"                \"scoreRight\": 0,\n" + 
				"                \"teams\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-11 21:02:01\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 1026,\n" + 
				"                        \"name\": \"AUGUST\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 20714407,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/2c1bc68e92c4b9f12feb1fe0095bfef1.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-09-11 21:02:01\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-22 00:58:01\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 1304,\n" + 
				"                        \"name\": \"EHOME\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 16457,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/8eca4bfeebe02529b1234012a1bcd792.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-09-22 00:58:01\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"playCount\": 74\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"id\": 11560,\n" + 
				"                \"name\": \"LOOT.B第四季\",\n" + 
				"                \"round\": 3,\n" + 
				"                \"category\": 2,\n" + 
				"                \"state\": 0,\n" + 
				"                \"type\": 0,\n" + 
				"                \"startDate\": \"2019-09-27 18:30:00\",\n" + 
				"                \"matches\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-26 21:45:11\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 51723,\n" + 
				"                        \"gameId\": 11560,\n" + 
				"                        \"state\": 0,\n" + 
				"                        \"name\": \"获胜者\",\n" + 
				"                        \"value\": \"\",\n" + 
				"                        \"type\": 1,\n" + 
				"                        \"canStart\": 0,\n" + 
				"                        \"startDate\": \"09-27 18:30\",\n" + 
				"                        \"betType\": 0,\n" + 
				"                        \"round\": 0,\n" + 
				"                        \"eid\": 1156016847,\n" + 
				"                        \"match\": null,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"odds\": [\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-26 21:45:11\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 115728,\n" + 
				"                                \"matchId\": 51723,\n" + 
				"                                \"eid\": 21517145,\n" + 
				"                                \"teamId\": 704,\n" + 
				"                                \"name\": \"Nordavind\",\n" + 
				"                                \"odds\": 1.62,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-26 21:45:11\"\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-26 21:45:11\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 115729,\n" + 
				"                                \"matchId\": 51723,\n" + 
				"                                \"eid\": 21517146,\n" + 
				"                                \"teamId\": 45,\n" + 
				"                                \"name\": \"Team Heretics\",\n" + 
				"                                \"odds\": 2.24,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-26 21:45:11\"\n" + 
				"                            }\n" + 
				"                        ],\n" + 
				"                        \"game\": null,\n" + 
				"                        \"betAmount\": null,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-26 21:45:11\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"teamLeftId\": 704,\n" + 
				"                \"teamRightId\": 45,\n" + 
				"                \"scoreLeft\": 0,\n" + 
				"                \"scoreRight\": 0,\n" + 
				"                \"teams\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-04 02:02:13\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 704,\n" + 
				"                        \"name\": \"Nordavind\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 73254,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/5e2e647642b6e234964fe20ac325c46c.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-09-04 02:02:13\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-08-21 03:13:26\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 45,\n" + 
				"                        \"name\": \"Team Heretics\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 3778491,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/cd1c7361df8ca11bd2582951af75f4b5.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-08-21 03:13:26\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"playCount\": 64\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"id\": 12220,\n" + 
				"                \"name\": \"SL-i 群星联赛 - 亚洲\",\n" + 
				"                \"round\": 3,\n" + 
				"                \"category\": 2,\n" + 
				"                \"state\": 0,\n" + 
				"                \"type\": 0,\n" + 
				"                \"startDate\": \"2019-09-27 20:45:00\",\n" + 
				"                \"matches\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 01:03:16\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 52150,\n" + 
				"                        \"gameId\": 12220,\n" + 
				"                        \"state\": 0,\n" + 
				"                        \"name\": \"获胜者\",\n" + 
				"                        \"value\": \"\",\n" + 
				"                        \"type\": 1,\n" + 
				"                        \"canStart\": 0,\n" + 
				"                        \"startDate\": \"09-27 20:45\",\n" + 
				"                        \"betType\": 0,\n" + 
				"                        \"round\": 0,\n" + 
				"                        \"eid\": 1222016847,\n" + 
				"                        \"match\": null,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"odds\": [\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-27 01:03:16\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 116628,\n" + 
				"                                \"matchId\": 52150,\n" + 
				"                                \"eid\": 21521813,\n" + 
				"                                \"teamId\": 1217,\n" + 
				"                                \"name\": \"Lynn Vision\",\n" + 
				"                                \"odds\": 2.28,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-27 01:03:16\"\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-27 01:03:16\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 116629,\n" + 
				"                                \"matchId\": 52150,\n" + 
				"                                \"eid\": 21521814,\n" + 
				"                                \"teamId\": 362,\n" + 
				"                                \"name\": \"BTRG\",\n" + 
				"                                \"odds\": 1.6,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-27 01:03:16\"\n" + 
				"                            }\n" + 
				"                        ],\n" + 
				"                        \"game\": null,\n" + 
				"                        \"betAmount\": null,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 01:03:16\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"teamLeftId\": 1217,\n" + 
				"                \"teamRightId\": 362,\n" + 
				"                \"scoreLeft\": 0,\n" + 
				"                \"scoreRight\": 0,\n" + 
				"                \"teams\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-20 09:19:01\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 1217,\n" + 
				"                        \"name\": \"Lynn Vision\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 24517,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/d347af0589ac1d20a7fc749d3a3ab747.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-09-20 09:19:01\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-08-21 03:15:58\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 362,\n" + 
				"                        \"name\": \"BTRG\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 1536160,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/edc9f7d91843f789d94139df58b5e537.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-08-21 03:15:58\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"playCount\": 74\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"id\": 12320,\n" + 
				"                \"name\": \"SL-i 群星联赛 - 欧洲\",\n" + 
				"                \"round\": 3,\n" + 
				"                \"category\": 2,\n" + 
				"                \"state\": 0,\n" + 
				"                \"type\": 0,\n" + 
				"                \"startDate\": \"2019-09-27 21:00:00\",\n" + 
				"                \"matches\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 02:42:11\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 52427,\n" + 
				"                        \"gameId\": 12320,\n" + 
				"                        \"state\": 0,\n" + 
				"                        \"name\": \"获胜者\",\n" + 
				"                        \"value\": \"\",\n" + 
				"                        \"type\": 1,\n" + 
				"                        \"canStart\": 0,\n" + 
				"                        \"startDate\": \"09-27 21:00\",\n" + 
				"                        \"betType\": 0,\n" + 
				"                        \"round\": 0,\n" + 
				"                        \"eid\": 1232016847,\n" + 
				"                        \"match\": null,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"odds\": [\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-27 02:42:11\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 117218,\n" + 
				"                                \"matchId\": 52427,\n" + 
				"                                \"eid\": 21523784,\n" + 
				"                                \"teamId\": 892,\n" + 
				"                                \"name\": \"GamerLegion\",\n" + 
				"                                \"odds\": 1.4,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-27 02:42:11\"\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-27 02:42:11\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 117219,\n" + 
				"                                \"matchId\": 52427,\n" + 
				"                                \"eid\": 21523785,\n" + 
				"                                \"teamId\": 1155,\n" + 
				"                                \"name\": \"Nemiga\",\n" + 
				"                                \"odds\": 2.87,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-27 02:42:11\"\n" + 
				"                            }\n" + 
				"                        ],\n" + 
				"                        \"game\": null,\n" + 
				"                        \"betAmount\": null,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 02:42:11\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"teamLeftId\": 892,\n" + 
				"                \"teamRightId\": 1155,\n" + 
				"                \"scoreLeft\": 0,\n" + 
				"                \"scoreRight\": 0,\n" + 
				"                \"teams\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-08 07:51:01\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 892,\n" + 
				"                        \"name\": \"GamerLegion\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 9235073,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/3d01e7a2f222f660cf2407cfe9e694ef.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-09-08 07:51:01\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-17 02:01:09\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 1155,\n" + 
				"                        \"name\": \"Nemiga\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 16333,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/df5b8edfa27cb9790c12daad5bc64b40.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-09-17 02:01:09\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"playCount\": 66\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"id\": 11455,\n" + 
				"                \"name\": \"LOOT.B第四季\",\n" + 
				"                \"round\": 3,\n" + 
				"                \"category\": 2,\n" + 
				"                \"state\": 0,\n" + 
				"                \"type\": 0,\n" + 
				"                \"startDate\": \"2019-09-27 21:30:00\",\n" + 
				"                \"matches\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-26 21:32:08\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 51644,\n" + 
				"                        \"gameId\": 11455,\n" + 
				"                        \"state\": 0,\n" + 
				"                        \"name\": \"获胜者\",\n" + 
				"                        \"value\": \"\",\n" + 
				"                        \"type\": 1,\n" + 
				"                        \"canStart\": 0,\n" + 
				"                        \"startDate\": \"09-27 21:30\",\n" + 
				"                        \"betType\": 0,\n" + 
				"                        \"round\": 0,\n" + 
				"                        \"eid\": 1145516847,\n" + 
				"                        \"match\": null,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"odds\": [\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-26 21:32:08\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 115556,\n" + 
				"                                \"matchId\": 51644,\n" + 
				"                                \"eid\": 21495268,\n" + 
				"                                \"teamId\": 28,\n" + 
				"                                \"name\": \"HAVU\",\n" + 
				"                                \"odds\": 1.26,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-26 23:30:07\"\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-26 21:32:08\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 115557,\n" + 
				"                                \"matchId\": 51644,\n" + 
				"                                \"eid\": 21495269,\n" + 
				"                                \"teamId\": 950,\n" + 
				"                                \"name\": \"PACT\",\n" + 
				"                                \"odds\": 3.71,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-26 23:30:07\"\n" + 
				"                            }\n" + 
				"                        ],\n" + 
				"                        \"game\": null,\n" + 
				"                        \"betAmount\": null,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 01:26:07\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"teamLeftId\": 28,\n" + 
				"                \"teamRightId\": 950,\n" + 
				"                \"scoreLeft\": 0,\n" + 
				"                \"scoreRight\": 0,\n" + 
				"                \"teams\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-08-21 03:12:48\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 28,\n" + 
				"                        \"name\": \"HAVU\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 16455,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/3043edbcaf0d49cc758d7c783937ced8.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-08-21 03:12:48\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-09 21:32:02\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 950,\n" + 
				"                        \"name\": \"PACT\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 16319,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/40627ac79157a591534baeba9af49362.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-09-09 21:32:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"playCount\": 66\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"id\": 12142,\n" + 
				"                \"name\": \"ESL One 纽约\",\n" + 
				"                \"round\": 3,\n" + 
				"                \"category\": 2,\n" + 
				"                \"state\": 0,\n" + 
				"                \"type\": 0,\n" + 
				"                \"startDate\": \"2019-09-27 23:00:00\",\n" + 
				"                \"matches\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-26 23:46:08\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 51804,\n" + 
				"                        \"gameId\": 12142,\n" + 
				"                        \"state\": 0,\n" + 
				"                        \"name\": \"获胜者\",\n" + 
				"                        \"value\": \"\",\n" + 
				"                        \"type\": 1,\n" + 
				"                        \"canStart\": 0,\n" + 
				"                        \"startDate\": \"09-27 23:00\",\n" + 
				"                        \"betType\": 0,\n" + 
				"                        \"round\": 0,\n" + 
				"                        \"eid\": 1214216847,\n" + 
				"                        \"match\": null,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"odds\": [\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-26 23:46:08\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 115918,\n" + 
				"                                \"matchId\": 51804,\n" + 
				"                                \"eid\": 21519334,\n" + 
				"                                \"teamId\": 87,\n" + 
				"                                \"name\": \"Astralis\",\n" + 
				"                                \"odds\": 1.32,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-27 02:11:07\"\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-26 23:46:08\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 115919,\n" + 
				"                                \"matchId\": 51804,\n" + 
				"                                \"eid\": 21519335,\n" + 
				"                                \"teamId\": 3640,\n" + 
				"                                \"name\": \"Evil Geniuses\",\n" + 
				"                                \"odds\": 3.4,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-27 02:11:07\"\n" + 
				"                            }\n" + 
				"                        ],\n" + 
				"                        \"game\": null,\n" + 
				"                        \"betAmount\": null,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-26 23:46:08\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"teamLeftId\": 87,\n" + 
				"                \"teamRightId\": 3640,\n" + 
				"                \"scoreLeft\": 0,\n" + 
				"                \"scoreRight\": 0,\n" + 
				"                \"teams\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-08-21 03:13:27\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 87,\n" + 
				"                        \"name\": \"Astralis\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 16283,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/5a9cf2dbb766bbc58911056d0331ed06.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-08-21 03:13:27\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-26 23:46:01\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 3640,\n" + 
				"                        \"name\": \"Evil Geniuses\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 16603965,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/6c8ea841068bd713b4e063481498719a.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-09-26 23:46:01\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"playCount\": 76\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"id\": 12151,\n" + 
				"                \"name\": \"ESL One 纽约\",\n" + 
				"                \"round\": 3,\n" + 
				"                \"category\": 2,\n" + 
				"                \"state\": 0,\n" + 
				"                \"type\": 0,\n" + 
				"                \"startDate\": \"2019-09-27 23:00:00\",\n" + 
				"                \"matches\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-26 23:54:08\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 51880,\n" + 
				"                        \"gameId\": 12151,\n" + 
				"                        \"state\": 0,\n" + 
				"                        \"name\": \"获胜者\",\n" + 
				"                        \"value\": \"\",\n" + 
				"                        \"type\": 1,\n" + 
				"                        \"canStart\": 0,\n" + 
				"                        \"startDate\": \"09-27 23:00\",\n" + 
				"                        \"betType\": 0,\n" + 
				"                        \"round\": 0,\n" + 
				"                        \"eid\": 1215116847,\n" + 
				"                        \"match\": null,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"odds\": [\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-26 23:54:08\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 116072,\n" + 
				"                                \"matchId\": 51880,\n" + 
				"                                \"eid\": 21519561,\n" + 
				"                                \"teamId\": 309,\n" + 
				"                                \"name\": \"OpTic Gaming\",\n" + 
				"                                \"odds\": 2.46,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-26 23:54:08\"\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"createDate\": \"2019-09-26 23:54:08\",\n" + 
				"                                \"rowState\": 0,\n" + 
				"                                \"id\": 116073,\n" + 
				"                                \"matchId\": 51880,\n" + 
				"                                \"eid\": 21519562,\n" + 
				"                                \"teamId\": 91,\n" + 
				"                                \"name\": \"FaZe\",\n" + 
				"                                \"odds\": 1.55,\n" + 
				"                                \"manual\": 0,\n" + 
				"                                \"winner\": 0,\n" + 
				"                                \"score\": 0,\n" + 
				"                                \"betAmount\": 0,\n" + 
				"                                \"lastModifiedDate\": \"2019-09-26 23:54:08\"\n" + 
				"                            }\n" + 
				"                        ],\n" + 
				"                        \"game\": null,\n" + 
				"                        \"betAmount\": null,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-26 23:54:08\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"teamLeftId\": 309,\n" + 
				"                \"teamRightId\": 91,\n" + 
				"                \"scoreLeft\": 0,\n" + 
				"                \"scoreRight\": 0,\n" + 
				"                \"teams\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-08-21 03:15:46\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 309,\n" + 
				"                        \"name\": \"OpTic Gaming\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 16409,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/1b4f81961c3fcd154fe3ad1b1b2fc971.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-08-21 03:15:46\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-08-21 03:13:27\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 91,\n" + 
				"                        \"name\": \"FaZe\",\n" + 
				"                        \"league\": null,\n" + 
				"                        \"category\": 2,\n" + 
				"                        \"image\": null,\n" + 
				"                        \"eid\": 16499,\n" + 
				"                        \"eimage\": \"www.nmgdjkj.com/file/120478e19940cb9138ea42c726b40cf0.png\",\n" + 
				"                        \"origin\": \"raybet\",\n" + 
				"                        \"lastModifiedDate\": \"2019-08-21 03:13:27\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"playCount\": 76\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"pageable\": {\n" + 
				"            \"sort\": {\n" + 
				"                \"sorted\": false,\n" + 
				"                \"unsorted\": true,\n" + 
				"                \"empty\": true\n" + 
				"            },\n" + 
				"            \"pageSize\": 10,\n" + 
				"            \"pageNumber\": 0,\n" + 
				"            \"offset\": 0,\n" + 
				"            \"unpaged\": false,\n" + 
				"            \"paged\": true\n" + 
				"        },\n" + 
				"        \"totalPages\": 1,\n" + 
				"        \"totalElements\": 8,\n" + 
				"        \"last\": true,\n" + 
				"        \"first\": true,\n" + 
				"        \"sort\": {\n" + 
				"            \"sorted\": false,\n" + 
				"            \"unsorted\": true,\n" + 
				"            \"empty\": true\n" + 
				"        },\n" + 
				"        \"numberOfElements\": 8,\n" + 
				"        \"size\": 10,\n" + 
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
		resp.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
		resp.setHeader("X-Powered-By", "3.2.1");
		resp.setHeader("Access-Control-Allow-Credentials", "true");

		resp.setHeader("Content-Type", "application/json;charset=utf-8");
	}
}
