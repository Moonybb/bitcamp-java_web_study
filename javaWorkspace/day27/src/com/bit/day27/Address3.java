package com.bit.day27;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Address3 {
	
	public static void main(String[] args) {
		String path="https://www.naver.com/";
		URL url=null;
		File file = new File("copy\\index.html");
		java.net.URLConnection conn = null;
		InputStream is =null;
		InputStreamReader isr = null;
		OutputStream os = null;
		try {
			url=new URL(path);
			conn = url.openConnection(); // 
			is = conn.getInputStream(); // conn을 InputStream 객체로 리턴해줌.
//			isr = new InputStreamReader(is);
			os= new FileOutputStream(file);
			
			int su = -1;
			while((su=is.read())!=-1){
				os.write(su);
//				System.out.print((char)su);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
