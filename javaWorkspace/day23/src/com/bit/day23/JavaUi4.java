package com.bit.day23;

import java.awt.*;

public class JavaUi4 extends Frame{
	
	class MyCanvas extends Canvas{
		
		
		@Override
		public void paint(Graphics g){
			g.drawString("환영합니다", 400, 300);
			g.setColor(Color.red);
			g.drawLine(100, 100, 200, 200);
			g.drawRect(300, 100, 100, 150);
			g.setColor(Color.BLUE);
			g.drawOval(500, 100, 100, 150);
			g.drawArc(0, 400, 200, 200, 0, 90);
			
//			g.drawRect(300, 100, 100, 150);
//			g.setColor(Color.BLUE);
//			g.drawOval(500, 100, 100, 150);
//			g.drawArc(0, 400, 200, 200, 0, 90);
		}
	}
	
	
	public JavaUi4(){
		Canvas can = new MyCanvas();
		
		add(can);
		setSize(800,600);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaUi4();
	}
}
