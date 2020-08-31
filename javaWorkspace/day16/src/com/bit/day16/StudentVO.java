package com.bit.day16;
//Student 클래스의 필드를 정의하는 부분
//이렇게 필드를 정의하고 java.lang.Object 의 메서드를 해당 필드에 맞추어
//오버라이딩하는 메서드만 들어간다.
//이렇게 데이터를 담당하는 ' 를 ' 을 우리는 Value Object 혹은 Data Transfer Object를 줄여서
//VO 혹은 DTO 클래스라고 부른다.
// 즉 이 클래스의 이름은 StudentV0 클래스가 되어야 한다.

//더 이상 우리가 코딩을 할때 꼭 외부가 알아야 하는 메서드가 아니면 
//모두 다 private 접근 제한자를 설정하게 된다.
//하지만 private 접근 제한자는 외부 클래스의 접근을 모두 막기 때문에
//해당 필드 혹은 메서드를 아예 접근 할 수 없다.
//만약 해당 메서드가 이 클래스에서만 사용되면 상관이 없지만
//만약 외부 클래스에서 필드에 값을 넣으려면?
//더이상 직접 접근이 불가능해 진다.
//대신 우리는 메서드를 만들어서
//그 메서드들한테 값을 넣거나 값을 빼게 만들어 주어야 한다.

//이렇게 외부에 클래스 내부를 전부 다 공개 하는게 아니라
//정말 정말 꼭 필요한 메서드만 공개하게 모든 접근 제한자를 private로 넣고
//메서드들로만 관리하게 만드는 걸 캡슐화라고 한다.

public class StudentVO {
	private int id;
	private String name;
	private int korean;
	private int math;
	private int english;
	
	//필드에 값을 넣는 메서드는 우리가 setter 메서드라고 한다.
	//필드의 현재 값을 출력 하는 메서드는 우리가 getter 메서드라고 한다.
	//단 출력은 화면에 출력을 뜻하는게 아니라 그 값 자체를 리턴한다는 의미이다.
	
	public void setId(int id){
		this.id=id;
	}
	

	//셋터 메서드는
	// public void set필드명(필드타입 필드이름){
	// this.필드 = 필드;
	//}
	public void setName(String name){ //class StudentVO 의 메서드, String name을 파라미터로 받음, 그럼 this.name은 String name을 가리키고, 이 메서드의 name은 서로 다른 name을 가르키고있음. 
		this.name = name;//this는 참조변수 같은 역할
	}
	//겟터 메서드는
	//public 필드타입 get필드명(){
	// 	return 필드이름;
	//}
	public String getName(){//String type으로 리턴을 받는 메서드, 
		return name;
	}
	
	public void setKorean(int korean){
		this.korean = korean; //매개변수로 int를 받음, this.korean으로 현재 이 클래스 내의 필드맴버를 가르키고, korean은 서로 다른 값을 가짐.
	}
	public void setMath(int math){
		this.math = math;
	}
	public void setEnglish(int english){
		this.english = english;
	}
	
	
	public int getKorean(){
		return korean;
	}
	public int getMath(){
		return math;
	}
	public int getEnglish(){
		return english;
	}
	public int getId(){
		return id;
	}
	
	//equals 메서드는
	//파라미터로 모든 클래스의 객체가 넘어 올 수 있다.
	//그럼 어떻게 해야 우리가 모든 클래스 객체를 파라미터로 받는 
	//메서드를 선언 할 수 있을까?
	//1.모든 클래스를 전부 다 오버로딩 해준다.
	//2.다형성을 사용한다!!
	public boolean equals(Object o){//overload
		//2개의 객체를 비교할때 같은지 알아보려면
		//1. 2개의 객체가 같은 클래스 객체인지 확인해본다.
		//2. 2개의 객체가 같은 클래스 객체이면 해당 클래스의 필드 중 특정 필드 혹은
		//   모든필드를 비교해서 모두 다 같으면 두개가 같은 객체 이다.
		
		
		//먼저 두 객체가 같은 클래스 객체 인지 알아보자.
		//좀 더 자세하게 말하자면 파라미터로 넘어온 o가
		//null이 아니고 StudentVO 클래스의 객체 인지 확인하자.
		//우리는 여기서 간단하게 에약어 하나로 2개를 동시에 확인 할 수 있다.
		
		if(o instanceof StudentVO){ // instanceof예약어, 넘어온 파라미터 o가 null이 아니라 인스턴스 상태인지 확인.
			//이 if문 안에 들어왔다는 것은 parameter로 넘어온 Object o가
			//StudentVO 클래스의 객체란 뜻이므로
			//우리는 StudentVO의 필드를 꺼낼 수 있다.
			//하지만 Object o 이기 때문에 그 필드들을 o에서 꺼내올 수 는 없고
			//대신 명시적 형변환을 통해서 StudentVo 객체에 덮어 씌울 수 있다.
			StudentVO s = (StudentVO)o; // 오브젝트 o의 데이터 타입을 강제 캐스팅함.
			if(id==s.id){//모든 필드들이 같음
				return true;
			}
			
		}
		
		return false;
	}


	@Override
	public String toString() {
		return "학번: " +id+ ", 이름: " + name + ", 국어점수: " + korean + ", 수학점수: "
				+ math + ", 영어점수: " + english ;
	}
	
}



