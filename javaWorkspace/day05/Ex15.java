class Ex15{
	public static void main(String[] args){
	//1 조건文
	//1.1 if문
		int input;
		input=-1100;
		
		System.out.println("시작");
		if(input<0){
			System.out.println("음수 입니다");
			}// if end
		if(input>0){
			System.out.println("양수 입니다");
			}// if end
		if(input%2!=0){
			System.out.println("홀수 입니다");
			}// if end
		if(input%2==0){
			System.out.println("짝수 입니다");
			}// if end
		if(input<0 && input%2!=0){
			System.out.println("음수이고 홀수 입니다");
			}
		if(input<0 && input%2==0){
			System.out.println("음수이고 짝수 입니다");
			}
		if(input>0 && input%2!=0){
			System.out.println("양수이고 홀수 입니다");
			}
		if(input>0 && input%2==0){
			System.out.println("양수이고 짝수 입니다");
			}
			
		System.out.println("종료");
	
	
	
	
	}



}