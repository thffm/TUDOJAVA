import entities.Carrinho;
import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        char response = 'n';
        while (response == 'n'){
            System.out.println("Welcome to the shopping");
            String name = sc.nextLine();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            produtos.add(new Produto(name,price,quantity));
            System.out.println("Exit: (y/n) ");
            sc.nextLine();
            response = sc.nextLine().charAt(0);

        }
        System.out.println(Carrinho.Total(produtos));



        sc.close();
    }
}