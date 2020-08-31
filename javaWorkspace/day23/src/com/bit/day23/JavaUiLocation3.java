package com.bit.day23;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JavaUiLocation3 extends Frame implements MouseListener{
	int cnt;
	long before;
	long after;
	@Override
	public void mouseClicked(MouseEvent e) {
		cnt++;
		if(cnt==1){
		before=System.currentTimeMillis();
		
		}else if(cnt==2){
			after=System.currentTimeMillis();
			if(after-before<1000){
			System.out.println("영문이바보X2");
			cnt=0;
			}
			else {
				before=after;
				cnt=1;
			}
		}

	}

	public JavaUiLocation3(){
		
		addMouseListener(this);
		setSize(400,300);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaUiLocation3();
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
