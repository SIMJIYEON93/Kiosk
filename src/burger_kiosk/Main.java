package burger_kiosk;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

    Menu a = new Menu();
        Menu.put();

        System.out.println("원하시는 카테고리를 선택해 주세요.");


        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();

        switch (choice){
        case 1: Food.put();
            break;
        case 2: Food.put1();
            break;
                  }

    }


    }

