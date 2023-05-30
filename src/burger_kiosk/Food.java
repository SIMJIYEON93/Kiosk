package burger_kiosk;

public class Food extends Menu{
    String name; //음식이름
    String details; //음식설명
    private double price; //음식가격

    public Food(String name, String detail, double price){
        super(name, detail);
        this.price=price;
    }


}
