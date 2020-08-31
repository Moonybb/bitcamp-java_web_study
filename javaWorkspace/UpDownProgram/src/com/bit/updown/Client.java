package com.bit.updown;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Client {
   
   private Socket socket;
   private DataInputStream in;
   private DataOutputStream out;
   private ChatUi ui;
   private String msg;
   private String nickName;
   
   public final void setUi(ChatUi ui){
      this.ui = ui;
   }
   
   public void connet(){
      try {
         socket = new Socket("192.168.0.189",8080);
         System.out.println("서버연결됨");
         
         out = new DataOutputStream(socket.getOutputStream());
         in = new DataInputStream(socket.getInputStream());
         
         out.writeUTF(nickName);
         while(in!=null){
        	 msg=in.readUTF();
        	 ui.appendMsg(msg);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
      
   }
   public void connet(String msg,int port){
	      try {
	        socket = new Socket(msg,port);
	         System.out.println("서버연결됨");
	         
	         out = new DataOutputStream(socket.getOutputStream());
	         in = new DataInputStream(socket.getInputStream());
	         
	         out.writeUTF(nickName);
	         while(in!=null){
	        	 msg=in.readUTF();
	        	 ui.appendMsg(msg);
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	      
	   }
   
  
   
   
   
   
   public void sendMessage(String msg2){
      try {
         out.writeUTF(msg2);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   
   public void setNickname(String nickName){
      this.nickName=nickName;
   }
}