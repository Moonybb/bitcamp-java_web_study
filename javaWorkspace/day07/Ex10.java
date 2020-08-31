package com.bit.day07;

class Ex10{

	public static void main(String[] args){
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print('★');
			}
			System.out.println();
		}
	// 1 2 3
	// 4 5 6
	// 7 8 9	
		int su=1;
		for(int i=0; i<3; i++){
			for(int j=0;j<3;j++){
				System.out.print(su++);
			}
			System.out.println();
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(i+1+j);	
			}
			System.out.println();
		}




	}//main end





}