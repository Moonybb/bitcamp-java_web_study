package com.bit.day20;

class Lec10<T,V>{
	private T su;
	private V msg;
	
	void setSu(T su){
		this.su=su;
	}
	void setMsg(V msg){
		this.msg=msg;
	}
	T getSu(){
		return su;
	}
	V getMsg(){
		return msg;
	}
	
}




public class Generics2 {

	public static void main(String[] args) {
		Lec10<Double,StringBuffer> lec= new Lec10<Double,StringBuffer>();
		
		lec.setSu(3.14);
		lec.setMsg(new StringBuffer("hello"));
		System.out.println(lec.getSu());
		System.out.println(lec.getMsg());
	}

}
