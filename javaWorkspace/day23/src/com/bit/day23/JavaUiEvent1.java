package com.bit.day23;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class JavaUiEvent1 extends Frame implements MouseMotionListener{

	public JavaUiEvent1(){
		
		Panel p=new Panel();
		
		p.addMouseMotionListener(this);
		add(p);
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
		System.out.println(p.getWidth()+", "+p.getHeight());
		
	}
	
	public static void main(String[] args) {
		new JavaUiEvent1();
	}

	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("드래그 x="+x+",y="+y);
	}
	public void mouseMoved(MouseEvent e) {
		System.out.println("");
	}
}
