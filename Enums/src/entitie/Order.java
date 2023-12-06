package entitie;

import enttines.enums.Order_Sh;

import java.util.Date;

public class Order {
    private  Integer id;
    private Date moment;
    private Order_Sh status;

    public Order() {

    }

    public Order(Integer id, Date moment, Order_Sh status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
