package com.bit.day16;

import java.util.ArrayList;
//우리가 왜 배열에 맞추어서 메서드를 만들어야하냐?
//부제 : ArrayList는 답을 알고 있다.

//collections Framework에는
//여러 종류의 여러 객체를 한번에 다룰 수 있게 해주는
//다양한 클래스 들이 있다
// 가장 대표적인 예가 바로 우리가 지금 배울 ArrayList가 된다.
public class StudentEx02 {
	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<>();
		//< >는 template이라고 부른다.
		//template이란 해당 콜렉션 객체가 무슨 클래스의 집합인지 지정한다.
		//단, 템플릿 안에는 클래스만 들어 갈 수 있다.
		//왜냐? 이 Collection Framework는 주소값을 이용하여 집합 내의 요소들을
		//컨트롤 하기 때문에 주소값이 존재하지 않는 기본형 데이터 타입들은
		//template 안에 들어 갈 수 없다.
		//그래서 자바는 이 기본형 데이터 타입을 클래스로의 형태로 바꾼
		//포장 클래스(wrapper 클래스)가 존재한다
		
		//collection Framework equals() 메소드를 적극적으로 내부에서 활용한다.
		//따라서 여러분들이 Collection Framework에 들어있는 클래스를 제대로 활용하기 위해서는
		//여러분들의 클래스에 equals() 메서드를 정의하는 것이 매우 중요하다.
		//왜냐! java.lang.Object의 equals 메서드는 
		//return this==0;만 적혀있다.
		
		//어레이리스트의 경우 크기가 자동으로 바뀐다.
		//어레이리스트의 현재 크기는 size()메서드를 실행시키면된다.
		System.out.println("list의 현재크기:"+list.size());
		
		StudentVO s1 = new StudentVO();
		s1.setName("조재영1");
		s1.setKorean(81);
		s1.setEnglish(80);
		s1.setMath(80);
		StudentVO s2 = new StudentVO();
		s2.setName("조재영2");
		s2.setKorean(81);
		s2.setEnglish(80);
		s2.setMath(80);
		
		StudentVO s3 = new StudentVO();
		s3.setName("조재영3");
		s3.setKorean(81);
		s3.setEnglish(80);
		s3.setMath(80);
		
		StudentVO s4 = new StudentVO();
		s4.setName("조재영4");
		s4.setKorean(81);
		s4.setEnglish(80);
		s4.setMath(80);
		
		StudentVO s5 = new StudentVO();
		s5.setName("조재영5");
		s5.setKorean(81);
		s5.setEnglish(80);
		s5.setMath(80);
		list.add(s1);
		System.out.println("list의 현재크기:"+list.size());
		list.add(s2);
		System.out.println("list의 현재크기:"+list.size());
		list.add(s3);
		System.out.println("list의 현재크기:"+list.size());
		list.add(s4);
		System.out.println("list의 현재크기:"+list.size());
		list.add(s5);
		System.out.println("list의 현재크기:"+list.size());
		//만약에 특정 위치에 끼어넣기를 하면?
		//원래 그 번호에 있던 객체 부터는 하나씩 뒤로 밀리고 그 위치에
		//우리가 파라미터로 넘긴 객체가 들어간다.
		//이때는 add(index, element) 인덱스 넘버, 
		StudentVO s6 = new StudentVO();
		s6.setName("조재영6");
		s6.setKorean(81);
		s6.setEnglish(80);
		s6.setMath(80);
		
		//list에서 해당 위치의 객체를 호출할때에는
		//get(index)로 호출한다.
		System.out.println("index 2의 studentVO의 getName():" +list.get(2).getName());
		list.add(2, s6);
		System.out.println("index 2의 studentVO의 getName():" +list.get(2).getName());
		
		//list에서 해당 객체의 위치를 알고 싶을때에는
		//indexOf(e)로 호출한다.
		System.out.println("s4의 list index:"+list.indexOf(s4));
		
		//만약 해당 객체가 리스트에 여러개 있으면 항상 제일 앞에 있는
		//index가 리턴된다.
		
		//만약 가장 뒤에 있는 index가 궁금하면?
		list.add(s4); //s4가 두개 존재하지만, indexOf는 가장 앞에있는 인덱스값 리턴,
		System.out.println("s4의 list lastIndex:" + list.lastIndexOf(s4));
		
		//index까진 필요없고 리스트에 애가 있냐 없냐만 알고 싶다면
		//contains()를 실행하면 된다.
		
		System.out.println("contains(s4) "+list.contains(s4));
		
		//indexOf, lastIndexOf, contains 모두
		//존재하지 않는 객체를 찾으라고 시키면
		//각각 -1,-1, false가 리턴된다.
		
		//list에서 삭제할때 2가지 방법이 가능하다.
		//1. 해당 인덱스를 삭제해 주세요.
		//2. 해당 객체와 일치하는 요소 중에서 가장 앞번호를 삭제해 주세요.
	
		System.out.println("list의 현재크기:"+list.size());
		list.remove(0);
		System.out.println("list의 현재크기:"+list.size());
		System.out.println("contains(s6) "+list.contains(s6));
		
		StudentVO s60 = new StudentVO();
		s60.setName("조재영6");
		s60.setKorean(81);
		s60.setEnglish(80);
		s60.setMath(80);
		list.remove(s60);//파리미터가 오버라이딩 되어있음.
		
		
		
		
		System.out.println("contains(s6) "+list.contains(s));
		
	}
	
}