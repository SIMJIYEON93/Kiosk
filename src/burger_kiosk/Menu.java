package burger_kiosk;

import java.sql.Array;
import java.util.*;

public class Menu {

    private String name; //메인메뉴
    private String details; //메인메뉴 설명

    public Menu() {
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDetails(){
        return details;
    }
    public void setDetails(String details){
        this.details=details;
    }
    public Menu(String name, String details){
        this.name=name;
        this.details=details;
    }

       public void put(){
           List<Menu> me = new ArrayList<>();
           me.add(new Menu("Burgers","앵거스 비프 통살을 다져만든 버거"));
           me.add(new Menu("Forzen Custard","매장에서 신선하게 만드는 아이스크림"));
           me.add(new Menu("Drinks","매장에서 직접 만드는 음료"));
           me.add(new Menu("Beer","뉴욕 브루클린 브루어리에서 양조한 맥주"));

       }
    public void display(){

        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n");
        System.out.println("아래 상품메뉴 판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ SHAKESHACK MENU ]");

        System.out.println(name+"\t"+"|"+"\t"+details);
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("1.확인"+"\t"+"2.취소");
    }


   public  void next(){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if("Burgers".equals(a)){
        System.out.println();}
    else if("Forzen Custard".equals(a)){
        System.out.println();}
        else if("Drinks".equals(a)){
            System.out.println();}
        else if("Beer".equals(a)){
            System.out.println();}
    }
}




