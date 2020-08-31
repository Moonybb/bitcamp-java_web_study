package com.bit.day20;

class Lec1<T>{
	T obj;
	void setObj(T obj){
		this.obj=obj;
	}
	T getObj(){
		return obj;
	}
}

public class Generics3 {

	public static void main(String[] args) {
		// WildCard Generic Type
		//이게 뭐하나 싶긴함;
		//의미가 뒤에 있다는데 지금 처가르치고있음
		//< ? super Number> Number 상위 타입만... 
		//<? extends Number>Number 상속 받는 타입만 가능.
		
		Lec1<? extends Integer> lec1 = new Lec1<>();
//		Lec1<String> lec2=(Lec1<String>) lec1;
		lec1.setObj(1234);
		Object msg=lec1.getObj();
		System.out.println(lec1.getObj());
		
	}

}
