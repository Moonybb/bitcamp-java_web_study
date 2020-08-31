package com.bit.day11;

class Lec15{
    public void func01(){
        System.out.println("Lec15");
    }
}


public class Ex15 extends Lec15{
    public void func01(){
        System.out.println("Ex15 Lec15 func01");
    }
    public void func02(){
        System.out.println("Ex15 func02");
    }
    public static void main(String[] args){
        // 다형성
        Lec15 me = new Ex15();//Lec15타입의 새로운 객체 Ex15를 생성. 실제 객체는 Ex15임
        
        me.func01();
        Ex15 you = (Ex15)me;//객체에서의 강제 캐스팅
        Lec15 me2=you;//자식에서 부모는 오토 캐스팅
        you.func02();//Lec15의 타입이므로 호출 불가능.
        System.out.println("------------------------");
        //Integer su=new Integer(1234);
        //Double su=new Double(3.14);
        Number su = new Double(3.14);
        System.out.println("su="+su);
        func03("aaaa");
    }
    public static void func03(Object a){
        System.out.println(a);
    }

}