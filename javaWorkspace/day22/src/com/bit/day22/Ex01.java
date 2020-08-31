package com.bit.day22;

import java.awt.*;
import javax.swing.*;
public class Ex01 {

	public static void main(String[] args) {
		Frame f = new Frame();
		Panel pad = new Panel();
		GridLayout layout = new GridLayout(4,3);
		Font font= null;
		font = new Font("궁서",1,40);
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
		Button btn = new Button("*");
		Button btn01 = new Button("#"); // String 초기화 후 포문과 이프문으로 스프링 인자 바꿈
		
		pad.setLayout(layout);
		
		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);
		btn4.setFont(font);
		btn5.setFont(font);
		btn6.setFont(font);
		btn7.setFont(font);
		btn8.setFont(font);
		btn9.setFont(font);
		btn0.setFont(font);
		btn.setFont(font);
		btn01.setFont(font);
		
		
		f.add(pad);
		pad.add(btn1);
		pad.add(btn2);
		pad.add(btn3);
		pad.add(btn4);
		pad.add(btn5);
		pad.add(btn6);
		pad.add(btn7);
		pad.add(btn8);
		pad.add(btn9);
		pad.add(btn);
		pad.add(btn0);
		pad.add(btn01);
		f.setLocation(300,300);
		f.setSize(300,300);
		f.setVisible(true);
	}

}
