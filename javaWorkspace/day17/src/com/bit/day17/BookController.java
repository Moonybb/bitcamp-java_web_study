package com.bit.day17;

import java.util.ArrayList;
import java.util.List;

public class BookController {
   private List<BookVO> inventoryList;
   private List<BookVO> rentList;
   
   public BookController(List<BookVO> inventoryList, List<BookVO> rentList){
      this.inventoryList = inventoryList;
      this.rentList = rentList;
   }
   
   // 리스트에서 해당하는 bookVO 객체와 같은 id를 가진 요소를 리턴하는 메서드
   public BookVO retrieveBookVO(List<BookVO> list, BookVO b){
      int index = list.indexOf(b);
      return list.get(index);
   }
   
   // 뷰어가  대여되는 책을 보내주면 인벤토리에서 렌트로 이동시키는 메서드
   public void rentBookVO(BookVO b){
      rentList.add(retrieveBookVO(inventoryList, b));
      inventoryList.remove(b);
   }
   
   // 뷰어가 반납되는 책을 보내주면 렌트에서 인벤토리로 이동시키는 메서드
   public void returnBookVO(BookVO b){
      inventoryList.add(retrieveBookVO(rentList, b));
      rentList.remove(b);
   }
   
   // 해당 bookVO 객체가 대여가능한지 검증(validate) 하는 메서드
   public boolean validateRentBookVO(BookVO b){
      return inventoryList.contains(b);
   }
   
   // 해당 bookVO 객체가 반납가능한지 검증하는 메서드
   public boolean validateReturnBookVO(BookVO b){
      return rentList.contains(b);
   }
   
   // rentList와 inventoryList를 하나로 합쳐서 리턴하는 메서드
   public List<BookVO> selectAll(){
      List<BookVO> list = new ArrayList<BookVO>();
      list.addAll(inventoryList);
      list.addAll(rentList);
      
      return list;
   }
   
   public List<BookVO> selectinventory(){
      return inventoryList;   
   }
   
   public List<BookVO> selectRent(){
      return rentList;
   }
   //반납 가능한 책이 있는지 확인한다.
   public boolean isRentEmpty(){
	   return rentList.size() == 0;
	   
   }
   
   //대여 가능한 책이 있는지 확인한다.
   public boolean isInventoryEmpty(){
	   return inventoryList.size() == 0;
	   
   }
}