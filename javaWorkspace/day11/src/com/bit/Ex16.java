package com.bit;
import java.util.Scanner;
public class Ex16 {
    
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
        
    public static void main(String[] args) {
        System.out.print("주민 번호 입력기\n\n");
        String number = "000000-0000000";
        String input="";
        String gender = "";
        int age = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.print("주민 번호 입력 : ");
        input = sc.nextLine();   
        

        if(input.length()==number.length()&&input.charAt(6)=='-'){

        if(input.charAt(7)%2==0&&input.charAt(7)>5){
            gender= "여자";
        }else if(input.charAt(7)%2!=0&&input.charAt(7)>5){
            gender= "남자";
        }else{
            break;
        }
        
        


        
        
        System.out.print("\n >> 당신은 " + age +"세 "+ gender +" 입니다");
        
        }else {
            System.out.println(">>입력패턴을 다시 확인하세요(000000-0000000)");
        }// if end
    }

    }//main end
}// class end