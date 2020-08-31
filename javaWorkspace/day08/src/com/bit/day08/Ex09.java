package com.bit.day08;

class Ex09{

	public static void main(String[] args){

		System.out.println("Q1--------------------------");
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(j<=i){System.out.print('★');}
			}
			System.out.println();
		}
		System.out.println();
		int total1=0;
		int cnt=2;
		for(int i=0;i<10;i++){
			System.out.print('★');
			if(i==total1){
				System.out.println();
				total1+=cnt++;
			}//if end

		}//for end
		System.out.println("Q2--------------------------");
		for(int i=0; i<4; i++){
			for(int j=0;j<4;j++){
				
				if(j<=i){System.out.print(j+1);}
			}
			System.out.println();
		}
		System.out.println();
		int su1=2;
		for(int i=1;i<5;i++){
			
			if(i%su1==0){System.out.println();
				su1++;
				i=0;
			}else{
				System.out.print(i%su1);
			}
		}//for end
		
		
		System.out.println();
		
		System.out.println("Q3--------------------------");
		
		
		System.out.println("Q4--------------------------");
		System.out.println("Q5--------------------------");
	
	for(int i=0;i<4;i++){
		for(int j=i+1;j>0;j--){
		System.out.print(j);
		System.out.print(' ');
		}
		
		
		System.out.println();

	}//for end
		
		System.out.println("Q6--------------------------");
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			if(j>=i){System.out.print('★');}
		}		
		System.out.println();
	
	}
		System.out.println("Q7--------------------------");

	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			if(j>=3-i){
				System.out.print('★');
				System.out.print(' ');
			}else{
			System.out.print('　');
		}
		}//for end		
		System.out.println();
	
	}
	

	}//main end



}//class end