package com.bit.tcp02;

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

public class EchoServer {

   public static void main(String[] args) {
      // 한글x - 문자열스트림
      // 콘솔복잡 - 서버실행 메시지x
      // 종료 x - null
      
      
      int port = 8080;
      ServerSocket serv = null;
      Socket sock = null;
      InputStream is = null;
      OutputStream os = null;
      InputStreamReader isr = null;
      OutputStreamWriter osw = null;
      BufferedReader br = null;
      BufferedWriter bw = null;
      
      
      try {
         serv = new ServerSocket(port);
         sock = serv.accept(); // 접속 대기
         InetAddress addr = sock.getInetAddress();
         String user = addr.getHostAddress();
         
         is = sock.getInputStream(); // 소켓으로부터 인풋스트림을 뽑아옴
         os = sock.getOutputStream(); // 소켓으로부터 아웃풋스트림을 뽑아옴
         isr = new InputStreamReader(is);
         osw = new OutputStreamWriter(os);
         br = new BufferedReader(isr);
         bw = new BufferedWriter(osw);
         String msg = null;
         while(true){
            msg = br.readLine();
            if(msg==null)break;
            if(msg.isEmpty())break;
            bw.write("["+user+"]"+msg);
            bw.newLine(); // new Line으로 개행구현
            bw.flush(); // 혹시 안미뤄줄 수 있으니까 flush 해줌
         }
      } catch (IOException e) {
         e.printStackTrace();
      } finally{
         try{
            if(bw!=null)bw.close();
            if(br!=null)br.close();
            if(osw!=null)osw.close();
            if(isr!=null)isr.close();
            if(os!=null)os.close();
            if(is!=null)is.close();         
            if(serv!=null)serv.close();
         }catch(IOException e){
            e.printStackTrace();
         }
      }
      
   }
}