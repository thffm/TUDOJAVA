import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero voce vai digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];


        if (n > 10){
            System.out.printf("O limite e 10 transformando %d em 10\n ",n);
            n = 10;
        }
        for (int i=0;i< vect.length;i++){

            System.out.print("Digite um numero: ");
            int temp = sc.nextInt();
            vect[i] = temp;



        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i=0;i<vect.length;i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }

        }

        sc.close();


    }
}