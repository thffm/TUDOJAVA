import model.entities.Account;
import model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*method1();



        System.out.print("\nFim");
    }
    public static void method1(){
        System.out.println("Inicio do 1");
        method2();
        System.out.println("Inicio do 2");
    }
    public static void method2(){
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");

            int position = sc.nextInt();

            System.out.print(vect[position]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Invalid");
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.print(e);
        }
        System.out.print("\nCabo");



        sc.close();
        */


        //it's clean
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            System.out.println("");
            Account account = new Account(number,holder,initialBalance,withdrawLimit);


            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());

        }
        catch (InputMismatchException e){
            System.out.print("Input error!!");
        }
        catch (DomainException e){
            System.out.println(e.getMessage());

        }



        sc.close();



    }
}