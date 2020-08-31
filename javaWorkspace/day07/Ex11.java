/*

Q1.
★
★ ★
★ ★ ★
★ ★ ★ ★

Q2.
1
1 2
1 2 3
1 2 3 4
Q3.
1
2 3
4 5 6
7 8 9 10

Q4.
A
B C
D E F
G H I J
//Q5.
//1
//2 1
//3 2 1 
//4 3 2 1
//Q6.
//★ ★ ★ ★
//★ ★ ★
//★ ★
//★











*/



package com.bit.day07;

class Ex11{

	public static void main(String[] args){
	//Q1
	for(int i=0;i<4;i++){
		for(int j=0;j<=i;j++){
			System.out.print('★');
			System.out.print(' ');
		}
		//
		System.out.println();
	}//for end
	//Q2
	for(int i=0;i<5;i++){
		for(int j=0;j<i;j++){
			System.out.print(j+1);
			System.out.print(' ');
		}
		//
		System.out.println();
	}//for end
	System.out.println();
	//Q3
	int su1=1;
	int k=0;
	for(int i=0;i<4;i++){
		k=su1;
		for(int j=0;j<=i;j++){
			
			su1++;
			System.out.print(k+j);
			System.out.print(' ');
			
			}
		
		System.out.println();
	}//for end
	//Q4.
	//A
	//B C
	//D E F
	//G H I J
		System.out.println();
	su1=65;
	k=0;
	char moonja = 'A';
	for(int i=0;i<4;i++){
		
		k=su1;
		for(int j=0;j<=i;j++){
			su1++;
			System.out.print((char)(k+j));
			System.out.print(" ");


		}
		System.out.println();
	}//for end
	System.out.println();
//Q5.
//1
//2 1
//3 2 1 
//4 3 2 1
//Q6.
//★ ★ ★ ★
//★ ★ ★
//★ ★
//★	
	//Q5
	for(int i=0;i<4;i++){
		for(int j=0;j<=i;j++){
		System.out.print(i+1-j);
		System.out.print(' ');
		}
		
		System.out.println();
	}//for end
	System.out.println();

	//Q6
	su1=4;
	boolean boo=true;
	for(int i =0;i<4;i++){
		for(int j=0;j<su1;j++){
			System.out.print('★');
			System.out.print(' ');
		}
		su1--;
	System.out.println();
	}//for end
//Q7
//    ★
//   ★★
//  ★★★
// ★★★★ 
	System.out.println();

	su1=3;
	int su2=1;
	for(int i =0;i<4;i++){
		
		for(int j=0;j<su1;j++){
			System.out.print("  ");	
		
		}
			
		for(int l=0;l<su2;l++){

			System.out.print(" ★");
			
		}
		System.out.println();
		su1--;
		su2++;
	}//for end
	System.out.println();	
//Q8 
//       ★
//     ★ ★ ★
//   ★ ★ ★ ★ ★
// ★ ★ ★ ★ ★ ★ ★
//   ★ ★ ★ ★ ★
//     ★ ★ ★
//       ★
	
    
	//윗삼각형
   su1=6;
   su2=1;
   k=0;
   for(int i=0;i<4;i++){
      
      for(int j=0;j<su1;j++){
         System.out.print(" ");
         
      }//for end
      for(k=0;k<su2;k++){
         
         System.out.print('★');
         System.out.print(' ');
      
      
      }//for end
      su1-=2;
      su2+=2;
      System.out.println();
   }//for end
   //아래삼각형
   su1=2;
   su2=5;
   k=0;
   for(int i=0;i<3;i++){
      for(int j=0;j<su1;j++){
         System.out.print(' ');
         
      }      
      for(k=0;k<su2;k++){
         System.out.print('★');
	System.out.print(' ');
      }
      su1+=2;
      su2-=2;

      System.out.println();
   }



	
		
	}//main end



}//class end