import entities.Dolar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dolar price? ");
        double dolar_price = sc.nextDouble();
        System.out.println("How many dollar will be bought?");
        double dolar_money = sc.nextDouble();
        double reais = Dolar.dolarToReal(dolar_price,dolar_money);
        System.out.println("Amount to be paid in reais = "+String.format("%.2f",Dolar.dolarIof(reais)) );
        sc.close();
    }
}