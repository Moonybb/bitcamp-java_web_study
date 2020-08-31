package com.bit.tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		int port = 8888;
		
		ServerSocket serve = null;
		OutputStream os = null;
		Socket sock = null;
		InputStream is = null;
		InputStreamReader isr = null;
		try {
			serve = new ServerSocket(port);
			System.out.println("server:접속대기중...");
			sock =serve.accept(); // 접속 대기 하며 접속되면 소켓을 리턴받음. (클라이언트의 소켓)
			System.out.println("server:접속됨");
			is=sock.getInputStream(); //서버의 소켓을 is에 인풋스트림 객체로 리턴.
			isr = new InputStreamReader(is); // 인풋스트림리더 객체생성, 소켓의 인풋스트림 인자로 받아 isr에 참조하게함.
			os = sock.getOutputStream(); // 현재 서버 소켓을 아웃풋스트림으로 아웃풋스트림 참조변수에 리턴한다.
//			String msg = "환영합니다";
			int su = -1;
			while((su=is.read())!=-1){
				os.write(su);
				os.flush();
//				System.out.print((char)su); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
				if(serve!=null)serve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
