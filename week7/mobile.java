package week7;

public class mobile{
    String brand;
    double price;
    mobile(String brand, double price){
        this.brand=brand;
        this.price=price;
    }
    void isAffordable(double price){
        if(price<20000){
            System.out.println(this.brand+" is affordable");
        }else{
            System.out.println(this.brand+" is not below 20000");
        }
    }
}