package entities;

public class Product {
    private   String name;
    private   double price;
    public  int quantity;

    public Product(){

    }
    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void  setName(String name){
        this.name = name;
    }
    public double getPrice(double price){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String toString(){
        return String.format("%s",name)+", $"+String.format("%.2f",price);//S joga para upper
    }
}
