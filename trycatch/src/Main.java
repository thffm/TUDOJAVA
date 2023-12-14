import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();



        System.out.print("\nFim");
    }
    public static void method1(){
        System.out.println("Inicio do 1");
        method2();
        System.out.println("Inicio do 2");
    }
    public static void method2(){
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");

            int position = sc.nextInt();

            System.out.print(vect[position]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Invalid");
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.print(e);
        }
        System.out.print("\nCabo");



        sc.close();


    }
}