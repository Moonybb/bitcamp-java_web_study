package ads;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class UpDownGame implements Runnable{
	Socket clientSocket02;
	private InputStream inputStream;
	private OutputStream outputStream;
	private InputStreamReader inputStreamReader;
	private OutputStreamWriter outputStreamWriter;
	private BufferedReader bufReader;
	private BufferedWriter bufWriter;
	
	public UpDownGame(Socket clientSocket02) {
		this.clientSocket02 = clientSocket02;
	}
	
	@Override
	public void run() {
		try {
			InputStream is = clientSocket02.getInputStream();
			inputStreamReader = new InputStreamReader(is);
			bufReader = new BufferedReader(inputStreamReader);
			String read = bufReader.readLine();
			System.out.println(read+"read");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

public class UpDownServer implements Runnable{
	ServerSocket serverSocket;
	Socket clientSocket01;
	private InputStream inputStream;
	private OutputStream outputStream;
	private InputStreamReader inputStreamReader;
	private OutputStreamWriter outputStreamWriter;
	private BufferedReader bufReader;
	private BufferedWriter bufWriter;
	static ArrayList<OutputStream> list = new ArrayList<OutputStream>();
	
	public UpDownServer(Socket clientSocket01) {
		this.clientSocket01 = clientSocket01;
	}
	
	@Override
	public void run() {
		
			while(true){		
				try {
					InetAddress addr = clientSocket01.getInetAddress();
					
					inputStream = clientSocket01.getInputStream();
					inputStreamReader = new InputStreamReader(inputStream);
					bufReader = new BufferedReader(inputStreamReader);
					
					outputStream = clientSocket01.getOutputStream();
					list.add(outputStream);
					System.out.println(list.size());
					while(true){
						String msg = bufReader.readLine();
						
						for(int i=0; i<list.size(); i++){
							OutputStream user = list.get(i);
							outputStreamWriter = new OutputStreamWriter(user);
							bufWriter = new BufferedWriter(outputStreamWriter);
							bufWriter.write(addr.getHostAddress()+">>"+msg);
							bufWriter.newLine();
				
							bufWriter.flush();
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	
	
	public static void main(String[] args) {
		int port = 8080;
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(port);//Bind
			while(true){
				
				Socket clientSocket01 = serverSocket.accept();

				UpDownServer upDownServer = new UpDownServer(clientSocket01);
				new Thread(upDownServer).start();
				
				Socket clientSocket02 = serverSocket.accept();
				UpDownGame game = new UpDownGame(clientSocket02);
				new Thread(game).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try{
				if(serverSocket!=null)serverSocket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		

	}

}
