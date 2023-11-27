package burger_kiosk;

import java.util.*;

public class Food  {

    public String number;
    public String name; //메인메뉴
    public String details; // 메인메뉴
    public double price; // 음식가격

    public static List<Food> burgerList = new ArrayList<>();
    public static List<Food> frozenList = new ArrayList<>();
    public static List<Food> drinkList = new ArrayList<>();
    public static List<Food> beerList = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
    static String choice = sc.nextLine();

    public Food(String number, String name, String details, double price) {
        this.number = number;
        this.name = name;
        this.details = details;
        this.price = price;
    }


    public static void displayBurger() {



        System.out.println("\n[ Burgers MENU ]\n");

        for(Food food : burgerList){
            System.out.println(food.number +food.name +"|" +food.details+"\t"+"W"+food.price);
        }

/*        for(int i=0; i<burgerList.size();i++){
            System.out.println(burgerList.get(i).number);
        }*/

        Order.showOrder();

            switch (choice){
                case "00":
                    Order.addOrder();
                    displayBurger();
                    break;

                case "01":
                    Order.deleteOrder();
                    displayBurger();
                    break;

                case "02":
                    Menu.displayMainMenu();
                    break;

                default:
                    System.out.println(("\n올바른 번호를 입력해주세요\n"));
                    displayBurger();
                    break;
            }

    }

    public static void displayFrozen() {

        System.out.println("\n[ Frozen MENU ]\n");

        for(Food food : frozenList){
            System.out.println(food.number +food.name +"|" +food.details+"\t"+"W"+food.price);
        }

        Order.showOrder();

        switch (choice){
            case "00":
                Order.addOrder();
                displayBurger();
                break;

            case "01":
                Order.deleteOrder();
                displayFrozen();
                break;

            case "02":
                Menu.displayMainMenu();
                break;

            default:
                System.out.println(("\n올바른 번호를 입력해주세요\n"));
                displayFrozen();
                break;
        }
    }

    public static void displayDrinks() {

        System.out.println("\n[ Drinks MENU ]\n");

        for(Food food : drinkList){
            System.out.println(food.number +food.name +"|" +food.details+"\t"+"W"+food.price);
        }

        Order.showOrder();

        switch (choice){
            case "00":
                Order.addOrder();
                displayDrinks();
                break;

            case "01":
                Order.deleteOrder();
                displayDrinks();
                break;

            case "02":
                Menu.displayMainMenu();
                break;

            default:
                System.out.println(("\n올바른 번호를 입력해주세요\n"));
                displayDrinks();
                break;
        }
    }

    public static void displayBeer() {

        System.out.println("\n[ Beer MENU ]\n");

        for(Food food : beerList){
            System.out.println(food.number +food.name +"|" +food.details+"\t"+"W"+food.price);
        }

        Order.showOrder();

        switch (choice){

            case "00":
                Order.addOrder();
                displayBeer();
                break;

            case "01":
                Order.deleteOrder();
                displayBeer();
                break;

            case "02":
                Menu.displayMainMenu();
                break;

            default:
                System.out.println(("\n올바른 번호를 입력해주세요\n"));
                displayBeer();
                break;
        }
    }


        /*
        1. 클래스간에 불필요한 의존성이 너무 놓아-> stackoverflow
        2. 변수명이 다른사람이 보기에 불편해, 카멜케이스 등
        3. 불필요한 코드들이 있어 ex)44번째줄
        4. 사용자 편의성을 위한 코드 수정 ex) menu클래스의 78번째줄
        5. 관리자, 유즈케이스, 잘못된 자료형, 접근제어자 수정 및 추가
        6. 프로젝트가 완결성을 가지지 못해 객체지향적 의미를 더 자세히 공부하고자 리팩토링
        7. 빌더패턴, enum 클래스 활용해보기
        8. 재사용되는 메서드는 따로 빼서 호출하기
        9. 생성자로 다른 클래스 주입하면 순환참조 오류나
        10. 필드로 주입하면 null오류나
        11. 코드를 줄이기 위해서 static을 많이 쓰는 것이 과연 좋은 것인가
        * */
    }


