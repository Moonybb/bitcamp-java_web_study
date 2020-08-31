package com.bit.day11;

final class Lec13{//더 이상 상속 불가.
    public void func01(){
        System.out.println("Lec 13 func01...");
    }
    private void func02(){//해당 클래스 내에서만 접근 가능
        System.out.println("private func02...");
    }

}




public class Ex13 extends Lec13{//final 상속불가하게 됨 
    //모르는 메서드는 걍 public 붙이자
    // public > default(동일 패키지에서만 접근가능) > private(클래스 내에서만 접근가능)
    public void func01(){
        super.func01();//부모의 func01 메서드 호출
        System.out.println("Ex13 func01");
    }
    // void func02(){
    //     //overide로 부모 메서드 덮어써 사용가능
        
    // }


    public static void main(String[] args) {
        Ex13 me=new Ex13();
        me.func01();
        me.func02();
    }
}