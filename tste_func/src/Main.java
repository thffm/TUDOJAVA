import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String setense;
        setense = sc.nextLine();//next -> proximo --- netxline -> linha toda
        String new_setence = Toupper(setense);
        System.out.println(new_setence);




    }
    public static String Toupper(String x){
        String temp = x.toUpperCase();
        return temp;

    }
}