import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!!");
        char response = 'n';
        List<Product>wait = new ArrayList<>();
        List<Product>products = new ArrayList<>();
        while (response != 's'){
            while (response != 'a'){
                System.out.println("I = INSERIR R = REMOVE A = ADD ");
                response = sc.nextLine().charAt(0);
                switch (response){
                    case  'i':
                        System.out.println("Input date:");
                        System.out.print("Name:");
                        String name = sc.nextLine();
                        System.out.print("Price:");
                        Double price = sc.nextDouble();
                        System.out.print("Quantity:");
                        int quantity = sc.nextInt();
                        sc.nextLine();

                        show(name,price,quantity);
                        wait.add(new Product(name,price,quantity));
                        break;
                    case 'r'  :
                        indexlist(wait);
                        System.out.println("IF YOU WANT TO EXIT [-1]");
                        int temp_del = sc.nextInt();
                        sc.nextLine();
                        if (temp_del == -1){
                            break;
                        }
                        wait.remove(temp_del);
                        break;

                    case 'a':
                        if(wait.size() >0) {
                            break;
                        }
                        else{
                            System.out.println("List is empty");
                            response = 's';
                        }

                }




            }


            for(Product produto:wait){
                String name = produto.getName();
                Double price = produto.getPrice();
                int quantity = produto.getQuantity();
                products.add(new Product(name,price,quantity));
            }


            while (response != 'n'){

            System.out.print("[N = SAIR M = MOSTAR LISTA T = TOTAL  r = Continuar]");
            response = sc.nextLine().charAt(0);
            if(response == 'r'){
                indexlist(products);
                int tempDel = sc.nextInt();
                sc.nextLine();
                removeList(products,tempDel);

            }
            else {
            switchs(response,products);

            }

            }





        }




        sc.close();

    }
    public static void show(String name,Double price,int quantity){
        System.out.println(String.format("Nome: %S\nValor: %.2f\nQuantidade: %d\n",name,price,quantity));

    }
    public static void switchs(char response,List<Product> products){
        switch (response){

            case 'm':
                for (Product produto: products){
                    System.out.println(produto);
                }
                break;
            case 't':
                double value = 0;
                for(Product produto: products){
                    value += produto.getPrice()* produto.getQuantity();
                }
                System.out.printf("Total = %.2f\n",value);
                break;
        }
    }
    public static void removeList(List<Product> products,int temDel){
        if (temDel != -1){
            products.remove(temDel);
        }

    }
    public static void indexlist(List<Product> products){
        int count = 0;
        for (Product produtos: products){
            System.out.printf("Item: %S Index[%d]\n",produtos.getName(),count);
            count ++;
        }
        System.out.println("IF YOU WANT TO EXIT [-1]");
    }
}