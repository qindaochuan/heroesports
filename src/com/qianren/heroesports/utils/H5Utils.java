package com.qianren.heroesports.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class H5Utils {
	public static void setHeaders(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		response.addHeader("Access-Control-Allow-Headers", "Authorization");
		response.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
		response.setHeader("X-Powered-By", "3.2.1");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Content-Type", "application/json;charset=utf-8");
	}
	
	public static String getPostData(InputStream in, int size, String charset) {
        if (in != null && size > 0) {
            byte[] buf = new byte[size];
            try {
                in.read(buf);
                if (charset == null || charset.length() == 0)
                    return new String(buf);
                else {
                    return new String(buf, charset);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    } 
	
	public static void downloadImg(String url,String savePath,ServletOutputStream output){
		System.out.println(url + ":" + savePath);
	    OkHttpClient client = new OkHttpClient();
	    final Request request = new Request.Builder()
	            .get()
	            .url(url)
	            .build();
	    Call call = client.newCall(request);
	    call.enqueue(new Callback() {
	        @Override
	        public void onFailure(Call call, IOException e) {
	            System.out.println("moer" + "onFailure: ");
	        }

	        @Override
	        public void onResponse(Call call, Response response){
	            //拿到字节流
	            InputStream is = response.body().byteStream();

	            int len = 0;
	            File file  = new File(savePath);
	            try {
					FileOutputStream fos = new FileOutputStream(file);
					byte[] buf = new byte[128];

					while ((len = is.read(buf)) != -1){
					    fos.write(buf, 0, len);
					}

					fos.flush();
					//关闭流
					fos.close();
					is.close();
					
//					FileInputStream in = new FileInputStream(file);
//					byte[] buffer = new byte[(int) file.length()];
//					in.read(buffer);
//					output.write(buffer);
//					in.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    });
	}
}
