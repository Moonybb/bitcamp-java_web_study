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
		
		System.out.println("1~50������ ���ڸ� �Է����ּ���. >>");
		while(true){
			input = sc.nextInt();
			if(input>0&&input<=50){
				// down
				if(cnt<input){
					tempDown = input;
					if(tempDown>=end){
						System.out.print("�������� ���ڸ� �ٽ� �Է��� �ּ��� >> ");
						continue;
					}
					System.out.println("�Է��� ���� "+input+"�Դϴ�.\nDown");
					end = tempDown;
					System.out.println(start+"~"+end+"������ ���ڸ� �Է��� �ּ���  >>");
					
				}else if(cnt>input){
					tempUp = input;
					if(tempUp<=start){
						System.out.print("�������� ���ڸ� �ٽ� �Է��� �ּ��� >> ");
						continue;
					}
					System.out.println("�Է��� ���� "+input+"�Դϴ�.\nUP");
					start = tempUp;
					System.out.print(start+"~"+end+"������ ���ڸ� �Է��� �ּ���  >>");
					
				}else if(cnt==input){
					System.out.println("���ϵ帳�ϴ�. �����Դϴ�.");
					break;
				}
				 
			}else{
				System.out.print("�������� ���ڸ� �ٽ� �Է��� �ּ��� >> ");
			}
			
		}
		
	}
}
