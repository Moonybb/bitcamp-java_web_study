package com.bit.tcp03;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MultiServer extends Thread{
	static List<OutputStream> list = new ArrayList<OutputStream>();
	Socket socket;
	
	MultiServer(Socket socket){
		this.socket=socket; // 객체 생성할때마다 인자로 소켓을 받아와 필드에 대입해줌.
	}
	
	@Override
	public void run() {
		InputStream is =null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw  = null;
		BufferedReader br = null;
		BufferedWriter bw  = null;
		try {
			InetAddress addr = socket.getInetAddress();
			System.out.println(addr.getHostAddress()+"접속");
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			os = socket.getOutputStream();
			list.add(os);
			while(true){
				String msg = br.readLine();
				if(msg==null)break;
				if(msg.isEmpty())break;
//				bw.write(addr.getHostAddress()+">>"+msg);
				for(int i=0;i<list.size();i++){
					OutputStream stu=list.get(i);
					osw = new OutputStreamWriter(os);
					bw = new BufferedWriter(osw);
					bw.write(addr.getHostAddress()+">>"+msg);
					bw.newLine();
					bw.flush();
				}
//				bw.newLine();
//				bw.flush();
			}
			System.out.println(addr.getHostAddress()+"종료");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
		
        
			try {
				if(bw!=null)bw.close();
		        if(br!=null)br.close();
		        if(osw!=null)osw.close();
		        if(isr!=null)isr.close();
		        if(os!=null)os.close();
				if(is!=null)is.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
			}
	        
        }
		
	}
	
	
	public static void main(String[] args) {
		
		int port = 8080;
		ServerSocket server = null;
		
		
		
		try {
			server = new ServerSocket(port);
			while(true){
				Socket socket=server.accept(); //메인메서드의 서버소켓을 소켓으로 받음.
//				InetAddress addr = socket.getInetAddress();
//				System.out.println(addr.getHostAddress()+"접속");
				MultiServer thr = new MultiServer(socket); //나의 객체 생성, 생성자에 인자로 소켓을 넘겨줌.
				thr.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(server!=null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
