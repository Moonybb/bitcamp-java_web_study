package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class JavaUiLocation2 extends Frame implements MouseMotionListener{
	Button btn;
	
	public JavaUiLocation2(){
		Panel p = new Panel();
		p.setLayout(null);
		
		p.addMouseMotionListener(this);
		btn = new Button("#");
		btn.setSize(50,50);
		btn.setLocation(0,0);
		
		p.add(btn);
		add(p);
		setSize(600,600);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaUiLocation2();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		btn.setLocation(x,y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}
