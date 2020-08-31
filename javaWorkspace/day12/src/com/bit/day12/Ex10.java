package com.bit.day12;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // 주민번호입력:000000-3000000
	    // >>당신은 00세 남자입니다.
	    
	    // 주민번호 입력:000000-2000000
	    // >>당신은 00세 여자입니다.

	    // 주민번호 입력:0000000000000
	    // >>입력패턴을 다시 확인하세요(000000-0000000)
	    // 주민번호 입력:00000000000000
	    // >>입력패턴을 다시 확인하세요(000000-0000000)
	    // 주민번호 입력:000000-000000
	    // >>주민번호 자리수를 다시 확인하세요
	        
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String msg=null;
		while(true){
			System.out.print("주민번호입력:");
			msg = sc.nextLine();
			//msg = "990202-1333333";
			/////
			if(msg.length()!=14){
				System.out.println("자릿수를 다시 확인하세요. (000000-0000000)");
				continue;
			}else if(msg.charAt(6)!='-'){
				System.out.println("입력패턴을 다시 확인하세요 (000000-0000000)");
				continue;
			}
			boolean suCheck=false;
			for(int i=0;i<msg.length();i++){
				if(i==6){continue;
				}
				if(!(msg.charAt(i)>='0'&&msg.charAt(i)<='9')){
					suCheck= true;
				}
					
				
			}
			if(suCheck){continue;}
			
			/////
			char year1=msg.charAt(0);//'0'
			char year2=msg.charAt(1);//'9'
			int year = (year1-'0')*10+(year2-'0')*1;//ASCII 코드로 생각하여 오토캐스팅.
			//		int su='0'-'0' ; //ASCII 48-48
			char gender = msg.charAt(7);
			
			if(gender=='3'||gender=='4'){
				System.out.print("당신은 "+(2020-(2000+year)+1)+"세");
			}else if(gender=='1'||gender=='2'){
				System.out.print("당신은 "+(2020-(1900+year)+1)+"세");
			}
					
			
			if(gender=='1'||gender=='3'){
				System.out.println(" 남자 입니다.");
			}else if(gender=='2'||gender=='4'){
				System.out.println(" 여자 입니다.");
			
			}else{continue;}
		
			break;
		}//while
		
	}//main

}//class
