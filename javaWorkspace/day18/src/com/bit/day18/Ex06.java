package com.bit.day18;

public class Ex06 {
	public static void main(String[] args) {
		BitStack stack = new BitArray(); // 다형성. 인터페이스에서의 정의를 통해서 자식클래스에는 모든걸 가지고 있으나,
										//  인터페이스에 정의된 것만 쓸 수 있게됨.
		
		stack.push(1);
		stack.push(12);
		stack.push(123);
		stack.push(1234);
		stack.push(12345);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
