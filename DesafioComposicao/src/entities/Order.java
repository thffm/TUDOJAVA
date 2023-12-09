package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> list = new ArrayList<>();

    private Client client;


    public Order(){

    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }



    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public void addItem(OrderItem item){
        list.add(item);


    }
    public void removeItem(OrderItem item){
        list.remove(item);
    }

    public Double total(){
        double sum = 0;
        for(OrderItem produto : list){
            sum+= produto.getPrice()* produto.getQuantity();

        }
        return sum;

    }

    public String toString(){
        int x = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMARY");
        sb.append("Order moment: "+sdf.parse(String.valueOf(moment))+"\n");
        sb.append("Order status: "+status+"\n");
        sb.append("Client: "+client.getName()+" "+client.getBirthDate()+" - "+client.getEmail());
        for(OrderItem produto:list ){
            sb.append(produto.getProduct()+", $"+produto.getPrice()+"Qantity:" +x+", Subtotal:  $" +produto.subTotal());
        }
        sb.append("Total price: $"+total());
        return sb.toString();

    }
}
