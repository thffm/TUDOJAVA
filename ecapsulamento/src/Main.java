import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product("tv",900);
        System.out.println(product);
        System.out.println("Enter product data: ");
        String name = sc.nextLine();
        product.setName(name);
        System.out.println(product);
        double new_price = sc.nextDouble();
        product.setPrice(new_price);
        System.out.println(product);

    }
}