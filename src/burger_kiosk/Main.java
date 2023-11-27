package burger_kiosk;

import static burger_kiosk.Food.*;
import static burger_kiosk.Menu.menuList;

public class Main {

    public static void setMenuList(){
        menuList.add(new Menu("1.","Burgers", "앵거스 비프 통살을 다져만든 버거"));
        menuList.add(new Menu("2.","Frozen Custard", "매장에서 신선하게 만드는 아이스크림"));
        menuList.add(new Menu("3.","Drinks", "매장에서 직접 만드는 음료"));
        menuList.add(new Menu("4.","Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주"));

    }

    public static void setBurgerList(){
        burgerList.add(new Food("1.", "ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9));
        burgerList.add(new Food("2.", "SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9));
        burgerList.add(new Food("3.", "ShroomBurger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4));
        burgerList.add(new Food("4.", "Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",  6.9));
        burgerList.add(new Food("5.", "Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거",  5.4));
    }


    public static void setFrozenList(){
        frozenList.add(new Food("1.", "LemonIceTea","레몬아이스티", 6.0));
        frozenList.add(new Food("2.", "PitchIceTea","복숭아아이스티", 6.0));
        frozenList.add(new Food("3.", "Coke","콜라", 3.0));
        frozenList.add(new Food("4.", "DoctorPepper","체리맛콜라", 3.0));
        frozenList.add(new Food("5.", "Cider","사이다", 3.0));
    }

    public static void setDrinkList(){
        drinkList.add(new Food("1.", "1866 Blonde","라거맥주", 8.0));
        drinkList.add(new Food("2.", "L7 Lager","라거맥주", 8.0));
        drinkList.add(new Food("3.", "Gordon Biersch Golden Export","라거맥주", 7.0));
        drinkList.add(new Food("4.", "Gordon Biersch Pale Ale","에일맥주", 7.0));
        drinkList.add(new Food("5.", "Domaine Dupage French Country Ale","에일맥주", 8.5));
    }

    public static void setBeerList(){
        beerList.add(new Food("1.", "ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9));
        beerList.add(new Food("2.", "SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9));
        beerList.add(new Food("3.", "ShroomBurger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4));
        beerList.add(new Food("4.", "Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",  6.9));
        beerList.add(new Food("5.", "Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거",  5.4));
    }


    public static void main(String[] args) {

        setMenuList();
        setBurgerList();
        setFrozenList();
        setDrinkList();
        setBeerList();

        Menu.displayMainMenu();

    }}

