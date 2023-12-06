package programn;

import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data:");
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Price:");
        double price = sc.nextDouble();
        System.out.println("Quantity:");
        int quantity = sc.nextInt();
        Product product = new Product(name,price,quantity);

        System.out.println(" ");
        System.out.println("Product data"+product);

        System.out.println(" ");
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println(" ");
        System.out.println("Update data: "+product);

        System.out.println(" ");
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update date "+product);

        sc.close();

    }
}