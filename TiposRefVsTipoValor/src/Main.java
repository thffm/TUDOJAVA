import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double meegear = 0;
        int n = sc.nextInt();
        double[] vect = new double[n];
        for(int i = 0; i<n;i++){
            vect[i]= sc.nextDouble();
        }
        for (int i = 0;i<n;i++){
            meegear += vect[i];
        }
        meegear = meegear/n;
        System.out.print(String.format("%.2f ",meegear));
        sc.close();

    }
}