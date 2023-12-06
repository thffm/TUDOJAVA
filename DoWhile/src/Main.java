import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        double c ;
        double formula;
        do{
            System.out.println("Digite a temperatura em Celsius:");
            c = sc.nextDouble();
            formula = (c*1.8)+32;
            System.out.printf("Equivalente em FAHRENHEIT: %.2f\n",formula);
            System.out.println("Deseja continuar? [Sim/Nao]");
            resp = sc.next().charAt(0);//pega o primeiro index
        }while (resp != 'n');
        sc.close();
    }

}