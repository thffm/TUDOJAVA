package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrinho {
    private List<Product> products = new ArrayList<>();//nao pode receber uma lista

    private Date date;
    public Carrinho(){

    }

    public Carrinho(Date date) {
        this.date = date;
    }


    public void addItem(Product product){
        products.add(product);
    }
    public void show(){
        for (Product p : products){
            System.out.println(p);
        }
    }
    @Override
    public String toString(){
        return String.format(products.toString());
    }
}
