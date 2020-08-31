package com.bit.day22;

import java.awt.*;

import javafx.scene.layout.Pane;

public class Ex02 extends Frame{
	
	Ex02(){
		Panel p = new Panel();
		GridLayout layout0 = new GridLayout(5,4);
		BorderLayout layout = new BorderLayout();
		Panel east = new Panel();
		Panel south = new Panel();
		Panel north = new Panel();
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		Button btn7 = new Button("7");
		Button btn8 = new Button("8"); 
		Button btn9 = new Button("9"); 
		Button btn0 = new Button("0"); 
		
		Button ac = new Button("ac");
		Button star = new Button("*");
		Button s = new Button("/");
		Button plus = new Button("+");
		Button minus = new Button("-");
		Button sms = new Button("=");
		Button wja = new Button(".");
		Font font = null;
		
		
		TextField tf = new TextField(30);
		north.add(tf);
		font = new Font("궁서체",1,20);
		tf.setFont(font);
		p.add(BorderLayout.NORTH,tf); // 텍스트필드
		
		east.add(minus);
		east.add(sms);
		p.add(BorderLayout.EAST,plus);
		p.add(BorderLayout.EAST,minus);
		p.add(BorderLayout.EAST,sms);
		
		
		p.add(btn7);
		p.add(btn8);
		p.add(btn9);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		
		this.add(p);
		this.setLocation(1920/2-400/2,1080/2-600/2);
		this.setSize(400,600);
		this.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new Ex02();
	}
}
