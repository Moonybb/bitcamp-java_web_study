package com.bit.day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JLabel;





public class JavaUi1 extends Frame{
	
	
	
	JavaUi1(){
		
		Panel p = new Panel(); // default로 가지고 있는 layout이 flowLayout
		Panel p2 = new Panel();
//		Color color = new Color(0,220,30);
		p2.setBackground(Color.white);
		p.setLayout(new GridLayout(1,2));
		
		Button btn1 = new Button("btn1");
		btn1.setLabel("한글");
		
		Font font = null;
		font = new Font("궁서",Font.ITALIC,50);
		btn1.setFont(font);
		
		javax.swing.JLabel la1 = new JLabel();
		la1.setText("출력합니다");
		la1.setFont(font);
		
		Button btn2 = new Button("btn2");
		
		p2.add(la1);
		p.add(btn1);
		p.add(p2);
		this.add(p);
		setLocation(200,200);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JavaUi1();
		
	}
}
