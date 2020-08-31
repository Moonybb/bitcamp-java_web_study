package com.test;

class Target{
	
	public Target(){
		System.out.println("°´Ã¼»ý¼ºµÊ");
	}
	void func01(){
		System.out.println("Target func..");
		
	}
}

public class Ex01 {
	
	public static void main(String[] args) {
//		Target target = new Target();
//		target.func01();
		
		String info = "com.test.Target";
		try {
			Class cla =Class.forName(info);
			Target result = (Target)cla.newInstance();
			result.func01();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}
