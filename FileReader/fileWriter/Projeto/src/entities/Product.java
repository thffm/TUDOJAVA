package entities;

public class Product {
    private String name;

    private double price;
    private Integer quantity;



    public Product(String name, double price, Integer quantity) {
        this.name = name;

        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public Double total(){
        return  getPrice()*getQuantity();
    }

    public String extractString(){
        return name+","+String.format("%.2f",total());
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: "+name+"\n");

        sb.append("Price:"+price+"\n");
        sb.append("Quantity: "+quantity+"\n");
        return sb.toString();
    }
}
