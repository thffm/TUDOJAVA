import entities.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number:");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n) ?");
        char response = sc.nextLine().charAt(0);
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            banco = new Banco(number,holder,initialDeposit);

        }
        else {
            banco = new Banco(number,holder);
        }

        System.out.println();
        System.out.println(banco);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        banco.deposit(depositValue);
        System.out.println("Update account data:");
        System.out.println(banco);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawBalance = sc.nextDouble();
        banco.withdraw(withdrawBalance);
        System.out.println("Update account data:");
        System.out.print(banco);



        sc.close();
    }
}