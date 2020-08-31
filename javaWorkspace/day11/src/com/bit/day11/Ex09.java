package com.bit.day11;
class Father{

    int money=1000;
    void work(){
        money+=100;
        System.out.println("돈벌어온다");
    }
    void push(){
        money-=10;
    }

}

class Son extends Father{
    //메서드 오버라이드


    void work(){
        money+=10;
        System.out.println("용돈을 받는다");
    }
}

public class Ex09 {

    public String toString(){
        return "나 자신";
    }
    public static void main(String[] args) {
        // Father fa = new Father();
        // System.out.println(fa.money);
        // fa.work();
        // fa.work();
        // fa.work();
        // fa.push();
        // System.out.println(fa.money);    
        Son son = new Son();
        System.out.println(son.money);   
        son.work();
        System.out.println(son.money);
        Ex09 me=new Ex09();
        System.out.println(me.toString());
        
    }
    
}
