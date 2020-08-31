package com.bit.day09;

public class Ex03 {
    // default 생성자는 접근제한자가 public
    final static int su2=333; // 반드시 초기화 하여 사용
    final int su;
    Ex03(int a){
        // 객체는 생성 되었음.
        // 객체 생성 시점에 하고 싶은 일
        // 해당 생성자의 호출은 객체 생성시 
        // 단 한번만 이루어 진다.
        ///////////////////////////////////////
        // 필드의 초기화
        su=a;
    }//정의함으로써 동일 패키지에서만 객체생성 가능.
        

    public static void main(String[] args){
        // 상수형 변수
        // 이름 대문자로만
        final int a;
        a=1111; // 변수의 초기화
        //a=2222; // 변수의 대입

        final double PI = 3.14;
        
        Ex03 me = new Ex03(1111);
        Ex03 you=new Ex03(1234);
        me.su++;
        you.su++;
        System.out.println(me.su);
        System.out.println(you.su);
        
    }    
}