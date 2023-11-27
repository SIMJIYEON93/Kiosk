package burger_kiosk;

import java.util.*;

public  class Menu {
    public String number;
    private String name;// 메인메뉴
    private String details; //메인메뉴 설명

    public static List<Menu> menuList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


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

    public Menu(String number, String name, String details) {
        this.number=number;
        this.name = name;
        this.details = details;
    }



    public static void displayMainMenu() {


        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n");
        System.out.println("[ SHAKESHACK MENU ]\n");


       for(Menu menu : menuList){
            System.out.println(menu.number +menu.name +"|" +menu.details);
        }

        System.out.println("\n선택하신 번호"+":"+"\n");

        String choice = sc.nextLine();


        switch (choice){
            case "1":
                System.out.println("\n햄버거 메뉴로 이동합니다.\n");
                Food.displayBurger();
                 break;

            case "2":
                System.out.println("\n아이스크림 메뉴로 이동합니다.\n");
                Food.displayFrozen();
                break;

            case "3":
                System.out.println("\n음료 메뉴로 이동합니다.\n");
                Food.displayDrinks();
                break;

            case "4":
                System.out.println("\n맥주 메뉴로 이동합니다.\n");
                Food.displayBeer();
                break;
            case "00":
                System.out.println("\n맥주 메뉴로 이동합니다.\n");
                Order.addOrder();
                break;
            case "01":
                System.out.println("\n맥주 메뉴로 이동합니다.\n");
                Order.deleteOrder();
                break;
            default:
                System.out.println(("\n올바른 번호를 입력해주세요\n"));
                displayMainMenu();
                break;
        }

    }
}




