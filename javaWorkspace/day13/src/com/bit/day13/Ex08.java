package com.bit.day13;

public class Ex08 {

	public static void main(String[] args) {
		//문자열 이용
		//학생성적관리프로그램(VER 0.1.0)
		//1.보기 2. 입력 3. 수정 4. 삭제 0.종료>>1
		// 국어>
		// 영어>
		// 수학>
		// 학번 국어 	영어 	   수학 	합계 	평균
		//--------------------------------------------
		//	1	90		 90     	90		270		 90
		//	2	90		 90			90		270		 90
		//	3	90		 90			90		270		 90
		//String으로 
		int input=0;
		int output=0;
		int[] score = new int[3];
		int[] sum= new int[3]; 
		int[] average=new int[3];
		String[] book = {"국어" , "영어" , "수학"};
		String[] total=new String[3];
		boolean boo= true;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while(boo){
		System.out.println("\n"+"학생 성적 관리 프로그램(VER 0.1.0)");
		System.out.print("1.보기 2. 입력 3. 수정 4. 삭제 0.종료 >>");
		input = sc.nextInt();
		
		if(input==1){
			for(int i=0;i<score.length;i++){
				average[i]+=score[i];
				
			}
			System.out.println("학번 	국어 	영어 	수학 	합계 	평균");
			System.out.println("--------------------------------------------");
//			input2=sc.nextInt();
			for(int i=0+1;i<output+1;i++){
				for(int j=0;j<1;j++){
					System.out.print(i);
					System.out.print("\t"+score[j]+"\t"+score[j+1]+"\t"+score[j+2]);
					System.out.print("\t"+(score[j]+score[j+1]+score[j+2]));
					System.out.print("\t"+(average[j]/3));
				
				}
			}
			continue;
		
			
			}else if(input==2){
				output++;
				
					for(int i=0;i<score.length;i++){
					System.out.print(book[i]+">");
					score[i] = sc.nextInt();
					}
				
				
				
				for(int i=0;i<score.length;i++){
					
				}
				
			continue;
			
		}else if(input==3){
			
		}else if(input==4){
			
		}else if(input==0){
			break;
		}
		
		
	}//while

	}//main
}//class