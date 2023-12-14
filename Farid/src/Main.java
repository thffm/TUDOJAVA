import entities.Carrinho;
import entities.Person;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        List<Person> people = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n;i++){
            String name = sc.nextLine();
            double price = sc.nextInt();
            sc.nextLine();
            carrinho.addItem(new Product(name,price));


        }
        carrinho.show();




    }
}