package com.bit.day12;

public class Ex14 {
   public static void main(String[] args) {
      // String class
      String msg1 = "Java";
      String msg2 = "Web";
      String msg3 = msg1.concat(msg2);
//      System.out.println(msg1+msg2==msg3); // false
      
      
      /* substring() - 인자가 하나일때는 그 번호부터 끝까지 뽑아냄
                     - 인자가 두개일때는 첫인자 부터 두번째인자 전 까지 뽑아냄 */
      
      System.out.println(msg3); // JavaWeb
//      String msg4 = msg3.substring(4); // msg3의 인덱스번호 4번부터 뽑아냄 -> Web
      
      String msg4 = "JavaWebSpring";
      
      String msg5 = msg4.substring(4); // WebSpring
      String msg6 = msg4.substring(4,7); // Web
      String msg7 = msg4.substring(0,4); // Java
      String msg8 = msg4.substring(4,msg4.length());
      
      // replace는 앞의 인자를 삭제하고 그 자리에 뒤에 인자값을 넣어준다.
      String msg9 = msg4.replace("Web", "DB");
      String msg10 = msg4.replace("Web", "");
      String msg11 = msg4.replace('W', 'w');
      
      char ch = msg4.charAt(0); // 인덱스에 해당하는 문자
      int idx = msg4.indexOf('J'); // 문자에 해당하는 인덱스
      idx = msg4.indexOf("Web"); // 문자열을 넣게되면 시작위치 기준으로 저장한다. // 4
      idx = msg4.indexOf("a" , 2);
      System.out.println(idx);
      
      String msg13=msg4.substring(0,msg4.indexOf("Web")); //0~4까지 뽑는다.
      String msg14 = msg4.substring(msg4.indexOf("Web")+"Web".length()); // 4+3 까지 뽑는다. 
      
      System.out.println(msg13 + "DB" + msg14);
      
   }
}