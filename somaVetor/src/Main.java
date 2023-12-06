import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero voce vai digitar?");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma = 0 ;
        double media = 0;

        for(int i = 0 ; i< vect.length; i++){
            double temp;
            System.out.print("Digite um numero:");
            temp = sc.nextDouble();
            vect[i] = temp;
            soma += vect[i];

        }
        media = soma/vect.length;
        System.out.println();
        for (int i = 0 ; i< vect.length; i++){
            System.out.print(vect[i]+" ");
        }
        System.out.println();
        System.out.println(soma);
        System.out.println(media);



    }
}