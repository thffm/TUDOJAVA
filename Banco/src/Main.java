import entities.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco thiago;
        double deposit;

        System.out.println("Enter account number:");
        int number_account = sc.nextInt();
        System.out.print("Enter account holder:\n ");
        String name = sc.next();
        System.out.println("Is there na initial deposit (y/n)?");
        char choiche = sc.next().charAt(0);
        if(choiche == 'y'){
            System.out.println("Enter initial deposit value: ");
            deposit = sc.nextDouble();

            thiago = new Banco(number_account,name,deposit);
            thiago.withdraw = deposit;

        }
        else {
            thiago = new Banco(number_account,name);
        }

        System.out.println(thiago);
        System.out.println("Enter a deposit value:");
        deposit = sc.nextDouble();
        thiago.setAdd(deposit);

        System.out.println("");
        System.out.println("Enter a withdraw value: ");
        deposit = sc.nextDouble();
        thiago.setretirar(deposit);
        System.out.println(thiago);
        sc.close();
    }
}