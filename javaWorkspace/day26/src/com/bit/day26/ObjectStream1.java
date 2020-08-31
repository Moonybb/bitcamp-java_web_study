package com.bit.day26;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStream1 {
	//객체가 가지고 있는 것은 실제로 필드밖에 없음.
	//객체의 직렬화를 위해서 Serializable 을 해주면 직렬화의 대상이 됨으로써 바이트 코드로 작성 가능.
	//객체의 메서드는 스택 영역에 호출을 했을시에 사용 가능 하기 때문에, 메서드를 가지고 있다고 할 수도 있고, 그렇지 않을 수도 있다.
	
	//스태틱 메서드에서 힙영역의 메서드 호출시 힙영역으로 가는게 아니라 스택영역에서 실행함.(이게 자연스러움)
	
	public static void main(String[] args) {
		File file = new File("data1.bin");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			
			com.bit.day26.Student stu = (com.bit.day26.Student) ois.readObject(); // 읽을때 한번밖에 쓰지 않았는데 2번읽으면 엑셉션발생.
			
			stu.show();//
			
			
			System.out.println("학번 :"+stu.num);
			System.out.println("이름 :"+stu.name);
			System.out.println("국어 :"+stu.kor);
			System.out.println("영어 :"+stu.eng);
			System.out.println(stu);
			
////			System.out.println("수학 :"+stu.math);
			

		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null)fis.close();
				if(ois!=null)ois.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
