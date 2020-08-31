package com.bit.day07;


class Ex09{
	//Q1 A~Z출력하세요
	

	public static void main(String[] args){
	 	for(int i=0;i<'Z'-'A'+1; i++){
			char tmp=(char)('A'+i);
			System.out.print(tmp+ " ");
		}
		System.out.println("\n--------------------------------\n");
		for(int i=0;i<'z'-'a'+1; i++){
			char tmp=(char)('a'+i);
			System.out.print(tmp+ " ");
		}
		System.out.println("\n--------------------------------\n");
		for(int i=0;i<'Z'-'A'+1; i++){
			char tmp=(char)('A'+i);
			char tmp2=(char)('a'+i);
			System.out.print(tmp+"("+tmp2 +")");
		}
		System.out.println("\n--------------------------------\n");
		for(int i=0; i<16;i++){
		
			if(i%5!=0){
				System.out.print('★');
			
			}else {
				System.out.println();
			}
		
		
		}//for end
		System.out.println("\n--------------------------------\n");
		int su=1;
		for(int i=1;i<13;i++){
			if(i%4!=0){
				System.out.print(su++ +" ");
			}else{
				System.out.println();
			}
		
		}//for end
		System.out.println("\n--------------------------------\n");
		su=1;
		for(int i=0;i<3;i++){
			for(int j =0; j<3;j++){
				System.out.print(su+j+3*i);
				System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println("\n--------------------------------\n");		
		
		int limit=3;
		for(int i=1;;i++){
			System.out.print(i);
			System.out.print(' ');
			if(limit==i){
				limit++;
				i-=2;
				System.out.println();
			 if(limit==6){break;}
			}	
		
		}
		System.out.println("\n--------------------------------\n");	
		for(int i=0;i<3;i++){
			for(int j=1;j<4;j++){
				System.out.print(j+i);
				System.out.print(' ');
			}
			System.out.println();
		}



	}//main end





}