package ads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Scanner;

public class UpDownClient implements ActionListener {
	private Scanner scanner;
	private UpDownUi ui;
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private InputStreamReader inputStreamReader;
	private OutputStreamWriter outputStreamWriter;
	private BufferedReader bufReader;
	private BufferedWriter bufWriter;
	String msg;
	int cnt;
	
	public UpDownClient() {
		try {
			socket = new Socket("192.168.0.161",8080);
			ui = new UpDownUi();
			ui.chatTf.addActionListener(this);
			ui.inputTf.addActionListener(this);
			ui.btn_start.addActionListener(this);
			
			
			inputStream = socket.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			bufReader = new BufferedReader(inputStreamReader);
			
			InetAddress addr = socket.getInetAddress();
			
//			byte[] ipName = addr.getAddress();
			ui.ta2.append(addr.getHostAddress()+"Á¢¼Ó");
			ui.ta2.append("\n");
			
			
			
			while(true){
				String msg = bufReader.readLine();
				if(msg==null)break;
				if(msg.isEmpty())break;				

				ui.ta.append(msg+"\n");
			}
			
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == ui.chatTf){
//				ui.ta.append(ui.charTf.getText() + "\n");
//	            ui.charTf.setText("");
//	            ui.charTf.requestFocus();
			 try {
				outputStream = socket.getOutputStream();
				outputStreamWriter = new OutputStreamWriter(outputStream);
				bufWriter = new BufferedWriter(outputStreamWriter);
				bufWriter.write(ui.chatTf.getText());
				bufWriter.newLine();
				bufWriter.flush();
				ui.chatTf.setText("");
				ui.chatTf.setText("");
				
	        } catch (IOException e1) {
				e1.printStackTrace();
			}
	        
        }else if(obj == ui.inputTf){
        	
        	try {
				OutputStream out = socket.getOutputStream();
				outputStreamWriter = new OutputStreamWriter(out);
				bufWriter = new BufferedWriter(outputStreamWriter);
				bufWriter.write(ui.inputTf.getText());
				bufWriter.newLine();
				bufWriter.flush();
				ui.inputTf.setText("");
				ui.inputTf.setText("");
				System.out.println(ui.inputTf.getText()+"getText");
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
        }else if(obj == ui.btn_start){

        }
		
	}
	public static void main(String[] args) {
	
		new UpDownClient();
	
		
	}

	
}
