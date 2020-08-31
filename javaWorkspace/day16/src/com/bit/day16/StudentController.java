package com.bit.day16;

import java.util.ArrayList;
import java.util.List;

//컨트롤러는 UI에 VO 값을 정제해서 보내주거나
//UI에서 입력받은 값을 VO에 담아 데이터베이스에 보내주는 역할을 한다.
//우리는 db가 없기 때문에 그냥 평균과 총점을 계산하는 메서드만 넣어준다.

public class StudentController {
	//실제 DI에서는 2가지 방법이 있다.
	//1. 생성자를 통한 DI
	//2. 메서드를 통한 DI
	//그중 생성자를 통한 DI를 해보도록 하자.
	//원래는 list는 우리가 필요할때마다
	//db에서 긁어와야 하지만 실제는 우리가 db가 없으므로
	//여기에 필드로 넣는다.
	//또한 polymorphism(다형성)을 활용하기 위해 data type을 ArrayList가 아닌 List로 넣는다.
	List<StudentVO> list; // 인터페이스임. 메서드만 써있음. 다형성에 의해서. 
	//인터페이스이기 때문에 ArrayList는 List를 implements한 것 이므로,
	
	public StudentController(List<StudentVO> list){ //생성자
		// 이 컨트롤러 클래스는 List<StudentVO> list(멤버필드)에 의존적인 관계이다.
		// 그렇다고 해서 이 리스트를 어떻게 초기화할지를 여기에 적어주면
		//만약 그 리스트가 변경이 가해지게 된다면 여기도 바꿔주어야만 한다
		//하지만 외부에서 리스트를 "주입"하게 된다면 여기서는 그냥
		//초기화 코드만 있기 때문에 그 주입받은 것을 그대로 쓰기만 하면 된다.
		//이러한 주입이 바로 의존성 주입이 된다.
		
		this.list = list;
	}
	
	
	public int calculateSum(StudentVO s){
		return s.getKorean() + s.getEnglish() + s.getMath();
	}
	
	public double calculateAverage(StudentVO s){
		return calculateSum(s) /3.0;
	}
	public StudentVO findById(StudentVO s){
		StudentVO result = null;
		if(list.indexOf(s) != -1){
			int index = list.indexOf(s);
			result = list.get(index);
		}
		return result;
	}
	public void add(StudentVO s){
		if(list.size()==0){
			s.setId(1);
			
		}else{					//마지막에 있는 애의
			int id = list.get(list.size()-1).getId()+1;
			s.setId(id);
		}
		list.add(s);
	}
	
	
	public void set(StudentVO s){
		int index = list.indexOf(s);
		list.set(index, s);
	}
	public void remove(StudentVO s){
		list.remove(s);
	}
}
