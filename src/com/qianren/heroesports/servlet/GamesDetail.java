package com.qianren.heroesports.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GamesDetail
 */
@WebServlet("/games/detail")
public class GamesDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GamesDetail() {
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
				"        \"createDate\": \"2019-09-27 00:18:02\",\n" + 
				"        \"rowState\": 0,\n" + 
				"        \"id\": 12176,\n" + 
				"        \"name\": \"SL-i 群星联赛 - 亚洲\",\n" + 
				"        \"category\": 2,\n" + 
				"        \"league\": null,\n" + 
				"        \"type\": 0,\n" + 
				"        \"round\": 3,\n" + 
				"        \"teamLeftId\": 22,\n" + 
				"        \"teamLeft\": null,\n" + 
				"        \"teamRightId\": 1162,\n" + 
				"        \"teamRight\": null,\n" + 
				"        \"winner\": 0,\n" + 
				"        \"scoreLeft\": 0,\n" + 
				"        \"scoreRight\": 0,\n" + 
				"        \"startDate\": \"2019-09-27 14:00:00\",\n" + 
				"        \"endDate\": \"2019-09-27 20:15:00\",\n" + 
				"        \"liveType\": null,\n" + 
				"        \"liveUrl\": \"\",\n" + 
				"        \"dataLiveUrl\": null,\n" + 
				"        \"state\": 0,\n" + 
				"        \"eid\": 21516341,\n" + 
				"        \"origin\": \"raybet\",\n" + 
				"        \"lastWinner\": null,\n" + 
				"        \"matches\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52002,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"获胜者\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 1,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 0,\n" + 
				"                \"eid\": 1217616847,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116322,\n" + 
				"                        \"matchId\": 52002,\n" + 
				"                        \"eid\": 21519855,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.15,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:27:03\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116323,\n" + 
				"                        \"matchId\": 52002,\n" + 
				"                        \"eid\": 21519856,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 5.17,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:27:03\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52004,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"5POWER-1.5\",\n" + 
				"                \"value\": \"1.5\",\n" + 
				"                \"type\": 2,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 0,\n" + 
				"                \"eid\": 1217616855,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116328,\n" + 
				"                        \"matchId\": 52004,\n" + 
				"                        \"eid\": 21519875,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER让分-1.5\",\n" + 
				"                        \"odds\": 1.73,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:29:03\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116329,\n" + 
				"                        \"matchId\": 52004,\n" + 
				"                        \"eid\": 21519876,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao让分+1.5\",\n" + 
				"                        \"odds\": 2.03,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:29:03\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52005,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"地图总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 4,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 0,\n" + 
				"                \"eid\": 1217616856,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116330,\n" + 
				"                        \"matchId\": 52005,\n" + 
				"                        \"eid\": 21519880,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 2.35,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116331,\n" + 
				"                        \"matchId\": 52005,\n" + 
				"                        \"eid\": 21519881,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 1.55,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52003,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"正确地图比分\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 6,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 0,\n" + 
				"                \"eid\": 121766343269,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116324,\n" + 
				"                        \"matchId\": 52003,\n" + 
				"                        \"eid\": 21519857,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"5POWER 2-0 JiJieHao\",\n" + 
				"                        \"odds\": 1.52,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:17:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116325,\n" + 
				"                        \"matchId\": 52003,\n" + 
				"                        \"eid\": 21519858,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"5POWER 0-2 JiJieHao\",\n" + 
				"                        \"odds\": 8.8,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116326,\n" + 
				"                        \"matchId\": 52003,\n" + 
				"                        \"eid\": 21519859,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"5POWER 2-1 JiJieHao\",\n" + 
				"                        \"odds\": 3.4,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116327,\n" + 
				"                        \"matchId\": 52003,\n" + 
				"                        \"eid\": 21519860,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"5POWER 1-2 JiJieHao\",\n" + 
				"                        \"odds\": 5.5,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52006,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"获胜者\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 1,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 1217616854,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116332,\n" + 
				"                        \"matchId\": 52006,\n" + 
				"                        \"eid\": 21519885,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.26,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:22:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116333,\n" + 
				"                        \"matchId\": 52006,\n" + 
				"                        \"eid\": 21519886,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 3.71,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:22:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52007,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"5POWER-5.5\",\n" + 
				"                \"value\": \"5.5\",\n" + 
				"                \"type\": 2,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 1217616860,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116334,\n" + 
				"                        \"matchId\": 52007,\n" + 
				"                        \"eid\": 21519887,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER让分-5.5\",\n" + 
				"                        \"odds\": 2.17,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:30:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116335,\n" + 
				"                        \"matchId\": 52007,\n" + 
				"                        \"eid\": 21519888,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao让分+5.5\",\n" + 
				"                        \"odds\": 1.64,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:30:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52011,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"回合总数单双\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 21,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 1217634151,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116342,\n" + 
				"                        \"matchId\": 52011,\n" + 
				"                        \"eid\": 21519895,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"比分为单\",\n" + 
				"                        \"odds\": 2.1,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:07:03\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116343,\n" + 
				"                        \"matchId\": 52011,\n" + 
				"                        \"eid\": 21519896,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"比分为双\",\n" + 
				"                        \"odds\": 1.74,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:07:03\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52008,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"回合总数大小25.5\",\n" + 
				"                \"value\": \"25.5\",\n" + 
				"                \"type\": 22,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 1217616861,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116336,\n" + 
				"                        \"matchId\": 52008,\n" + 
				"                        \"eid\": 21519889,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>25.5\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:24:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116337,\n" + 
				"                        \"matchId\": 52008,\n" + 
				"                        \"eid\": 21519890,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<25.5\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:24:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52027,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第二手枪局获胜者\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 1217616874,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116374,\n" + 
				"                        \"matchId\": 52027,\n" + 
				"                        \"eid\": 21519933,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116375,\n" + 
				"                        \"matchId\": 52027,\n" + 
				"                        \"eid\": 21519934,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 2.16,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52064,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第四回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763997654,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116448,\n" + 
				"                        \"matchId\": 52064,\n" + 
				"                        \"eid\": 21520389,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116449,\n" + 
				"                        \"matchId\": 52064,\n" + 
				"                        \"eid\": 21520390,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52028,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第二手枪局首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763998985,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116376,\n" + 
				"                        \"matchId\": 52028,\n" + 
				"                        \"eid\": 21519935,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.25,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116377,\n" + 
				"                        \"matchId\": 52028,\n" + 
				"                        \"eid\": 21519936,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.6,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52029,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第二手枪局首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763999032,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116378,\n" + 
				"                        \"matchId\": 52029,\n" + 
				"                        \"eid\": 21519937,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 1.1,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116379,\n" + 
				"                        \"matchId\": 52029,\n" + 
				"                        \"eid\": 21519938,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 6.21,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52030,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"是否进入加时赛\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 12176161196,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116380,\n" + 
				"                        \"matchId\": 52030,\n" + 
				"                        \"eid\": 21520183,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 10.09,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116381,\n" + 
				"                        \"matchId\": 52030,\n" + 
				"                        \"eid\": 21520184,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.03,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52031,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"C4炸弹爆炸获得胜利次数最多队伍（不含加时赛）\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763999872,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116382,\n" + 
				"                        \"matchId\": 52031,\n" + 
				"                        \"eid\": 21520194,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116383,\n" + 
				"                        \"matchId\": 52031,\n" + 
				"                        \"eid\": 21520195,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 2.16,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52032,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"炸弹拆除次数最多队伍（不含加时赛）\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763999986,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116384,\n" + 
				"                        \"matchId\": 52032,\n" + 
				"                        \"eid\": 21520197,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116385,\n" + 
				"                        \"matchId\": 52032,\n" + 
				"                        \"eid\": 21520198,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 2.16,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52033,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"C4炸弹爆炸获得胜利总数大小（不含加时赛）4.5\",\n" + 
				"                \"value\": \"4.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 12176295635,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116386,\n" + 
				"                        \"matchId\": 52033,\n" + 
				"                        \"eid\": 21520202,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>4.5\",\n" + 
				"                        \"odds\": 2.19,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:22:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116387,\n" + 
				"                        \"matchId\": 52033,\n" + 
				"                        \"eid\": 21520203,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<4.5\",\n" + 
				"                        \"odds\": 1.63,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:22:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52034,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"炸弹拆除总数大小（不含加时赛）3.5\",\n" + 
				"                \"value\": \"3.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121764000025,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116388,\n" + 
				"                        \"matchId\": 52034,\n" + 
				"                        \"eid\": 21520204,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>3.5\",\n" + 
				"                        \"odds\": 2.17,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:17:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116389,\n" + 
				"                        \"matchId\": 52034,\n" + 
				"                        \"eid\": 21520205,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<3.5\",\n" + 
				"                        \"odds\": 1.64,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:17:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52035,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"炸弹拆除总数单双（不含加时赛）\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121764000040,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116390,\n" + 
				"                        \"matchId\": 52035,\n" + 
				"                        \"eid\": 21520208,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"比分为单\",\n" + 
				"                        \"odds\": 1.91,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:03:03\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116391,\n" + 
				"                        \"matchId\": 52035,\n" + 
				"                        \"eid\": 21520209,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"比分为双\",\n" + 
				"                        \"odds\": 1.89,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:03:03\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52036,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"首先赢得十个回合者\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 1217616876,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116392,\n" + 
				"                        \"matchId\": 52036,\n" + 
				"                        \"eid\": 21520213,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.4,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:24:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116393,\n" + 
				"                        \"matchId\": 52036,\n" + 
				"                        \"eid\": 21520214,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 2.82,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:24:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52069,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十四回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 12176282115,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116458,\n" + 
				"                        \"matchId\": 52069,\n" + 
				"                        \"eid\": 21520435,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116459,\n" + 
				"                        \"matchId\": 52069,\n" + 
				"                        \"eid\": 21520436,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52068,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十二回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763998903,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116456,\n" + 
				"                        \"matchId\": 52068,\n" + 
				"                        \"eid\": 21520425,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116457,\n" + 
				"                        \"matchId\": 52068,\n" + 
				"                        \"eid\": 21520426,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52067,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763998705,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116454,\n" + 
				"                        \"matchId\": 52067,\n" + 
				"                        \"eid\": 21520415,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116455,\n" + 
				"                        \"matchId\": 52067,\n" + 
				"                        \"eid\": 21520416,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52066,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第八回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763998520,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116452,\n" + 
				"                        \"matchId\": 52066,\n" + 
				"                        \"eid\": 21520406,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116453,\n" + 
				"                        \"matchId\": 52066,\n" + 
				"                        \"eid\": 21520407,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52065,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第六回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763997786,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116450,\n" + 
				"                        \"matchId\": 52065,\n" + 
				"                        \"eid\": 21520399,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116451,\n" + 
				"                        \"matchId\": 52065,\n" + 
				"                        \"eid\": 21520400,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52025,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十四回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 12176282084,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116370,\n" + 
				"                        \"matchId\": 52025,\n" + 
				"                        \"eid\": 21519927,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.6,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:11:03\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116371,\n" + 
				"                        \"matchId\": 52025,\n" + 
				"                        \"eid\": 21519928,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.25,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:11:03\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52009,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"$T1 回合总数大小15.5\",\n" + 
				"                \"value\": \"15.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 1217618471851,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116338,\n" + 
				"                        \"matchId\": 52009,\n" + 
				"                        \"eid\": 21519891,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>15.5\",\n" + 
				"                        \"odds\": 1.25,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116339,\n" + 
				"                        \"matchId\": 52009,\n" + 
				"                        \"eid\": 21519892,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<15.5\",\n" + 
				"                        \"odds\": 3.7,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52010,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"$T2 回合总数大小10.5\",\n" + 
				"                \"value\": \"10.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 1217618472044,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116340,\n" + 
				"                        \"matchId\": 52010,\n" + 
				"                        \"eid\": 21519893,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>10.5\",\n" + 
				"                        \"odds\": 1.75,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:19:03\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116341,\n" + 
				"                        \"matchId\": 52010,\n" + 
				"                        \"eid\": 21519894,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<10.5\",\n" + 
				"                        \"odds\": 2.01,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:19:03\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:02\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52012,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第一手枪局获胜者\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 1217616873,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116344,\n" + 
				"                        \"matchId\": 52012,\n" + 
				"                        \"eid\": 21519898,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.62,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:30:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116345,\n" + 
				"                        \"matchId\": 52012,\n" + 
				"                        \"eid\": 21519899,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 2.21,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:30:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52013,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第一手枪局首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763997456,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116346,\n" + 
				"                        \"matchId\": 52013,\n" + 
				"                        \"eid\": 21519900,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.25,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116347,\n" + 
				"                        \"matchId\": 52013,\n" + 
				"                        \"eid\": 21519901,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.6,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52014,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第一手枪局首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763997479,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116348,\n" + 
				"                        \"matchId\": 52014,\n" + 
				"                        \"eid\": 21519902,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 1.09,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:08:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116349,\n" + 
				"                        \"matchId\": 52014,\n" + 
				"                        \"eid\": 21519903,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 6.55,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:08:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52015,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第四回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763997626,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116350,\n" + 
				"                        \"matchId\": 52015,\n" + 
				"                        \"eid\": 21519904,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.6,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:17:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116351,\n" + 
				"                        \"matchId\": 52015,\n" + 
				"                        \"eid\": 21519905,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.25,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:17:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52016,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第四回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763997706,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116352,\n" + 
				"                        \"matchId\": 52016,\n" + 
				"                        \"eid\": 21519907,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116353,\n" + 
				"                        \"matchId\": 52016,\n" + 
				"                        \"eid\": 21519908,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52017,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第六回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763997770,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116354,\n" + 
				"                        \"matchId\": 52017,\n" + 
				"                        \"eid\": 21519909,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116355,\n" + 
				"                        \"matchId\": 52017,\n" + 
				"                        \"eid\": 21519910,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.13,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52018,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第六回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763997813,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116356,\n" + 
				"                        \"matchId\": 52018,\n" + 
				"                        \"eid\": 21519911,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116357,\n" + 
				"                        \"matchId\": 52018,\n" + 
				"                        \"eid\": 21519912,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52019,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第八回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763998439,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116358,\n" + 
				"                        \"matchId\": 52019,\n" + 
				"                        \"eid\": 21519914,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.6,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:17:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116359,\n" + 
				"                        \"matchId\": 52019,\n" + 
				"                        \"eid\": 21519915,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.25,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:17:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52020,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第八回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763998563,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116360,\n" + 
				"                        \"matchId\": 52020,\n" + 
				"                        \"eid\": 21519917,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116361,\n" + 
				"                        \"matchId\": 52020,\n" + 
				"                        \"eid\": 21519918,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52021,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763998635,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116362,\n" + 
				"                        \"matchId\": 52021,\n" + 
				"                        \"eid\": 21519919,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116363,\n" + 
				"                        \"matchId\": 52021,\n" + 
				"                        \"eid\": 21519920,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.13,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52022,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763998770,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116364,\n" + 
				"                        \"matchId\": 52022,\n" + 
				"                        \"eid\": 21519921,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116365,\n" + 
				"                        \"matchId\": 52022,\n" + 
				"                        \"eid\": 21519922,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52023,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十二回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763998842,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116366,\n" + 
				"                        \"matchId\": 52023,\n" + 
				"                        \"eid\": 21519923,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116367,\n" + 
				"                        \"matchId\": 52023,\n" + 
				"                        \"eid\": 21519924,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.13,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52024,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十二回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 121763998924,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116368,\n" + 
				"                        \"matchId\": 52024,\n" + 
				"                        \"eid\": 21519925,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116369,\n" + 
				"                        \"matchId\": 52024,\n" + 
				"                        \"eid\": 21519926,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52026,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十四回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 14:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 1,\n" + 
				"                \"eid\": 12176282281,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116372,\n" + 
				"                        \"matchId\": 52026,\n" + 
				"                        \"eid\": 21519930,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116373,\n" + 
				"                        \"matchId\": 52026,\n" + 
				"                        \"eid\": 21519931,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52037,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"获胜者\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 1,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 1217616877,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116394,\n" + 
				"                        \"matchId\": 52037,\n" + 
				"                        \"eid\": 21520253,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.3,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116395,\n" + 
				"                        \"matchId\": 52037,\n" + 
				"                        \"eid\": 21520254,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 3.4,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52038,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"5POWER-5.5\",\n" + 
				"                \"value\": \"5.5\",\n" + 
				"                \"type\": 2,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 1217616878,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116396,\n" + 
				"                        \"matchId\": 52038,\n" + 
				"                        \"eid\": 21520255,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER让分-5.5\",\n" + 
				"                        \"odds\": 1.91,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:30:02\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116397,\n" + 
				"                        \"matchId\": 52038,\n" + 
				"                        \"eid\": 21520256,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao让分+5.5\",\n" + 
				"                        \"odds\": 1.83,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:30:02\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52040,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"回合总数单双\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 21,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 1217634152,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116400,\n" + 
				"                        \"matchId\": 52040,\n" + 
				"                        \"eid\": 21520263,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"比分为单\",\n" + 
				"                        \"odds\": 1.97,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116401,\n" + 
				"                        \"matchId\": 52040,\n" + 
				"                        \"eid\": 21520264,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"比分为双\",\n" + 
				"                        \"odds\": 1.84,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52039,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"回合总数大小25.5\",\n" + 
				"                \"value\": \"25.5\",\n" + 
				"                \"type\": 22,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 1217616879,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116398,\n" + 
				"                        \"matchId\": 52039,\n" + 
				"                        \"eid\": 21520257,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>25.5\",\n" + 
				"                        \"odds\": 1.81,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:07:03\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116399,\n" + 
				"                        \"matchId\": 52039,\n" + 
				"                        \"eid\": 21520258,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<25.5\",\n" + 
				"                        \"odds\": 1.93,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 05:07:03\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52061,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"炸弹拆除次数最多队伍（不含加时赛）\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763999987,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116442,\n" + 
				"                        \"matchId\": 52061,\n" + 
				"                        \"eid\": 21520325,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116443,\n" + 
				"                        \"matchId\": 52061,\n" + 
				"                        \"eid\": 21520326,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 2.16,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52075,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十四回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 12176282116,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116470,\n" + 
				"                        \"matchId\": 52075,\n" + 
				"                        \"eid\": 21520469,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116471,\n" + 
				"                        \"matchId\": 52075,\n" + 
				"                        \"eid\": 21520470,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52074,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十二回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763998904,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116468,\n" + 
				"                        \"matchId\": 52074,\n" + 
				"                        \"eid\": 21520466,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116469,\n" + 
				"                        \"matchId\": 52074,\n" + 
				"                        \"eid\": 21520467,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52073,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763998706,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116466,\n" + 
				"                        \"matchId\": 52073,\n" + 
				"                        \"eid\": 21520462,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116467,\n" + 
				"                        \"matchId\": 52073,\n" + 
				"                        \"eid\": 21520463,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52072,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第八回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763998521,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116464,\n" + 
				"                        \"matchId\": 52072,\n" + 
				"                        \"eid\": 21520460,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116465,\n" + 
				"                        \"matchId\": 52072,\n" + 
				"                        \"eid\": 21520461,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52071,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第六回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763997787,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116462,\n" + 
				"                        \"matchId\": 52071,\n" + 
				"                        \"eid\": 21520458,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116463,\n" + 
				"                        \"matchId\": 52071,\n" + 
				"                        \"eid\": 21520459,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52070,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第四回合首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763997655,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116460,\n" + 
				"                        \"matchId\": 52070,\n" + 
				"                        \"eid\": 21520455,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.29,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116461,\n" + 
				"                        \"matchId\": 52070,\n" + 
				"                        \"eid\": 21520456,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.58,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52041,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第一手枪局获胜者\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 1217616880,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116402,\n" + 
				"                        \"matchId\": 52041,\n" + 
				"                        \"eid\": 21520267,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116403,\n" + 
				"                        \"matchId\": 52041,\n" + 
				"                        \"eid\": 21520268,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 2.16,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52042,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第一手枪局首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763997457,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116404,\n" + 
				"                        \"matchId\": 52042,\n" + 
				"                        \"eid\": 21520269,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.25,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116405,\n" + 
				"                        \"matchId\": 52042,\n" + 
				"                        \"eid\": 21520270,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.6,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52043,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第一手枪局首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763997480,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116406,\n" + 
				"                        \"matchId\": 52043,\n" + 
				"                        \"eid\": 21520273,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 1.1,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116407,\n" + 
				"                        \"matchId\": 52043,\n" + 
				"                        \"eid\": 21520274,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 6.21,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52044,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第四回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763997627,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116408,\n" + 
				"                        \"matchId\": 52044,\n" + 
				"                        \"eid\": 21520275,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116409,\n" + 
				"                        \"matchId\": 52044,\n" + 
				"                        \"eid\": 21520276,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.13,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52045,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第四回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763997705,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116410,\n" + 
				"                        \"matchId\": 52045,\n" + 
				"                        \"eid\": 21520278,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116411,\n" + 
				"                        \"matchId\": 52045,\n" + 
				"                        \"eid\": 21520279,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52046,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第六回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763997771,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116412,\n" + 
				"                        \"matchId\": 52046,\n" + 
				"                        \"eid\": 21520280,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116413,\n" + 
				"                        \"matchId\": 52046,\n" + 
				"                        \"eid\": 21520281,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.13,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52063,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"首先赢得十个回合者\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 1217616883,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116446,\n" + 
				"                        \"matchId\": 52063,\n" + 
				"                        \"eid\": 21520334,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.37,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116447,\n" + 
				"                        \"matchId\": 52063,\n" + 
				"                        \"eid\": 21520335,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 2.94,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52062,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"炸弹拆除总数单双（不含加时赛）\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121764000041,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116444,\n" + 
				"                        \"matchId\": 52062,\n" + 
				"                        \"eid\": 21520332,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"比分为单\",\n" + 
				"                        \"odds\": 1.97,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116445,\n" + 
				"                        \"matchId\": 52062,\n" + 
				"                        \"eid\": 21520333,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"比分为双\",\n" + 
				"                        \"odds\": 1.84,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52047,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第六回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763997814,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116414,\n" + 
				"                        \"matchId\": 52047,\n" + 
				"                        \"eid\": 21520282,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116415,\n" + 
				"                        \"matchId\": 52047,\n" + 
				"                        \"eid\": 21520283,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52060,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"C4炸弹爆炸获得胜利次数最多队伍（不含加时赛）\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763999873,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116440,\n" + 
				"                        \"matchId\": 52060,\n" + 
				"                        \"eid\": 21520319,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116441,\n" + 
				"                        \"matchId\": 52060,\n" + 
				"                        \"eid\": 21520320,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 2.16,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52059,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"是否进入加时赛\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 12176161197,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116438,\n" + 
				"                        \"matchId\": 52059,\n" + 
				"                        \"eid\": 21520314,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 10.09,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116439,\n" + 
				"                        \"matchId\": 52059,\n" + 
				"                        \"eid\": 21520315,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.03,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52058,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第二手枪局首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763999033,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116436,\n" + 
				"                        \"matchId\": 52058,\n" + 
				"                        \"eid\": 21520310,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 1.1,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116437,\n" + 
				"                        \"matchId\": 52058,\n" + 
				"                        \"eid\": 21520311,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 6.21,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52057,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第二手枪局首个被杀队员来自哪队\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763998986,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116434,\n" + 
				"                        \"matchId\": 52057,\n" + 
				"                        \"eid\": 21520308,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 2.25,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116435,\n" + 
				"                        \"matchId\": 52057,\n" + 
				"                        \"eid\": 21520309,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 1.6,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52056,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第二手枪局获胜者\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 1217616881,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116432,\n" + 
				"                        \"matchId\": 52056,\n" + 
				"                        \"eid\": 21520306,\n" + 
				"                        \"teamId\": 22,\n" + 
				"                        \"name\": \"5POWER\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116433,\n" + 
				"                        \"matchId\": 52056,\n" + 
				"                        \"eid\": 21520307,\n" + 
				"                        \"teamId\": 1162,\n" + 
				"                        \"name\": \"JiJieHao\",\n" + 
				"                        \"odds\": 2.16,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52055,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十四回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 12176282282,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116430,\n" + 
				"                        \"matchId\": 52055,\n" + 
				"                        \"eid\": 21520302,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116431,\n" + 
				"                        \"matchId\": 52055,\n" + 
				"                        \"eid\": 21520303,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52054,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十四回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 12176282085,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116428,\n" + 
				"                        \"matchId\": 52054,\n" + 
				"                        \"eid\": 21520300,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116429,\n" + 
				"                        \"matchId\": 52054,\n" + 
				"                        \"eid\": 21520301,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.13,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52053,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十二回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763998925,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116426,\n" + 
				"                        \"matchId\": 52053,\n" + 
				"                        \"eid\": 21520297,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116427,\n" + 
				"                        \"matchId\": 52053,\n" + 
				"                        \"eid\": 21520298,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52052,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十二回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763998843,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116424,\n" + 
				"                        \"matchId\": 52052,\n" + 
				"                        \"eid\": 21520294,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116425,\n" + 
				"                        \"matchId\": 52052,\n" + 
				"                        \"eid\": 21520295,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.13,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52051,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763998769,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116422,\n" + 
				"                        \"matchId\": 52051,\n" + 
				"                        \"eid\": 21520292,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116423,\n" + 
				"                        \"matchId\": 52051,\n" + 
				"                        \"eid\": 21520293,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52050,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第十回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763998636,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116420,\n" + 
				"                        \"matchId\": 52050,\n" + 
				"                        \"eid\": 21520290,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116421,\n" + 
				"                        \"matchId\": 52050,\n" + 
				"                        \"eid\": 21520291,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.13,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52049,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第八回合首杀是否爆头\",\n" + 
				"                \"value\": \"\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763998564,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116418,\n" + 
				"                        \"matchId\": 52049,\n" + 
				"                        \"eid\": 21520287,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"是\",\n" + 
				"                        \"odds\": 2.14,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116419,\n" + 
				"                        \"matchId\": 52049,\n" + 
				"                        \"eid\": 21520288,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"否\",\n" + 
				"                        \"odds\": 1.66,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 52048,\n" + 
				"                \"gameId\": 12176,\n" + 
				"                \"state\": 0,\n" + 
				"                \"name\": \"第八回合爆头总数大小2.5\",\n" + 
				"                \"value\": \"2.5\",\n" + 
				"                \"type\": 100,\n" + 
				"                \"canStart\": 0,\n" + 
				"                \"startDate\": \"09-27 15:00\",\n" + 
				"                \"betType\": 0,\n" + 
				"                \"round\": 2,\n" + 
				"                \"eid\": 121763998440,\n" + 
				"                \"match\": null,\n" + 
				"                \"manual\": 0,\n" + 
				"                \"odds\": [\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116416,\n" + 
				"                        \"matchId\": 52048,\n" + 
				"                        \"eid\": 21520285,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"大于>2.5\",\n" + 
				"                        \"odds\": 1.65,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    },\n" + 
				"                    {\n" + 
				"                        \"createDate\": \"2019-09-27 00:18:06\",\n" + 
				"                        \"rowState\": 0,\n" + 
				"                        \"id\": 116417,\n" + 
				"                        \"matchId\": 52048,\n" + 
				"                        \"eid\": 21520286,\n" + 
				"                        \"teamId\": 0,\n" + 
				"                        \"name\": \"小于<2.5\",\n" + 
				"                        \"odds\": 2.13,\n" + 
				"                        \"manual\": 0,\n" + 
				"                        \"winner\": 0,\n" + 
				"                        \"score\": 0,\n" + 
				"                        \"betAmount\": 0,\n" + 
				"                        \"lastModifiedDate\": \"2019-09-27 00:18:06\"\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"game\": null,\n" + 
				"                \"betAmount\": 0,\n" + 
				"                \"lastModifiedDate\": \"2019-09-27 05:21:03\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"matchTypes\": null,\n" + 
				"        \"teams\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-08-21 03:12:48\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 22,\n" + 
				"                \"name\": \"5POWER\",\n" + 
				"                \"league\": null,\n" + 
				"                \"category\": 2,\n" + 
				"                \"image\": null,\n" + 
				"                \"eid\": 16406,\n" + 
				"                \"eimage\": \"www.nmgdjkj.com/file/a69bccffc8b8030792ef076959f90630.png\",\n" + 
				"                \"origin\": \"raybet\",\n" + 
				"                \"lastModifiedDate\": \"2019-08-21 03:12:48\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-09-18 03:06:08\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 1162,\n" + 
				"                \"name\": \"JiJieHao\",\n" + 
				"                \"league\": null,\n" + 
				"                \"category\": 2,\n" + 
				"                \"image\": null,\n" + 
				"                \"eid\": 18027630,\n" + 
				"                \"eimage\": \"www.nmgdjkj.com/file/2c1bc68e92c4b9f12feb1fe0095bfef1.png\",\n" + 
				"                \"origin\": \"raybet\",\n" + 
				"                \"lastModifiedDate\": \"2019-09-18 03:06:08\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"hibernateLazyInitializer\": {},\n" + 
				"        \"lastModifiedDate\": \"2019-09-27 05:21:01\"\n" + 
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
