package com.bit.updownserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.bit.updown.UpDownGame;

public class Server{

	private ServerSocket serverSocket;
	private Socket socket;
	private String msg;
   
   
	private Map<String, DataOutputStream> userMap = new HashMap<String, DataOutputStream>();
	private Map<String, DataInputStream> gameMap = new HashMap<String, DataInputStream>();
	
	public void setting() throws IOException{
		Collections.synchronizedMap(userMap); //각 쓰레드에서의 해쉬맵 동기화 보장.
		serverSocket = new ServerSocket(8080);
		while(true){
			System.out.println("서버대기");
			socket = serverSocket.accept();
	        System.out.println(socket.getInetAddress()+"접속");
	        Receiver reciever = new Receiver(socket);
	        reciever.start();
		}
	}
	
	
   
	public static void main(String[] args) {
		Server server = new Server();
		try {
      		server.setting();
      	} catch (IOException e) {
      		e.printStackTrace();
      	}
      	
      	
      	
	}
   
   
	public void addClient(String nick,DataOutputStream out){
		sendMessage(nick + "님이 접속하셨습니다.\n");
		userMap.put(nick, out);
	}
   
	public void removeClient(String nick){
		sendMessage(nick + "님이 퇴장하셨습니다.\n");
		userMap.remove(nick);
	}
   
	public void sendMessage(String msg){
		Iterator<String> iter = userMap.keySet().iterator(); 
		String key = "";
      	while(iter.hasNext()){
      		key = iter.next();
      		try {
      			userMap.get(key).writeUTF(msg); // 
      		} catch (IOException e) {
      			e.printStackTrace();
      		}
      	}
	}
   
   /////////내부클래스////////////////
	class Receiver extends Thread{
	   private DataInputStream in;
	   private DataOutputStream out;
	   private String nick;
      
	   public Receiver(Socket socket){
		   
		   try {
			   out = new DataOutputStream(socket.getOutputStream());
			   in = new DataInputStream(socket.getInputStream());
			   nick = in.readUTF();
			   addClient(nick, out);
            
		   } catch (IOException e) {
			   
		   }
	   }
	   
	   public void run(){
		   try{
			   while(in != null){
				   msg = in.readUTF();
				   sendMessage(msg);
			   }
		   }catch(IOException e){
			   	removeClient(nick);
		   }
	   }
	}
	
	
}