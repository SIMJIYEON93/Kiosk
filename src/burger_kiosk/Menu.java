package burger_kiosk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Menu {

    private String name; //메인메뉴
    private String details; //메인메뉴 설명

    public Menu() {

    }

    static void put(){
        Map<String, String> m = new HashMap<>();
        m.put("1. burgers","앵거스 비프 통살을 다져만든 버거");
        m.put("2. drinks","매장에서 신선하게 만드는 음료수");
        m.put("3. desserts","매장에서 맛있게 만드는 디저트");
        m.put("4. beer","뉴욕 브루클린 브루어리에서 양조한 맥주");

        Iterator<String> it = m.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
         //   int i;
          //  for (i = 1; i < 5; i++) {
           //     int sum = 0;
            //    sum += i;

            // System.out.println(sum+"."+"\t" + key +"\t" + "|"+"\t"  + m.get(key));
            System.out.println( key +"\t" + "|"+"\t"  + m.get(key));
        }
        }
    //}

    public Menu(String name, String details){
        this.name=name;
        this.details=details;
    }
    void see(){
        System.out.println("");
    }

}

