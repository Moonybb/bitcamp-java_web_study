package com.bit.day20;

import java.util.ArrayList;


class Lec12<T> {
   T obj;
   void setObj(T obj) {
      this.obj = obj;
   }
   T getObj() {
      return obj;
   }
   void func(java.util.List<? extends Number> list) {
      for(int i =0; i < list.size(); i++) {
         System.out.println(list.get(i));
      }
   }
}


public class Generics4 {

   public static void main(String[] args) {
//      ArrayList<String> list = new ArrayList<String>();
      ArrayList<Integer> list = new ArrayList<Integer>();
      //list.add(1111);
      //list.add(3333);
      Lec12<Number> lec = new Lec12<>();
      lec.func(list);
      
      
      // WildCar Generic Type 여기에 따른 결정을 보류
      //< ? super Number> Number 기준 위로
      // < ? extends Number> Number 기준 아래로
      
//      Lec1< ? super Number> lec1 = new Lec1<>();
//      // Lec1<String> lec2 = (Lec1<String>) lec1;
//      lec1.setObj(1234);
//      Object msg = lec1.getObj();
//      System.out.println(lec1.getObj());
      
   }

}