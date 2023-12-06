import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora ;

        hora = sc.nextInt();
        if (hora <= 12 && hora > 4){
            System.out.println("Bom Dia");

        }
        else if(hora <=17){
                System.out.println("Boa tarde");
            }
            else {
                System.out.println("Boa noite");
            }
        }
    }
