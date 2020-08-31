package com.bit.day21;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.*;

public class JavaUi3 extends Frame {
   JavaUi3(){
      java.awt.BorderLayout layout = new java.awt.BorderLayout();
      FlowLayout layout2 = new FlowLayout();
      Panel p = new Panel();
      p.setLayout(layout);
      
      Button btn1 = new Button("button1");
      Button btn2 = new Button("button2");
      Button btn3 = new Button("button3");
      Panel west = new Panel();
      west.setLayout(layout2);
      Button btn4 = new Button("button4");
      west.add(btn4);
      Panel center = new Panel();
      center.setLayout(layout2);
      Button btn5 = new Button("button5");
      center.add(btn5);
      
      p.add(BorderLayout.NORTH,btn1);
      p.add(BorderLayout.SOUTH,btn2);
      p.add(BorderLayout.EAST,btn3);
      p.add(BorderLayout.WEST,west);
      p.add(BorderLayout.CENTER,center);
     
      
      
      add(p);
      setSize(500,300);
      setVisible(true);
   }
   public static void main(String[] args) {
      new JavaUi3();
   }
}