import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double merge = 0;
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            System.out.println("Input data:");
            System.out.print("Input Product:");
            String name = sc.nextLine();
            System.out.print("Input Price:");
            double price =sc.nextDouble();
            vect[i] = new Product(name,price);
        }
        for (int i = 0;i < vect.length; i++){
            System.out.println(vect[i]);
            merge += vect[i].getPrice();
        }
        merge = merge/vect.length;
        System.out.printf("AVERAGE PRICE = %.2f",merge);

    }
}