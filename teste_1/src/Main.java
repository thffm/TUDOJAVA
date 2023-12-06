import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x ;
        int y ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number:");
        x = sc.nextInt();
        System.out.println("Input the second number");
        y = sc.nextInt();
        System.out.println(x+y);
        sc.close();
        if (x > y){
            System.out.println("Prod---");
            System.out.printf("%d esse e seu numero ",x);
        }

    }
}