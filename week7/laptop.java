package week7;

public class laptop{
    String brand;
    int RAM;
    double price;
    laptop(String brand,int ram,double price){
        this.brand=brand;
        this.RAM=ram;
        this.price=price;
    }
    void dispaly(){
        System.out.println("Brand= "+this.brand+" Ram="+this.RAM+" price="+price);
    }
}