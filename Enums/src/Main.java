import entitie.Order;
import enttines.enums.Order_Sh;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1080,new Date(), Order_Sh.PENDING_PAYMENT);
        System.out.println(order);

        Order_Sh os1 = Order_Sh.PENDING_PAYMENT;
        Order_Sh os2 = Order_Sh.valueOf("SHIPPED");

        System.out.println(os1);
        System.out.println(os2);

    }
}