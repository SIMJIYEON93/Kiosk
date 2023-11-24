package burger_kiosk;

import java.util.*;

public class Food extends Menu {
    private String price; //음식가격

    public Food(){
    }
    public Food(String name, String details, String price){
        super(name, details);
        this.price=price;
    }
    public String getJsonFormat() {
        return getName() +"|"+ getDetails() +price;}

//    public void put(){
//        List<Food> fe = new ArrayList<>();
//        fe.add(new Food("ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거","W 6.9"));
//        fe.add(new Food("SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거","W 8.9"));
//        fe.add(new Food("Shroom Burger","몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거","W 9.4"));
//        fe.add(new Food("Cheeseburger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거","W 6.9"));
//        fe.add(new Food("Hamburger","비프패티를 기반으로 야채가 들어간 기본버거","W 5.4"));
//
//        List<Food> fed = new ArrayList<>();
//        fed.add(new Food("Custard IceCream","커스터드 맛 아이스크림","W 6.9"));
//        fed.add(new Food("Chocolate IceCream","초콜릿 맛 아이스크림","W 8.9"));
//        fed.add(new Food("Lemon IceCream","레몬 맛 아이스크림","W 9.4"));
//        fed.add(new Food("Vanllia IceCream","바닐라 맛 아이스크림","W 6.9"));
//        fed.add(new Food("Strawberry IceCream","딸기 맛 아이스크림","W 5.4"));
//    }
    public void display(){
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거","W 6.9"));
        foodList.add(new Food("SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거","W 8.9"));
        foodList.add(new Food("Shroom Burger","몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거","W 9.4"));
        foodList.add(new Food("Cheeseburger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거","W 6.9"));
        foodList.add(new Food("Hamburger","비프패티를 기반으로 야채가 들어간 기본버거","W 5.4"));

        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println("");
        System.out.println("[ Burgers MENU ]");
        System.out.println("");
        int idx=0;
        while(idx < foodList.size()) {
            System.out.println(foodList.get(idx).getJsonFormat());
            idx ++;}
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("1.주문"+"\t"+"2.취소");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if("Burgers".equals(a)){
            System.out.println("b");}
        else if("Forzen Custard".equals(a)){
            System.out.println("custard");}
        else if("Drinks".equals(a)){
            System.out.println("drinks");}
        else if("Beer".equals(a)){
            System.out.println("beer");}
        /*
        1. 클래스간에 불필요한 의존성이 너무 놓아-> stackoverflow
        2. 변수명이 다른사람이 보기에 불편해, 카멜케이스 등
        3. 불필요한 코드들이 있어 ex)44번째줄
        4. 사용자 편의성을 위한 코드 수정 ex) menu클래스의 78번째줄
        5. 관리자, 유즈케이스, 잘못된 자료형, 접근제어자 수정 및 추가
        6. 프로젝트가 완결성을 가지지 못해 객체지향적 의미를 더 자세히 공부하고자 리팩토링 

        * */
    }

}
