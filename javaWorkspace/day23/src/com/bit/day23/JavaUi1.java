package com.bit.day23;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JavaUi1 extends Frame{
	
	public JavaUi1(){
		java.awt.Toolkit tool = Toolkit.getDefaultToolkit();
		byte[] data = null;
		File file = new File(".\\rock.png");
		FileInputStream fis = null;
		if(file.exists()){//파일이 있으면 true 리턴
			try {
				data = new byte[(int)file.length()];//file.length()리턴값이 롱타입이므로. (idx는 int다.)
				fis = new FileInputStream(file);
				for(int i=0;i<file.length();i++){
					data[i]=(byte)fis.read(); //read() int 리턴 
				} // Exception 순서대로 처리.
				System.out.println(data.length);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();			
			}finally{
				if(fis!=null){
					try {fis.close();} 
					catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		
		Dimension dim = tool.getScreenSize();
		
		Image img = tool.createImage(data);
		javax.swing.Icon icon = new ImageIcon(img);
		javax.swing.JButton btn01 = new JButton(icon);
		
		add(btn01);
		
		
//		System.out.println(dim.getHeight());
//		System.out.println(dim.getWidth());
//		System.out.println(dim.width);
//		System.out.println(dim.height);
//		
		
		setSize(500,300);
		//1920*1080
		setLocation(dim.width/2-getWidth()/2,dim.height/2-getHeight()/2);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaUi1();
	}
}
