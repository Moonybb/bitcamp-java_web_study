class Ex19{
	public static void main(String[] args){
		//변수(선언&초기화)
		//자료형 변수명;
		//변수명=초기값;
		int a=1234;
		System.out.println("a="+a);
		//자료형
		//숫자 (10진수 정수)
		byte su1;
		su1=1;
		short su2;
		su2=127;
		int su3;
		su3=2147483647;
		long su4;
		su4=2147483648L;
		
		
		System.out.println("su1="+su1);
		System.out.println("su2="+su2);
		System.out.println("su3="+su3);
		System.out.println("su4="+su4);
				
		// 숫자(실수)
		float su11=3.141235F;
		double su12=3.141235;

		
		
		System.out.println("su11="+su11);	
		System.out.println("su12="+su12);	
		
		//문자형(char)
		char ch1;
		ch1='가';
		System.out.println("ch1="+(int)ch1);
		System.out.println("65="+(char)65);
		System.out.println("66="+(char)66);
		System.out.println("67="+(char)44032);
		
		String msg="문자열";
		System.out.println(msg);
		
		//제어문-조건문-if문
		//if(조건){실행문;}
		//조건이 true이라면 실행문 실행
		int su21;
		int su22=2;
		if(su22%2==0){
			su21=1234;
		}else{
			su21=4213;
		}
		System.out.println("su21="+su21);

		int su=1;
		if(su==0){
			System.out.println("0입니다");
		}else if(su<2){
			System.out.println("1입니다");
		}else if(su<3){
			System.out.println("2입니다");
		}
	
	}



}