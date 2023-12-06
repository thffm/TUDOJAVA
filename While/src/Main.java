import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0 ;

        while (num != 0){
            sum += num;
            num = sc.nextInt();
            System.out.printf("Valor de num = %d\n",num);




        }
        System.out.println(sum);
        sc.close();



    }
}