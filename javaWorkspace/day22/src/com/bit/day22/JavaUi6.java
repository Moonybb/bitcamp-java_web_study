package com.bit.day22;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class JavaUi6 extends Frame{

	public JavaUi6(){
		Panel p = new Panel();
		
		List list = new List(10,true);//다중선택 인자로,true
//		list.addItem("item1");
//		list.addItem("item2");
//		list.addItem("item3");
//		list.addItem("item4");
		
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.select(144414144);
		
		
		
		p.add(list);
		add(p);
		Dimension dim = new Dimension(500,300);
		setSize(dim);
		setLocation(200,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JavaUi6();
	}
}
