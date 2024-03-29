package com.bit.tcp03;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiClient extends Frame implements ActionListener{
	TextField tf;
	Socket sock;
    BufferedWriter bw = null;
    
	public MultiClient(Socket sock){
		this.sock=sock;
		tf = new TextField();
		tf.addActionListener(this);
		add(tf);
		setSize(400,80);
		setLocation(300,200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw =null;
		try {
			os = sock.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw= new BufferedWriter(osw);
			bw.write(tf.getText());
			bw.newLine();
			bw.flush();
			tf.setText("");
			tf.setText("");
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		
	}
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      String ip = "192.168.0.161";
      int port = 8080;
      Socket sock = null;
      InputStream is = null;
//      OutputStream os = null;
      InputStreamReader isr = null;
//      OutputStreamWriter osw = null;
      BufferedReader br = null;

      
      try {
         sock = new Socket(ip,port);
         MultiClient me = new MultiClient(sock);
         is = sock.getInputStream();
//         os = sock.getOutputStream();
         isr = new InputStreamReader(is);
//         osw = new OutputStreamWriter(os);
         br = new BufferedReader(isr);
//         me.bw = new BufferedWriter(osw);
         
         while(true){
//            bw.write(sc.nextLine());
//            bw.newLine();
//            bw.flush();
            String msg = br.readLine();
            if(msg==null)break;
            if(msg.isEmpty())break;
            System.out.println(msg);
//            bw.newLine();
         }
         
      } catch (UnknownHostException e) {
//         e.printStackTrace();
      } catch (IOException e) {
//         e.printStackTrace();
      } finally{
         try{
//            if(me.bw!=null)me.bw.close();
            if(br!=null)br.close();
//            if(osw!=null)osw.close();
            if(isr!=null)isr.close();
//            if(os!=null)os.close();
            if(is!=null)is.close();         
            if(sock!=null)sock.close();   
         }catch (IOException e){
            e.printStackTrace();
         }
      }
      
   }

}