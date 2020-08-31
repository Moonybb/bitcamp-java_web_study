package com.bit.day16;

public class StudentEx01 {

	public static void main(String[] args) {
		StudentVO[] arr = new StudentVO[0];//StudentVO[] 타입의 참조변수 arr선언, 배열의 길이[0]
		StudentVO s = new StudentVO();
		s.setName("이승우");
		s.setKorean(50);
		s.setEnglish(51);
		s.setMath(52);
		System.out.println(arr.length);//객체 생성할때 배열[0]으로 선언함. 그럼 참조변수가 가리키는 배열의 길이는 0의길이
		
		arr=StudentArrayUtil.add(arr, s);//길이 늘리는 메서드 를 참조변수 arr에 리턴받음 
		System.out.println(arr.length); // 길이가 늘어난것을 볼 수 있음
		System.out.println("s의 위치: " +StudentArrayUtil.indexOf(arr, s));
		StudentVO s2 = new StudentVO();
		s2.setName("오영문2");
		s2.setKorean(50);
		s2.setEnglish(50);
		s2.setMath(50);
		System.out.println("s의 위치: "+StudentArrayUtil.indexOf(arr, s2));
	
		StudentVO s3 = new StudentVO();
		s3.setName("이승우2");
		s3.setKorean(50);
		s3.setEnglish(50);
		s3.setMath(50);
		StudentVO s4 = new StudentVO();
		s4.setName("이승우3");
		s4.setKorean(50);
		s4.setEnglish(50);
		s4.setMath(50);
		StudentVO s5 = new StudentVO();
		s5.setName("이승우4");
		s5.setKorean(50);
		s5.setEnglish(50);
		s5.setMath(50);
		arr = StudentArrayUtil.add(arr, s2);
		arr = StudentArrayUtil.add(arr, s3);
		arr = StudentArrayUtil.add(arr, s4);
		arr = StudentArrayUtil.add(arr, s5);
		System.out.println("arr의 현재크기: "+arr.length);
		arr = StudentArrayUtil.remove(arr, s4);
		System.out.println("arr의 현재크기: "+arr.length);
		
		StudentVO s6 = new StudentVO();
		s6.setName("이승우5");
		s6.setKorean(50);
		s6.setEnglish(50);
		s6.setMath(50);
		
		System.out.println("s6의 인덱스: "+StudentArrayUtil.indexOf(arr, s6));
		System.out.println("arr의 현재 크기: "+arr.length);
		arr = StudentArrayUtil.remove(arr, s6);
		System.out.println("arr의 현재 크기: "+arr.length);
		
	
	}

}
