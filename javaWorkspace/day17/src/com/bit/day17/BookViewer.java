package com.bit.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookViewer {
   private BookController bookController;
   private Scanner scanner;
   public BookViewer(){
      scanner = new Scanner(System.in);
      ArrayList<BookVO> inventory = new ArrayList<>();
      BookVO b = new BookVO();
      b.setId(1);
      b.setTitle("JAVA의 정석");
      b.setName("남궁성");
      b.setPrice(5000);
      inventory.add(b);
      
      b = new BookVO();
      b.setId(2);
      b.setTitle("슬램덩크");
      b.setName("만화작가");
      b.setPrice(500);
      inventory.add(b);
      
      b = new BookVO();
      b.setId(3);
      b.setTitle("명탐정 코난");
      b.setName("만화작가2");
      b.setPrice(300);
      inventory.add(b);

      b = new BookVO();
      b.setId(4);
      b.setTitle("소년탐정 김전일");
      b.setName("만화작가3");
      b.setPrice(400);
      inventory.add(b);
      
      ArrayList<BookVO> rent = new ArrayList<>();
      bookController = new BookController(inventory, rent);
      showMenu();
   }
   
   private void showMenu(){
      while(true){
         System.out.println("=======================================================");
         System.out.println("비트 도서대여점");
         System.out.println("=======================================================");
         System.out.println("1.대여 2.반납 3.출력 4.종료");
         System.out.print("> ");
         int choice = scanner.nextInt();
         scanner.nextLine();
         
         if(choice == 1) {
            // 대여하는 메서드 호출
            rentBook();
         }else if(choice == 2){
            // 반납하는 메서드 호출
            returnBook();
         }else if(choice == 3){
            // 출력하는 메서드 호출
        	 printList();
         }else if(choice == 4){
            System.out.println("사용해주셔서 감사합니다.");
            break;
         }else{
            System.out.println("잘못 입력하셨습니다.");
         }
      }
   }
   
   private void printList(){
	   //출력시에는
	   //대여 가능, 반납 가능, 모든 목록 3가지 목록을 출력해야 한다.
	   System.out.println("출력할 목록을 선택해주세요.");
	   System.out.println("1. 대여가능 2. 반납가능 3. 모든 도서");
	   System.out.print("> ");
	   int choice = scanner.nextInt();
	   List<BookVO> selectedList = null;
	   if(choice == 1){
		   selectedList = bookController.selectinventory();
	   }else if(choice == 2){
		   selectedList = bookController.selectRent();
	   }else if(choice == 3){
		   selectedList = bookController.selectAll();
	   }else{
		   System.out.println("잘못 입력하셨습니다.");
	   }
	   if(selectedList != null){
		   System.out.println("=======================================================");
		   for(BookVO b : selectedList){
			   System.out.println(b);
		   }
		   System.out.println("=======================================================");
	   }
   }
   
   private void returnBook(){
	   
	   //반납이 가능한 목록이 있는지 체크한다.
	   if(bookController.isRentEmpty()){
		   System.out.println("반납 가능한 도서가 없습니다!!");
	   }else{
		   System.out.println("======반납 가능 목록======");
		   for(BookVO b : bookController.selectRent()){
			   System.out.println(b);
		   }
		   System.out.println("=======================================================");
		   System.out.println("반납할 책의 번호를 적어주세요: ");
		   System.out.print("> ");
		   int id = scanner.nextInt();
		   BookVO b = new BookVO();
		   b.setId(id);
		   while(!bookController.validateReturnBookVO(b)){
			   System.out.println("잘못 선택하셨습니다.");
			   System.out.println("반납할 책의 번호를 적어주세요");
			   System.out.print("> ");
			   id = scanner.nextInt();
			   b.setId(id);
		   }
		   bookController.returnBookVO(b);
	   }
   
   }
   private void rentBook(){
      // 대여 가능한 리스트를 출력한다.
	   if(bookController.isInventoryEmpty()){
		   System.out.println("대여 가능한 도서가 없습니다!!");
	   }else{
		   System.out.println("======대여 가능 목록======");
		   for(BookVO b : bookController.selectinventory()){
			   System.out.println(b);
		   }
		   System.out.println("=======================================================");
		   // 사용자로부터 대여하고자 하는 책의 id를 입력받는다.
		   System.out.println("대여할 책의 식별번호를 입력해주세요.");
		   System.out.print("> ");
		   int id = scanner.nextInt();
		   BookVO b =new BookVO();
		   b.setId(id);
		   while(!bookController.validateRentBookVO(b)){
			   System.out.println("잘못 선택하셨습니다.");
			   System.out.println("대여할 책의 식별번호를 입력해주세요.");
			   System.out.print("> ");
			   id = scanner.nextInt();
			   b.setId(id);
		   }
		   bookController.rentBookVO(b);
		   
		   
	   }
   }
}
 
