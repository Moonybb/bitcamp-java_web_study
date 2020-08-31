package com.bit.day11;
class Lec09{
    int su=1234;

    void func01(){
        System.out.println("Lec 09 func01....");
    }
}
public class Ex08 extends Lec09{
    
    public static void main(String[] args) {
        // Lec09 you = new Lec09();
        // you.func01();
        Ex08 me = new Ex08();

        me.func01();
    }

}