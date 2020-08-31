package com.bit.updown;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;



public class RockGame extends Frame implements ActionListener{
   Dimension dim;
   Toolkit tool;
   
   JButton btn_ComImage;
   Button btn_Rock;
   Button btn_Scissor;
   Button btn_Paper;
   Button btn_Reset;
   
   Label la1;
   Label la2;
   
   String line = "                              ";
   
   Image img_Start;
   Image img_Win;
   Image img_Lose;
   Image img_Draw;
   Icon icon_Start;
   Icon icon_Win;
   Icon icon_Lose;
   Icon icon_Draw;
   
   RockGame(){
      dim = new Dimension();
      tool = Toolkit.getDefaultToolkit();
      dim = tool.getScreenSize();
      
      this.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            dispose();
         }
      });
      
      Panel p = new Panel();
      
      la1 = new Label(line+"가위 바위 보 중 한 가지를 선택하시면 게임이 시작됩니다.");
      la2 = new Label(); // 승부여부 출력
      la2.setFont(new Font(null, Font.BOLD, 20));
      
      btn_Reset = new Button("리셋");
      btn_Reset.setSize(100, 50);
      btn_Reset.setLocation(550, 400);
      btn_Reset.addActionListener(this);
      add(btn_Reset);
      
      btn_ComImage = new JButton("게임이 시작되면 이미지가 출력됩니다.");
      img_Start = tool.createImage("게임 시작.png");
      img_Win = tool.createImage("win.png");
      img_Lose = tool.createImage("lose.png");
      img_Draw = tool.createImage("draw.png");
      
      icon_Start = new ImageIcon(img_Start);
      icon_Win = new ImageIcon(img_Win);
      icon_Lose = new ImageIcon(img_Lose);
      icon_Draw = new ImageIcon(img_Draw);
      
      btn_ComImage.setIcon(icon_Start);
      btn_ComImage.setSize(500,300);
      btn_ComImage.setLocation(100, 70);
      btn_ComImage.addActionListener(this);
      add(btn_ComImage);
      
      btn_Rock = new Button("바위"); // 주먹
      btn_Rock.setSize(100, 50);
      btn_Rock.setLocation(300, 400);
      btn_Rock.addActionListener(this);
      add(btn_Rock);
      
      btn_Scissor = new Button("가위"); // 가위
      btn_Scissor.setSize(100,50);
      btn_Scissor.setLocation(200,400);
      btn_Scissor.addActionListener(this);
      add(btn_Scissor);
      
      btn_Paper = new Button("보"); // 보
      btn_Paper.setSize(100, 50);
      btn_Paper.setLocation(400, 400);
      btn_Paper.addActionListener(this);
      add(btn_Paper);
      
//      add(p);
//      setLayout();
      add(la1); // 패널 겹침 방지용 라벨
      add(la2,"North"); // 이겼다 졌다 출력 문구
      add(la1,"South"); //가위바위보중 한 가지를 선택하시면 게임이 시작됩니다.
      setBackground(Color.ORANGE);
      setSize(700, 500);
      setLocation(470, dim.height/2-400);
      setVisible(true);
   }
   
   
   public static void main(String[] args) {      
      new RockGame();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      String com = null;
      int num;
      
      String user;
      
      Object obj = e.getSource();
      // 우선적으로 사용자가 가위 바위 보 중 하나를 클릭하게되면 시작되게 구현
      if(obj==btn_Rock||obj==btn_Scissor||obj==btn_Paper){
         
         num = (int)(Math.random()*3+1);
         if(num==1){
            com = "주먹";
         }else if(num==2){
            com = "가위";
         }else if(num==3){
            com = "보";
         }
         
         if(obj==btn_Rock){ // 사용자가 주먹을 냈을 때
            user = "주먹";
            if(user.equals(com)){ // 유저와 컴퓨터가 같은 걸 냈을 때
               btn_ComImage.setIcon(icon_Draw);
               la2.setText(line+"비겼습니다! 다시 선택해 주세요!");
            }else if(com=="가위"){
               btn_ComImage.setIcon(icon_Win);
               la2.setText(line+"축하합니다 당신이 이겼습니다!");
            }else if(com=="보"){
               btn_ComImage.setIcon(icon_Lose);
               la2.setText(line+"아쉽네요 당신이 졌습니다 ㅠㅠ");
            }
            
         }else if(obj==btn_Scissor){ // 사용자가 가위를 냈을 때
            user = "가위";
            if(user.equals(com)){
            btn_ComImage.setIcon(icon_Draw);
               la2.setText(line+"비겼습니다! 다시 선택해 주세요!");
            }else if(com=="주먹"){
            btn_ComImage.setIcon(icon_Lose);
               la2.setText(line+"아쉽네요 당신이 졌습니다 ㅠㅠ");
            }else if(com=="보"){
               btn_ComImage.setIcon(icon_Win);
               la2.setText(line+"축하합니다 당신이 이겼습니다!");
            }
            
         }else if(obj==btn_Paper){ // 사용자가 보를 냈을 때
            user = "보";
            if(user.equals(com)){
            btn_ComImage.setIcon(icon_Draw);
               la2.setText(line+"비겼습니다! 다시 선택해 주세요!");
            }else if(com=="주먹"){
               btn_ComImage.setIcon(icon_Win);
               la2.setText(line+"축하합니다 당신이 이겼습니다!");
            }else if(com=="가위"){
               btn_ComImage.setIcon(icon_Lose);
               la2.setText(line+"아쉽네요 당신이 졌습니다 ㅠㅠ");
            }
            
         }
      }else if(obj==btn_Reset){
         btn_ComImage.setIcon(icon_Start);
         la2.setText(line+"가위바위보 중 한 가지를 선택해 주세요!");
      }
      
   }
}