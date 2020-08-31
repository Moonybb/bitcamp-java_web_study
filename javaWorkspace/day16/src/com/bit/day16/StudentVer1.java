package com.bit.day16;

import java.util.Scanner;

/*
성적관리 프로그램 같은 경우는
2세대 언어에선
구조체라고 하는 변수들의 모임을 만들어서 그 자체를 하나의 변수로 썻다.
예를 들면
String name, int age, int math, int korean, int english를 안에 가지고있는
하나의 student라는 구조체를 만들어서 우리가 데이터 저장을 했고
그리고 함수(function)라는 것을 맏늘어서 그 프로그램의 기능들을 저장헀다.
즉 프로그램을 데이터를 담당하는 부분과 기능 부분을 분리를 해서 만듬.

즉 우리는 데이터의 생김새를 재사용하던 아니면 함수를 재사용하던 둘 중 하나를 재사용 하거나
모두 재사용 할려면 따로따로 모두 불러와야했음.

하지만 3세대 언어에서는 데이터의 형태와 그리고 기능을 하나의 클래스로 합쳐서
통째로 갖다 쓰자. 인식이 이렇게 바뀜

예를들어 우리가 지금부터 만들 Student라는 클래스의 경우
학생의 정보를 담당할 필드들과 메소드를 만들어서
우리가 필요할때마다 Student 클래스의 변수 즉 Student 객체를 만들어서 쓰면됨.

우리가 만들 Student 클래스를 활용하는 다른 클래스에서
2개의 객체 학생 A와 B를 만들었을때
학생 A와 B의 기능적 차이는 무엇인가? -> 없다.

그럼 2개의 객체의 차이는 어디서 나옴?
필드에 저장되어 있는 값이 틀려짐에서 나오게됨.

이 개념이 더 나아가게 되면
POJO라는 개념에 도달하게 됨.
plain old Java Object
"구식의 평범한 자바 객체" -> 최대한 공통분모만 모아보자 -> 공통분모 X -> 다른클래스
객체 지향의 5원칙 : SOLID
S: Single Responsibility Principle ->단일 책임 원칙
O: Open Substitution Principle ->개방폐쇄원칙
L: liskov substitution Principle ->리스코프 치환 원칙
I: Interface Segregation Principle ->인터페이스 분리원칙
D: Dependency Inversion Principle -> 의존성 역전 원칙

단일 책임 원칙에서는 우리가 클래스가 한가지만 담당하도록 디자인 하게 된다.
만약 데이터를 담당해야한다면
어떤 필드가 있고, 그 필드와 관련된 메소드들을 정의해 주게 된다.
만약 UI를 담당해야 한다면?
그러면 UI와 관련된 메서드와 필드만 넣어주면 된다.
만약 데이터를 담당하는 클래스에 값을 받아오거나 UI에서 값을 받아서 클래스를 객체를
만들어 주는 클래스가 있다면?
그것만 있음됨.

즉 엄격한 클래스 분리를 통해서 우리가 필요한 클래스만 정확하게 재사용 할 수 있게 된다.

그렇다면 만약 어떤 클래스가
다른 클래스가 꼭 필요해 진다면?

ex)위에서 언급한 데이터를 담당하는 클래스를 사용하는 클래스(주로 컨트롤러)는
	그 데이터를 담당하는 클래스가 없으면?
	아무것도 하지 못한다.
즉 2개의 클래스는 컨트롤러라는 클래스가 데이터를 담당하는 클래스에 의존적인 관계가 된다.
그렇다면 데이터를 담당하는 클래스가 변경이 되면? 컨트롤러도 변경이 되어야겟지
근데 이 변경을 피할려면 어떻게 해야할까?
ex)컨트롤러는 데이터 담당 클래스가 변경되더라도 코드상에 변경이 없거나 최대한 적게 변경된다.
그렇다면 컨트롤러는 그 외부 클래스를 자기가 값을 넣거나 빼지 않고
그냥 만들어져 있는걸 그대로 받아서 쓰면 되지 않을까?
이렇게 외부 클래스에 의존적일 때 해당 클래스가 그 외부 클래스를 직접 만들어서 쓰지 않고
외부에서 받아다가 쓰는걸 의존성 주입(Dependency Injection) 이라고 함.

이 의존성 주입의 경우에는 예전에는 우리가 코드로 직접 구현을 했지만
스프링을 배우시면? 스프링이 해준다. 
*/




public class StudentVer1 {
	//2세대 언어 관점에서 코딩했을때
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요.:");
		String name= scanner.nextLine();
		System.out.print("학생의 국어 점수를 입력하세요:");
		int korean = scanner.nextInt();
		System.out.print("학생의 영어점수를 입력하세요:");
		int english = scanner.nextInt();
		System.out.print("학생의 수학점수를 입력하세요:");
		int math = scanner.nextInt();
		int sum = korean + english + math;
		double average = sum / 3.0;
		
		System.out.printf("학생의 이름: %s\n 국어점수: %d\n 영어점수: %d\n 수학점수: %d\n 총점: %d\n 평균 : %.2f",
							name,korean,english,math,sum,average);
		
		scanner.close();
		
		
	}
	
}
