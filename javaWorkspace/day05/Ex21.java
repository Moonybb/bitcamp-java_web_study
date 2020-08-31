class Ex21{
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
	국어 100
	영어 95	
	수학 70
	-------------------------------
	합계 0000
	-------------------------------
	평균 00.00
	-------------------------------
	학점 B학점
	*/	
		int korean,english,math;
		korean=77;
		english=95;
		math=90;
		int length=3;
		int sum=korean+english+math;
		double average=sum*100/length/100.0;
		String A = "-------------------------------";	

		String grade= "";
		
		switch((int)(average/10)){
			case 10:
			case 9:
			grade = "A";
			break;
			
			case 8:
			grade = "B";
			break;
			
			case 7:
			grade = "C";
			break;
			
			case 6:
			grade = "D";
			break;
			
			default :
			grade = "F";
			break;
		}
		System.out.println("성적관리 프로그램(ver 0.0.1)");
		System.out.println(A);
		System.out.println("국어"+ korean);
		System.out.println("영어"+ english);
		System.out.println("수학"+ math);
		System.out.println(A);
		System.out.println("합계"+ sum);
		System.out.println(A);
		System.out.println("평균"+ average);
		System.out.println(A);
		System.out.println("학점 "+ grade+"학점");
				
	

	}

}