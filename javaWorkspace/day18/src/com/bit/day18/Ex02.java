package com.bit.day18;

import java.text.DateFormat;

public class Ex02 {
   public static void main(String[] args) {
      // 주민번호 확인
      java.util.Scanner sc = null;
      sc = new java.util.Scanner(System.in);
      String msg = null;
      
      
      // 일이삼사오육-일이삼사오육칠
      char[] origin = {'0','1','2','3','4','5','6','7','8','9'};
      char[] target = {'영','일','이','삼','사','오','육','칠','팔','구'};
      int age = 1;
      char gender = '$';
      
      while(true){
    	  System.out.println("주민번호 >>");
          msg = sc.nextLine();
          if(msg.length()!=14){
        	  System.out.println("입력을 다시 확인 하세요.");
        	  continue;
          }
          if(msg.charAt(6)=='-'){
        	  System.out.println("입력을 다시 확인 하세요.");
        	  continue;  
          }
          
          
	      for(int i=0; i<msg.length(); i++){
	         // char 값이 숫자인지 여부를 판단하여 true또는 false값으로 리턴한다.
	         if(i==6){continue;} // 주민등록번호의 '-'는 넘어가게 해줌
	         if(!Character.isDigit(msg.charAt(i))){ //숫자가 아니면 if문을 들어온다.
	            for(int j=0; j<target.length; j++){
	               if(msg.charAt(i)==target[j]){ // 해당하는 숫자와 한글의 인덱스번호가 일치할 때
	                  String before = msg.substring(0,i);
	                  String after = msg.substring(i+1);
	                  msg=before+origin[j]+after; 
	               }
	            }
	         }
	      }
	      boolean boo=false;
	      for(int i=0;i<msg.length();i++){
	    	  if(i==6){continue;}
	    	  char temp = msg.charAt(i);
	    	  if(!Character.isDigit(temp)){
	    		  System.out.println("입력을 다시 확인하세요");
	    		  boo=true;
	    		  break;
	    	  }
	      }
          if(boo){continue;}
	      // 123456-2134567
	      // ('1'-'0')*10+('2'-'0'); 
	      // 연도를 뽑아내기 위하여 char값을 숫자로 만들기 위해 '0'을 빼주고 그 값들에 자리수에 맞춰서 앞자리를 십의자리수로 늘리기 위해 *10을 하고 두번째 자리와 더해줌으로서 연도를 구함
	      // 000000-0000000 -> 공일공일일이-사칠팔구이일육
	      // 연도를 뽑아내기 위해서 인덱스번호 0 번부터 2까지 잘라낸다.
	      int year = 0;  // year에 연도를 Integer.parseInt로 int형으로 형변한 후에 저장
	     
	      year = Integer.parseInt(msg.substring(0, 2));
	  
	      java.util.Date now = new java.util.Date();
	      DateFormat now2 =java.text.DateFormat.getInstance();
	      String result = now2.format(now);
	      int nowYear = Integer.parseInt(result.substring(0,2));
	      gender = msg.charAt(7);
	      
	      // 주민등록번호 뒷자리 첫번째 자리를 비교하여 나이값 계산
	      if(gender=='1'||gender=='2'){
	         age=(2000+nowYear)-(year+1900)+1;
	      }else {
	         age=(2000+nowYear)-(year+2000)+1;
	      }
	      // 주민등록번호 뒷자리 첫번째 자리를 비교하여 성별을 계산
	      if(gender=='1'||gender=='3'){
	         gender='남';
	      }else if(gender=='2'||gender=='4'){
	         gender='여';
	      }
	      break;
      }
      System.out.println("당신은 "+age+"세 "+gender+"성입니다.");
      
      
      
   }
}