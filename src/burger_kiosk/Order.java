package burger_kiosk;



import java.util.Scanner;

import static burger_kiosk.Food.burgerList;

public class Order{
 public int orderNumber;


 static Scanner sc = new Scanner(System.in);
static int number = sc.nextInt();
 public Order(){
 }

 public static void showOrder(){
  System.out.println("\n[ ORDER MENU ]");
  System.out.println("00.주문하기" + "\t" + "01.주문취소"+ "\t" + "02.뒤로가기");

  System.out.println("\n선택하신 번호"+":"+"\n");
 }

public static void addOrder(){

 System.out.println("주문하실 상품의 번호를 입력해주세요.\n");

 if(number==1||number==2||number==3||number==4||number==5){
  System.out.println("\n상품이 장바구니에 담겼습니다.\n");

  showTotalOrder(number);
  showTotalPrice(number);

 }else{
  System.out.println("올바른 번호를 입력해주세요");
 }
}

public static void deleteOrder(){

 if(number==1||number==2||number==3||number==4||number==5){
  System.out.println("\n주문상품이 취소되었습니다.\n");
 }else{
  System.out.println("올바른 번호를 입력해주세요");
 }
}

public static void showTotalOrder(int number){
 System.out.println("\n주문하신 상품 리스트입니다.");
 System.out.println(burgerList.get(number+1).name);

}

public static void showTotalPrice(int number){
 System.out.println("\n주문하신 상품의 총 금액은 "+burgerList.get(number+1).price+"입니다.");

 /*for(Food food : burgerList){
  System.out.println(food.number +food.name +"|" +food.details+"\t"+"W"+food.price);
 }*/
}


}














