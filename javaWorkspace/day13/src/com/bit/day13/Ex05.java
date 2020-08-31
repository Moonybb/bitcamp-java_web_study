package com.bit.day13;

public class Ex05{
	int su;
	int su2;
	Ex05(int su){
		
		this.su=su;
		}
	
	public boolean equals(Object me2){// Object 메서드 equals 오버라이드. 인자값 동일하게 적어야함.
		Ex05 me  =(Ex05)me2;
		return this.su==me.su;
	}

	public static void main(String[] args) {
	
		
		Object obj=new Object();
		Object obj2=obj;
		Object dbj3=new Object();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj2));
		System.out.println(obj.equals(dbj3));
		System.out.println("----------------------");
		
		Ex05 me = new Ex05(111);
		Ex05 me2= new Ex05(12);
		
		System.out.println(me.equals(me2));
		System.out.println(me==me2);
		System.out.println("----------------------");
		String msg="java";
		String msg2=new String("java");
		
		System.out.println(msg==msg2);
		System.out.println(msg.equals(msg2));
		
		Integer su1=new Integer(100);
		Integer su2=new Integer(100);
		
		System.out.println(su1==su2);
		System.out.println(su1.equals(su2));
		
		try {
			Ex05 me3=(Ex05)me.clone();//다형성에 의해 Object 로 받을 수 있음 객체 생성시 형변환하여 리턴가능.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	
}
