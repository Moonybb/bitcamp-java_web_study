package com.bit.day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class JavaUi2 extends Frame{
	static java.awt.TextField tf1;
	
	public JavaUi2(){
		Font font = new Font(Font.MONOSPACED,Font.BOLD,22);
		Panel p = new Panel();
		
		
		p.setBackground(Color.BLUE);
		tf1=new TextField(10);
		tf1.setText("");
		tf1.setFont(font);
		tf1.setEchoChar('!');
		p.add(tf1);
		
		
		Button btn = new Button("He's stupid");
		btn.setFont(font);
		btn.setSize(100,100);
		p.add(btn);
		
		
		
		add(p);
		this.setLocation(1920/2-500/2,1080/2-300/2);
		this.setSize(500,300);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JavaUi2();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tf1.getText());
	}
}
