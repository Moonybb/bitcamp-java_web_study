package com.bit.day22;

import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;

public class JavaUi5 extends Frame{
	
	public JavaUi5(){
		Panel p = new Panel();
		Choice cho = new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		
		cho.select(3);
		
		p.add(cho);
		add(p);
		
		setSize(500,300);
		Dimension dim = getSize();
		int w = dim.width;
		int h = dim.height;
		setLocation(1920/2-w/2,1080/2-h/2);
		setVisible(true);
		System.out.println(cho.getSelectedIndex());
		System.out.println(cho.getSelectedItem());
	}
	
	public static void main(String[] args) {
		new JavaUi5();
	}
}
