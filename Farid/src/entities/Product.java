package entities;

import java.util.Date;

public class Product {
    private Date date;
    private String name;
    private Double price;

    public Product(){

    }
    public Product(String name,Double price){
        this.name = name;
        this.price = price;
    }

    public Product(Date date, String name, Double price) {
        this.date = date;
        this.name = name;
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("%S %.2f $",name,price);
    }
}


