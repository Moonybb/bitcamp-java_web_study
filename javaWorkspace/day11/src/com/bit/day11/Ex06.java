package com.bit.day11;

import java.util.Scanner;
public class Ex06 {
    
    
    public static void main(String[] args) {
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
        
        String gender = "";
        String[] numberarray = new String[14];
        for(int i=0;i<numberarray.length;i++){
            numberarray[i] = "";
        }
        boolean boo = true;
        while(boo){
        System.out.print("\n 주민번호 입력 : ");
        Scanner sc = new Scanner(System.in);
        
        String number = sc.nextLine();

        numberarray[0]= number;
        System.out.println(numberarray[0]);
        
        if(numberarray[0].charAt(6)!='-'){
            System.out.println("입력 패턴을 다시 확인하세요. (000000-0000000)");
            boo = false;
        }
        
        if(numberarray[0].charAt(7)%2==0&&numberarray[0].charAt(7)>5){
            gender = "여자";
        }else if(numberarray[0].charAt(7)%2!=0&&numberarray[0].charAt(7)>5){
            gender = "남자";
        }else {
            System.out.println("입력 패턴을 다시 확인하세요. (000000-0000000)");
            boo = false;
        }

        
        //저장된 배열 출력
        // for(int i=0;i<numberarray.length;i++){
        //     System.out.println(numberarray[i]);
        // }
        
        
        System.out.print("\n>> 당신은 "+ " 00세 "+ gender +"입니다");
        }
    
    }// main end
}// class end