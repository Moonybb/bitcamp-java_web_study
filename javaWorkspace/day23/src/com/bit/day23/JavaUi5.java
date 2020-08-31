package com.bit.day23;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class JavaUi5 extends Frame implements WindowListener{
	
	public JavaUi5(){
		
		addWindowListener(this);
		
		setSize(500,300);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaUi5();
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("창활성화");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		this.dispose(); 
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("비활성화");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("비최소화");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창열림");
	}
}
