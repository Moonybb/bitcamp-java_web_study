package com.bit.day09;

class Car{
    
    
    
    String model;
    private int speed=0;
    private int limit=150;
    private int accel=5;
    //객채 생성시의 @overload
    Car(){//인자를 안주느냐.(default 값)
        model="승용차";
        limit=150;
        accel=10;
    }
    Car(String name,int a,int b){//인자를 주느냐.
        model=name;
        limit=a;
        accel=b;
    }// 필드 값의 초기화. 객체 생성시 인자로 받아 변환 시켜 사용가능.

    void speedUp(){
        if((speed+=accel)>limit){speed=limit;}
    }
    void speedDown(){
        if((speed-=accel)<0){speed=0;}
    }
    void show(){
        System.out.println(model+"이 "+speed+"km로 달린다.");
    }

}



public class Ex04 {
    
    public static void main(String[] args){
        Car car=new Car();
        
        car.show();
        for(int i=0; i<40; i++){
            car.speedUp();
            car.show();
        }
        
        for(int i=0;i<40;i++){
            car.speedDown();
            car.show();

        }

        car=new Car("셀토스",180,15);
        for(int i=0; i<40; i++){
            car.speedUp();
            car.show();
        }
        for(int i=0;i<40;i++){
            car.speedDown();
            car.show();

        }
        

    }
}