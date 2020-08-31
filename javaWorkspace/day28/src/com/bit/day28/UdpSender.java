package com.bit.day28;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

public class UdpSender {
	
	public static void main(String[] args) {
		String msg = "Hello UDP";
		
		byte[] ip = {(byte)192,(byte)168,0,(byte)189};//"192.168.0.189";
		
		int port = 8080;
		
		java.net.DatagramSocket sock = null;
		java.net.DatagramPacket pack = null;
		try {
			
			sock = new java.net.DatagramSocket();
			InetAddress addr = InetAddress.getByAddress(ip); 
			pack = new java.net.DatagramPacket(msg.getBytes() , msg.length(),addr,port);
			sock.send(pack);
			///
			pack = new DatagramPacket("한글".getBytes(), 4,addr,port);
			sock.send(pack);
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if(sock!=null)sock.close();
		}
		
	}
}
