package com.bit.day11;

class Lec12{

    Lec12(int a){
        
        System.out.println("create Lec12 obj...");
        System.out.println(a);
    }

    void func01(){
        System.out.println("Lec12 func01 call..");
    }
}

public class Ex12 extends Lec12 {
    
    Ex12(){
        super(111);//부모 클래스의 생성자 호출,명세하지 않아도 되지만 부모 클래스의 생성자에 오버로딩이 되어있으면 명세함.
        System.out.println("create Ex12");
    }
    Ex12(int a){
        super(a);//부모 클래스 생성자 나타냄.
        
    }
    Ex12(String a){
       // super(122);
        this();//본인 자신의 생성자 호출 super와 공존 불가
    }
    public static void main(String[] args) {
        Ex12 me = new Ex12();
        me.func01();//object 디폴트 생성자 호출 -> Lec12(부모)의 생성자 호출 -> Ex12 생성자(자식) 호출.

    }

}