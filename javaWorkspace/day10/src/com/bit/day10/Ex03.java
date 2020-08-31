package com.bit.day10;
class Car{
    private String model;
    private int speed;
    private int limit;
    private int accel;
    Car(){
        this("티코",100,10);
    }
    
    Car(String model,int limit,int accel){//변수명이 같아서 this사용.(this는 class Car의 변수)
        this.model=model;
        this.limit=limit;
        this.accel=accel;
    }
    void speedUp(){
        if((speed+=accel)>limit){
            speed=limit;

        }
    }
    void speedDown(){
        if((speed-=accel)<0){
            speed=0;
        }
    }
    void show(){
        System.out.println(model+"가(이)"+speed+"km로 달린다");
    }
}

public class Ex03 {
  

    

    public static void main(String[] args) {
        Car car = new Car("모닝",120,15);

        for(int i=0;i<20;i++){
            car.speedUp();
            car.show();
        }

        for(int i=0;i<20;i++){
            car.speedDown();
            car.show();
        }
    }
}