package burger_kiosk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Food extends Menu{
    String name; //음식이름
    String details; //음식설명
    private double price; //음식가격

    public Food(String name, String detail, double price){
        super(name, detail);
        this.price=price;
    }

    static void put(){
        Map<String, String> m = new HashMap<>();
        m.put("1. cheeseburgers","| W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        m.put("2. chickenburgers","| W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        m.put("3. burgers","| W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        m.put("4. smokeburgers","| W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");

        Iterator<String> it = m.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println( key + "\t"  + m.get(key));
        }
    }
    static void put1(){
        Map<String, String> a = new HashMap<>();
        a.put("1. coke","앵거스 비프 통살을 다져만든 버거");
        a.put("2. lemoncoke","| W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        a.put("3. gingercoke","| W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        a.put("4. zerocoke","| W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");

        Iterator<String> its = a.keySet().iterator();
        while (its.hasNext()) {
            String key = its.next();
            System.out.println( key + "\t"+a.get(key));
        }

    }

}
