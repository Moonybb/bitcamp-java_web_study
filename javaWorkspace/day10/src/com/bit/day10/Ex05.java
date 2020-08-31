package com.bit.day10;

public class Ex05 {
 
    public static void main(String[] args) {
        String msg1="java";
        String msg2="Framework";
        String msg3=msg1+msg2;
        String msg4=msg1.concat(msg2);//문자열은 참조변수이다.

        System.out.println(msg4);
        System.out.println("---------------------");
        
        String msg5="ja"+"va";// msg1과 msg5 참조변수의 주소값은 같다.
        String msg6="ja".concat("va");//새로운 객체 리턴(msg6의 참조값이 msg1과 다른이유)
        System.out.println(msg1==msg5);//주소 값이 같다.
        System.out.println(msg1==msg6);//새로운 객체가 리턴 됨
        System.out.println("---------------------");

        String msg7="ABCD EFG";
        System.out.println(msg7.length());
        for(int i=0;i<msg7.length();i++){
            System.out.println(msg7.charAt(i));
        }
        System.out.println("---------------------");
        char[] ch1={'A','B','C','D'};
        String msg8=new String(ch1);
        System.out.println(msg8);
        char[] ch2=msg8.toCharArray();//문자열 ch1을 인자로 받은 참조변수 msg8을 이용하여
                                        //String의 인스턴스 메서드로 참조변수 msg8의 메서드를 이용해 캐릭터배열을 만듬.
                                        
        for(int i=0;i<ch2.length;i++){
            System.out.println(ch2[i]);

        }
        
        

    }
}