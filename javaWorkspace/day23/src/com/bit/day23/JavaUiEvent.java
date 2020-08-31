package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JavaUiEvent extends Frame implements MouseListener{

	public JavaUiEvent(){
		
		Panel p = new Panel();
		
		Button btn = new Button("button");
		btn.addMouseListener(this);//버튼에다가 마우스리스너 해주는데, 내가 가지고 있으니 this
		p.add(btn);
		
		add(p);
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaUiEvent();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("click");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("in 마우스");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("out 마우스");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 버튼을 누르는 순간");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 버튼을 떼는 순간");
	}
}
