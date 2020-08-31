package com.bit.day21;

import java.awt.*;


public class JavaUi4 {
	public static void main(String[] args) {
		GridBagLayout layout = new GridBagLayout();
		Frame f = new Frame();
		Panel p = new Panel();
		p.setLayout(layout);
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		
		GridBagConstraints c=new GridBagConstraints();
		c.fill=
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(btn1, c);
		p.add(btn1);
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(btn2, c);
		p.add(btn2);
		c.gridx=2;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(btn3, c);
		p.add(btn3);
		c.gridx=3;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		layout.setConstraints(btn4, c);
		p.add(btn4);
		
		f.add(p);
		f.setLocation(500,200);
		f.setSize(400,300);
		f.setVisible(true);
	}
}
