package com.bit.tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		String ip = "192.168.0.189";
		// ~2000
		int port = 8888;
		java.net.Socket sock = null;
		InputStream is =null;
		InputStreamReader isr = null;
		OutputStream os = null;
		
		try {
			sock = new Socket(ip,port);
			
			System.out.println("Client: 서버에 접속함");
			//클라이언트에서 서버로 줌
			String msg = "I'm coming";
			os = sock.getOutputStream();
			is=sock.getInputStream();
			isr = new InputStreamReader(is);
			
			os.flush();
			//서버에서 받아옴
			int su = -1;
			os.write(System.in.read()); //한번 써줘야함.
			while((su=isr.read())!=-1){
				os.write(System.in.read());
				System.out.print((char)su);
				System.out.flush();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(isr!=null)isr.close();
				if(sock!=null)sock.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
