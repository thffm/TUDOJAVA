import entities.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro fusca = new Carro();
        System.out.println("Enter data: ");
        fusca.Name = sc.nextLine();
        fusca.Engine = sc.nextLine();
        fusca.offON();
        fusca.offON();
        fusca.setPrice(sc.nextDouble());
        System.out.println(fusca.getPrice());
        Carro gol = new Carro("Golf",1992,"v8");
        gol.offON();

        sc.close();
    }
}