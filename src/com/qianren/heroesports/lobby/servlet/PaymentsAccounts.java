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
 * Servlet implementation class PaymentsAccounts
 */
@WebServlet("/payments/accounts")
public class PaymentsAccounts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentsAccounts() {
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
				"        \"alipay\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 48,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"支付宝扫码\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"web\",\n" + 
				"                \"type\": \"alipay\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"1002\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 2.8,\n" + 
				"                \"priority\": 22,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 101,\n" + 
				"                \"max\": 10000,\n" + 
				"                \"amounts\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-11-09 06:12:25\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"wechat\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 55,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"微信扫码\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"web\",\n" + 
				"                \"type\": \"wechat\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"1018\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 4.5,\n" + 
				"                \"priority\": 22,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 30,\n" + 
				"                \"max\": 100,\n" + 
				"                \"amounts\": \"30,50,100\",\n" + 
				"                \"lastModifiedDate\": \"2019-11-09 06:12:51\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"qq\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 49,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"QQ钱包\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"web\",\n" + 
				"                \"type\": \"qq\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"1007\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 4.2,\n" + 
				"                \"priority\": 22,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 400,\n" + 
				"                \"max\": 10000,\n" + 
				"                \"amounts\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-11-09 06:12:30\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"bank\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 46,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"银联扫码\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"web\",\n" + 
				"                \"type\": \"bank\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"1013\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 1.8,\n" + 
				"                \"priority\": 22,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 200,\n" + 
				"                \"max\": 5000,\n" + 
				"                \"amounts\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-11-13 00:47:40\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-11-20 06:41:57\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 58,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"网银\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"web\",\n" + 
				"                \"type\": \"bank\",\n" + 
				"                \"needBank\": 1,\n" + 
				"                \"channel\": \"1000\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 1,\n" + 
				"                \"priority\": 20,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 10,\n" + 
				"                \"max\": 50000,\n" + 
				"                \"amounts\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-11-20 06:41:57\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"jd\": null,\n" + 
				"        \"alipay_h5\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 48,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"支付宝扫码\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"web\",\n" + 
				"                \"type\": \"alipay\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"1002\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 2.8,\n" + 
				"                \"priority\": 22,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 101,\n" + 
				"                \"max\": 10000,\n" + 
				"                \"amounts\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-11-09 06:12:25\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 50,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"支付宝APP\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"h5\",\n" + 
				"                \"type\": \"alipay\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"1006\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 2.8,\n" + 
				"                \"priority\": 22,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 101,\n" + 
				"                \"max\": 10000,\n" + 
				"                \"amounts\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-11-09 06:12:34\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"wechat_h5\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 55,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"微信扫码\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"web\",\n" + 
				"                \"type\": \"wechat\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"1018\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 4.5,\n" + 
				"                \"priority\": 22,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 30,\n" + 
				"                \"max\": 100,\n" + 
				"                \"amounts\": \"30,50,100\",\n" + 
				"                \"lastModifiedDate\": \"2019-11-09 06:12:51\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 56,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"微信APP\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"h5\",\n" + 
				"                \"type\": \"wechat\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"1019\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 4.5,\n" + 
				"                \"priority\": 22,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 30,\n" + 
				"                \"max\": 100,\n" + 
				"                \"amounts\": \"30,50,100\",\n" + 
				"                \"lastModifiedDate\": \"2019-11-16 01:41:53\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 57,\n" + 
				"                \"name\": \"R\",\n" + 
				"                \"description\": \"微信支付\",\n" + 
				"                \"provider\": \"R支付\",\n" + 
				"                \"method\": \"h5\",\n" + 
				"                \"type\": \"wechat\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"wechatHF\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 1.2,\n" + 
				"                \"priority\": 10,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 10,\n" + 
				"                \"max\": 100,\n" + 
				"                \"amounts\": \"10,20,30,50,100\",\n" + 
				"                \"lastModifiedDate\": \"2019-11-20 06:44:44\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"qq_h5\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 49,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"QQ钱包\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"web\",\n" + 
				"                \"type\": \"qq\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"1007\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 4.2,\n" + 
				"                \"priority\": 22,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 400,\n" + 
				"                \"max\": 10000,\n" + 
				"                \"amounts\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-11-09 06:12:30\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"bank_h5\": [\n" + 
				"            {\n" + 
				"                \"createDate\": \"2018-09-02 04:19:10\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 46,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"银联扫码\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"web\",\n" + 
				"                \"type\": \"bank\",\n" + 
				"                \"needBank\": 0,\n" + 
				"                \"channel\": \"1013\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 1.8,\n" + 
				"                \"priority\": 22,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 200,\n" + 
				"                \"max\": 5000,\n" + 
				"                \"amounts\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-11-13 00:47:40\"\n" + 
				"            },\n" + 
				"            {\n" + 
				"                \"createDate\": \"2019-11-20 06:41:57\",\n" + 
				"                \"rowState\": 0,\n" + 
				"                \"id\": 58,\n" + 
				"                \"name\": \"kuaiyin\",\n" + 
				"                \"description\": \"网银\",\n" + 
				"                \"provider\": \"快银\",\n" + 
				"                \"method\": \"web\",\n" + 
				"                \"type\": \"bank\",\n" + 
				"                \"needBank\": 1,\n" + 
				"                \"channel\": \"1000\",\n" + 
				"                \"payWay\": \"direct\",\n" + 
				"                \"serviceRate\": 1,\n" + 
				"                \"priority\": 20,\n" + 
				"                \"enabled\": 1,\n" + 
				"                \"min\": 10,\n" + 
				"                \"max\": 50000,\n" + 
				"                \"amounts\": null,\n" + 
				"                \"lastModifiedDate\": \"2019-11-20 06:41:57\"\n" + 
				"            }\n" + 
				"        ],\n" + 
				"        \"jd_h5\": null,\n" + 
				"        \"wechatAccount\": {\n" + 
				"            \"createDate\": \"2019-09-05 15:38:03\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 3,\n" + 
				"            \"accountNumber\": \"1231231231231243423\",\n" + 
				"            \"accountName\": \"liushuang3\",\n" + 
				"            \"displayName\": \"qwe\",\n" + 
				"            \"bank\": \"\",\n" + 
				"            \"bankBranch\": \"\",\n" + 
				"            \"levels\": \"0,1,2,3\",\n" + 
				"            \"enabled\": 1,\n" + 
				"            \"type\": 1,\n" + 
				"            \"visibleToUser\": 1,\n" + 
				"            \"remark\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-10-18 08:15:20\"\n" + 
				"        },\n" + 
				"        \"bankAccount\": {\n" + 
				"            \"createDate\": \"2019-09-05 15:37:58\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 2,\n" + 
				"            \"accountNumber\": \"123123123123123123\",\n" + 
				"            \"accountName\": \"liushuang3\",\n" + 
				"            \"displayName\": \"lius\",\n" + 
				"            \"bank\": \"交通银行\",\n" + 
				"            \"bankBranch\": \"qweqweqwe\",\n" + 
				"            \"levels\": \"0,1,2,3\",\n" + 
				"            \"enabled\": 1,\n" + 
				"            \"type\": 0,\n" + 
				"            \"visibleToUser\": 1,\n" + 
				"            \"remark\": \"2\",\n" + 
				"            \"lastModifiedDate\": \"2019-09-06 02:30:04\"\n" + 
				"        },\n" + 
				"        \"alipayAccount\": {\n" + 
				"            \"createDate\": \"2019-09-05 15:38:13\",\n" + 
				"            \"rowState\": 0,\n" + 
				"            \"id\": 5,\n" + 
				"            \"accountNumber\": \"123123123\",\n" + 
				"            \"accountName\": \"liushuang3\",\n" + 
				"            \"displayName\": \"222\",\n" + 
				"            \"bank\": \"\",\n" + 
				"            \"bankBranch\": \"\",\n" + 
				"            \"levels\": \"0,1,2,3\",\n" + 
				"            \"enabled\": 1,\n" + 
				"            \"type\": 2,\n" + 
				"            \"visibleToUser\": 1,\n" + 
				"            \"remark\": null,\n" + 
				"            \"lastModifiedDate\": \"2019-10-18 08:15:16\"\n" + 
				"        },\n" + 
				"        \"min\": 100,\n" + 
				"        \"max\": 49999,\n" + 
				"        \"canApplyFirstPromo\": true,\n" + 
				"        \"canApplyFirstEsportInMonthPromo\": false\n" + 
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
