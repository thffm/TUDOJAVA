package entities;

public class Produto {
    private String name;
    private Double price;
    private Integer quantity;

    public Produto(String name, Double price, Integer quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public Double getPrice(){
        return  price;
    }
    public String getName(){
        return name;
    }

}
