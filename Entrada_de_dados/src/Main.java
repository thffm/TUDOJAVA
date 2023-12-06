import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT YOUR NAME:");
        String x;
        int y ;
        char z;
        x = sc.next();
        System.out.println("Input your age:");
        y = sc.nextInt();
        System.out.printf("Ola %s voce tem %d anos",x,y);
        
        sc.close();

    }
}