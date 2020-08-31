class Ex18{
	public static void main(String[] args){
	/*
	다음을 출력하세요
	평균 	A 90~100
		B 80~90
		C 70~80
		D 60~50
		F 50미만
	
	성적관리 프로그램(ver 0.0.1)
	-------------------------------
	국어 90
	영어 80	
	수학 70
	-------------------------------
	합계 0000
	-------------------------------
	평균 00.00
	-------------------------------
	학점 B학점
	
	
	*/
		String line = "-------------------------------";
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int a,b,c;
		a=0,b=0,c=0;
		System.out.print("국어 점수 : " );

		a = sc.nextInt();

		if(a<101){
			System.out.println("입력한 값이 초과 되었습니다.");
		} else if(b<101) {
			System.out.print("수학 점수 : ");
			b = sc.nextInt();
			System.out.println("입력한 값이 초과 되었습니다.");
		} else if(c<101){
			System.out.print("영어 점수 : ");
			c = sc.nextInt();
			System.out.println("입력한 값이 초과 되었습니다.");
		}
		c = sc.nextInt();
		int sum = a+b+c;
		double average = sum*100/3/100.0;
		System.out.println("성적관리 프로그램(ver 0.0.1)");
		System.out.println(line);
		System.out.println("국어 "+a);
		System.out.println("영어 "+b);
		System.out.println("수학 "+c);
		
		
		System.out.println(line);
		System.out.println("합계 "+sum);
		System.out.println(line);
		System.out.println("평균 "+average);
		System.out.println(line);
		
		String grade;
		grade = "";
		if(100>average && average>=90){
			grade = "A";
		}else if(average>=80){
			grade = "B";
		}else if(average>=70){
			grade = "C";
		}else if(average>=60){
			grade = "D";
		}else if(average>=50){
			grade = "F";
		
		}
		System.out.println("학점 " + grade +"학점");
		


	}

}