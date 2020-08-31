class Ex10{

	public static void main(String[] args){
		
		//Q1. A~Z출력하세요
		//Q2. a~z출력하세요
		//Q3. A(a) B(b) C(c) ...Z(z) 출력하세요
		//Q4. 다음을 출력하세요
		//	★★★★
		//	★★★★
		//	★★★★
		//	★★★★
		//Q5. 다음을 출력하세요
		//	1 2 3
		//	4 5 6
		//	7 8 9
		
		//Q6.   1 2 3
		//	2 3 4
		//	3 4 5
		
		//Q1
		  
		
		
	
	







		for(int i=65;i<91;i++){
			System.out.print((char)i+" ");
		}
		System.out.println();
		
		//Q2
		for(int i=97;i<123;i++){
			System.out.print((char)i+" ");
		}
		System.out.println();
		//Q3
	
		for(int i=65;i<91;i++){
			for(int j=97;j<123;j++){
				int k=j-i;
				
				if(k==32){
				System.out.print((char)i+"("+(char)j+")");
			}
			}
		}
		System.out.println();
		//Q4
		char star = '★';
		
		for(int q=0;q<3;q++){
			for(int a=0; a<4; a++){
				System.out.print(star);
			
			}
			System.out.println();
		}

		System.out.println();
		//Q5
		int q5=1;
		int q=0;
		
		for(int a=0;a<3;a++){
			
			System.out.print(q5+" ");
			System.out.print(q5+1+" ");
			System.out.print(q5+2+"\n");
			
			q5=q5+3;
		}
		
		System.out.println();
		for(int qq=1;qq<10;qq+=3){
			
			for(int qw=1;qw<4;qw++){
				
				System.out.print(qw+" ");
				
			}
			
			System.out.println();
		}
			
		//for end
		
		System.out.println();
		
		//Q6

		for(int a=0; a<3; a++){
			int b=1;
			b+=a;
			System.out.print(b + " "+(b+1)+" "+(b+2)+"\n");
		}
		


		

	}//main end



}//class end