package com.bit.day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class JavaUi3 extends Frame{
	
	public JavaUi3(){
		Panel p = new Panel();
		p.setBackground(Color.BLUE);
//		java.awt.TextArea ta = new TextArea(3,20);
		java.awt.TextArea ta = new TextArea("초기값",5,20,TextArea.SCROLLBARS_BOTH);
		
//		ta.setText("출력\n두번째줄");
//		ta.setVisible(false);
//		ta.setEditable(false);
//		ta.setEnabled(false);
		ta.setColumns(10);
		ta.setRows(10);
		p.add(ta);
		
		Button btn = new Button("youngmoon");
//		btn.setVisible(false);
		btn.setEnabled(false);
		
		
		p.add(btn);
		add(p);
		setLocation(200,200);
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaUi3();
	}
}
