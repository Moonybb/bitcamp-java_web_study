package com.bit.day22;
import java.awt.*;


public class Ex03 extends Frame{
	
	public Ex03(){
		Panel p = new Panel();
		Panel p2= new Panel();
		String[] names={
				"ac","*","/","+",
				"7","8","9",
				"4","5","6","-",
				"1","2","3","=",
				"0",".",
				};
		Button[] btns = new Button[17];
		
		for(int i=0;i<btns.length;i++){
			btns[i]=new Button(names[i]);	
		}
		GridBagLayout layout = new GridBagLayout();
		p2.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		layout.setConstraints(btns[0], gbc);
		p2.add(btns[0]);
		gbc.gridx=1;
		layout.setConstraints(btns[1], gbc);
		p2.add(btns[1]);
		gbc.gridx=2;
		layout.setConstraints(btns[2], gbc);
		p2.add(btns[2]);
		gbc.gridx=3;
		gbc.gridheight=2;
		layout.setConstraints(btns[3], gbc);
		p2.add(btns[3]);
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridheight=1;
		
		layout.setConstraints(btns[4], gbc);
		p2.add(btns[4]);
		gbc.gridx=1;
		layout.setConstraints(btns[5], gbc);
		p2.add(btns[5]);
		gbc.gridx=2;
		layout.setConstraints(btns[6], gbc);
		p2.add(btns[6]);
		gbc.gridx=0;
		gbc.gridy=2;
		layout.setConstraints(btns[7], gbc);
		p2.add(btns[7]);
		gbc.gridx=1;
		layout.setConstraints(btns[8], gbc);
		p2.add(btns[8]);
		gbc.gridx=2;
		layout.setConstraints(btns[9], gbc);
		p2.add(btns[9]);
		gbc.gridx=3;
		layout.setConstraints(btns[10], gbc);
		p2.add(btns[10]);
		gbc.gridx=0;
		gbc.gridy=3;
		layout.setConstraints(btns[11], gbc);
		p2.add(btns[11]);
		gbc.gridx=1;
		layout.setConstraints(btns[12], gbc);
		p2.add(btns[12]);
		gbc.gridx=2;
		layout.setConstraints(btns[13], gbc);
		p2.add(btns[13]);
		gbc.gridx=3;
		gbc.gridheight=2;
		layout.setConstraints(btns[14], gbc);
		p2.add(btns[14]);
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridheight=1;
		gbc.gridwidth=2;
		layout.setConstraints(btns[15], gbc);
		p2.add(btns[15]);
		gbc.gridx=2;
		gbc.gridwidth=1;
		layout.setConstraints(btns[16], gbc);
		p2.add(btns[16]);
		
		
		
		p.setLayout(new BorderLayout());
		p.add(BorderLayout.NORTH,new TextField());
		p.add(BorderLayout.CENTER,p2);
		
		
		add(p);
		setSize(500,600);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex03();
		
	}
}
