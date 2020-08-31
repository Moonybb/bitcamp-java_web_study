package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class JavaUiLocation1 extends Frame{	
	
	public JavaUiLocation1(){
//		setResizable(false);
		Panel p = new Panel();
		p.setLayout(null);
		Button btn1 = new Button("button1");
		btn1.setSize(200,200);
		btn1.setLocation(0,0);
		TextField tf1 = new TextField();
		tf1.setLocation(200,0);
		tf1.setSize(100,50);
		
		p.add(btn1);
		p.add(tf1);
		add(p);
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JavaUiLocation1();
	}
}
