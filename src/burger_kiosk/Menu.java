package burger_kiosk;

import javax.swing.event.SwingPropertyChangeSupport;
import java.util.*;

public  class Menu {

    private String name; //메인메뉴
    private String details; //메인메뉴 설명

    public Menu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Menu(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public String getJsonFormat() {
        return name + "|" + details;
    }

    //       public void put(){
//           List<Menu> me = new ArrayList<>();
//           me.add(new Menu("Burgers","앵거스 비프 통살을 다져만든 버거"));
//           me.add(new Menu("Forzen Custard","매장에서 신선하게 만드는 아이스크림"));
//           me.add(new Menu("Drinks","매장에서 직접 만드는 음료"));
//           me.add(new Menu("Beer","뉴욕 브루클린 브루어리에서 양조한 맥주"));
//
    Food foodList = new Food();//       }
    public void display() {

        List<Menu> menuList = new ArrayList<>();

        menuList.add(new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거"));
        menuList.add(new Menu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림"));
        menuList.add(new Menu("Drinks", "매장에서 직접 만드는 음료"));
        menuList.add(new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주"));

        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n");
        System.out.println("아래 상품메뉴 판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println();

        int idx = 0;

        while (idx < menuList.size()) {
            System.out.println(menuList.get(idx).getJsonFormat());
            idx++;
        }

        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("1.확인" + "\t" + "2.취소");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();


//        String input = "";
//        switch (input) {
//            case "burgers":
//                System.out.println("햄버거 메뉴로 이동합니다.");
//                fe.display();
//                break;
      //  }

    }
}




