import entities.Cartorio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = sc.nextLine();
        System.out.print("Input your Cpf:");

        long cpf = sc.nextInt();
        sc.nextLine();
        System.out.print("Input your estado civil:");

        String estadoCivil = sc.nextLine();

        Cartorio user = new Cartorio(name,cpf,estadoCivil);
        System.out.println();
        System.out.print(user);
        char response = sc.nextLine().charAt(0);
        System.out.print("Voce casou (y/n) ?");

        if(response == 'y'){
            user.setEstadoCivil("Married");
        }

        System.out.println();
        System.out.println(user);



        sc.close();
    }
}