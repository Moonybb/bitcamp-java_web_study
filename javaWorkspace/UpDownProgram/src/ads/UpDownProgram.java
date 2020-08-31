package ads;

import java.util.Random;
import java.util.Scanner;

public class UpDownProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int cnt = 0;
		int start = 1;
		int end = 50;
		int tempUp = 0;
		int tempDown = 0;
		cnt = (int)(Math.random()*50+1);
		
		System.out.println("1~50사이의 숫자를 입력해주세요. >>");
		while(true){
			input = sc.nextInt();
			if(input>0&&input<=50){
				// down
				if(cnt<input){
					tempDown = input;
					if(tempDown>=end){
						System.out.print("범위내의 숫자를 다시 입력해 주세요 >> ");
						continue;
					}
					System.out.println("입력한 값은 "+input+"입니다.\nDown");
					end = tempDown;
					System.out.println(start+"~"+end+"사이의 숫자를 입력해 주세요  >>");
					
				}else if(cnt>input){
					tempUp = input;
					if(tempUp<=start){
						System.out.print("범위내의 숫자를 다시 입력해 주세요 >> ");
						continue;
					}
					System.out.println("입력한 값은 "+input+"입니다.\nUP");
					start = tempUp;
					System.out.print(start+"~"+end+"사이의 숫자를 입력해 주세요  >>");
					
				}else if(cnt==input){
					System.out.println("축하드립니다. 정답입니다.");
					break;
				}
				 
			}else{
				System.out.print("범위내의 숫자를 다시 입력해 주세요 >> ");
			}
			
		}
		
	}
}
