package entities;


import java.util.List;

public class Carrinho {
    private Double totalPrice;
    public static Double Total(List<Produto> produtos){
        double price = 0;
        for (Produto item: produtos){
            price += item.getPrice();


        }
        return price;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
