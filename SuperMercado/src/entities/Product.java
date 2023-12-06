package entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity ;


    public Product(String name,Double price,int quantity){
        this.name =name;
        this.price=price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return String.format("Nome: %S\nValor: %.2f\nQuantidade: %d\n",name,price,quantity);
    }

}
