import java.util.Scanner;





class Ex24{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int kor=0;
		int eng=0;
		int math=0;
		
		System.out.print("국어 점수 : ");
		kor=sc.nextInt();
		if(kor>100){
			System.out.println("100이 초과되었습니다.");
			System.out.print("국어 점수 : ");
			kor=sc.nextInt();
		}
		System.out.print("영어 점수 : ");
		eng=sc.nextInt();
		System.out.print("수학 점수 : ");
		math=sc.nextInt();
		
		int sum=kor+eng+math;
		int length=3;
		
		double avg=sum*100/length/100.0;
		char grade = 'F';
		/*
			A 65
			B 66
			C 67
			D 68


			E 69
			F 70
		
		
		*/

		int tmp=sum/30;
		switch(tmp){
			case 10:
			case 9:
			grade-=1;
			case 8:
			grade-=1;
			case 7:
			grade-=1;
			case 6:	
			grade-=2;
			default:
				
		
		}
		
		
		String msg= "";
		msg+="\n\n\n성적관리 프로그램(ver 0.0.2)";
		msg+="\n-------------------------------";
		msg+="\n국어 "+kor;
		msg+="\n영어 "+eng;
		msg+="\n수학 "+math;
		msg+="\n-------------------------------";
		msg+="\n합계 "+sum;
		msg+="\n-------------------------------";
		msg+="\n평균 "+avg;
		msg+="\n-------------------------------";
		msg+="\n학점 "+grade+"학점";

		System.out.println(msg);




	}



}