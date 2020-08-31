class Ex32{
	public static void main(String[] args){
		int dan=2;
		int su=1;
		while(dan<10){
			
			su=2;
			while(su<10){
				System.out.print(dan+"x"+su+"="+(dan*su)+'\t');
				su++;
			}
                System.out.println();                                             
		dan++;
		}




	}
}