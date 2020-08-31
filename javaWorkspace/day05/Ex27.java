class Ex27{
	public static void main(String[] args){
		
		//Q1. 1~10까지의 합을 구하시오.
		//Q2. 1~10까지의 짝수들의 합을 구하시오.
		//Q3. 1+3+5+7+9=25를 출력하시오.
		//Q4. 1~50까지 3의 배수를 출력하시오.
		//Q5. 2의 1승, 2의2승 ,2의3승,2의4승,2의5승을 출력하시오.
		int sum1=0;
		for(int i=1;i<11;i++){
			sum1+=i;
			}
		System.out.println("Q1 . 1~ + ~10" + " = " + sum1);
			
		int sum2=0;
		for(int i=2;i<11;i++){
			if(i%2==0){
			
			sum2+=i;
			}
		}
		System.out.println("Q2 . 10까지 짝수의 합" + "=" + sum2);
		int sum3=0;	
		for(int i=1;i<10;i++){
			if(i%2==1){
				sum3+=i;	
			}
			
			
		}
		System.out.println("Q3 . 1+3+5+7+9"+" = "+sum3);
		System.out.println("-----------------------------------------------");
		
		int sum4=0;
		boolean first = false;
		for(int i=1; i<10; i+=2){
			sum4+=i;
			if(first){System.out.print('+');}
			first=true;
			System.out.print(i);		
		}
		System.out.println("="+sum4);
		
			
		for(int i=1;i<51;i++){
			
			if(i%3==0){
				System.out.print(i+" ");
			}if(i==48){
				System.out.print("\n");
			}	
			
				
			
		}	
		
		System.out.println("-----------------------------------------------");
		boolean first1 = false;
		for(int i = 1; i<=50; i++){
			if(i%3==0){
			
				if(first1){System.out.print(',');} // 불리언 변수 false 선언, 처음 상수에 , 안붙이게됨
				
				System.out.print(i);
				first1=true; // true로 바뀌며 그대로 반복
				
			
			
			}
		
		
		
		}
		System.out.print('\n');	
		

		int sum5 = 1;
		for(int i=1;i<6;i++){
			sum5*=2;
			System.out.print("2의"+ i +"승"+" = "+ sum5+" , ");
			
		}




	}



}