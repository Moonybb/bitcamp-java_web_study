package com.bit.day16;

import java.util.*;

public class StudentEx03 {

	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		StudentController controller = new StudentController(list);
		Scanner sc = new Scanner(System.in);
		StudentViewer viewer = new StudentViewer();
		while(true){
			System.out.println("비트 고등학교 성적 입출력 프로그램");
			System.out.print("1. 보기 2. 입력 3. 수정 4. 삭제 0. 종료 ");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 2){
				//입력할때만 객체를 만들어서 쓰자.
				//그리고 그 객체를 리스트에 추가하면 언제든 불러올 수 있다.
				StudentVO s = viewer.setInformation(sc);
				controller.add(s);
			}else if(choice == 1){
				System.out.println("학번\t|이름 \t |국어 \t |영어 \t |수학 \t");
				for(StudentVO s : list){//독립적으로 존재할수있음 >;;< :  ;; 
					
					System.out.println(s);
				}
			}else if(choice == 0){
				System.out.println("사용해 주셔서 감사합니다.");
				break;
			}else if(choice == 3){
				if(list.size() ==0){
					System.out.println("아직 아무것도 없습니다.");
				}else {
					for(StudentVO s : list){
						System.out.println(s);
					}
				
				
				//수정 구현
				
				
				System.out.println("수정할 학번을 선택해주세요: ");
				StudentVO s = new StudentVO();
				s.setId(sc.nextInt());
				while(controller.findById(s)==null){
					System.out.println("잘못된 학번입니다.");
					System.err.print("수정할 학번을 선택해주세요: ");
					s.setId(sc.nextInt());
				
				}
				sc.nextLine();
				s = viewer.setInformation(sc);
				//수정의 경우 두가지 방법으로 접근 가능하다.
				//1. 해당 index에 끼워넣고 원래 있던걸 삭제
				//2. ArrayList.set()을 사용하는 방법
				//하지만 둘중 어느걸 쓰더라도 index가 필요하니 미리 받아놓자
				controller.set(s);
				}
			}else if(choice == 4){
				//삭제 구현
				if(list.size() ==0){
					System.out.println("아직 아무것도 없습니다.");
				}else{
				for(StudentVO s : list){
					System.out.println(s);
				}
				System.out.println("삭제할 학번을 선택해주세요: ");
				StudentVO s = new StudentVO();
				s.setId(sc.nextInt());
				while(controller.findById(s)==null){
					System.out.println("잘못된 학번입니다.");
					System.err.print("삭제할 학번을 선택해주세요: ");
					s.setId(sc.nextInt());
				
				}
				sc.nextLine();
				controller.remove(s);
			}
		
		
		}
		
		}
		sc.close();
	}

}
