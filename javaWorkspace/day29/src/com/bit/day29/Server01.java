package com.bit.day29;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	
	public static void main(String[] args) {
		int port = 80;
		ServerSocket serverSocket = null;
		Socket socket = null;
		OutputStream outputStream = null;
		PrintStream printStream = null;
		try {
			serverSocket = new ServerSocket(port);
			socket = serverSocket.accept();		
			outputStream = socket.getOutputStream();
			printStream = new PrintStream(outputStream);
			
			printStream.println("HTTP/1.1 200 OK \r\n");
			
			for(int i=0;i<5;i++){
				printStream.println("<h1>print "+i+".....</h1>");
				printStream.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(outputStream!=null)outputStream.close();
				if(socket!=null)socket.close();
				if(serverSocket!=null)serverSocket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
