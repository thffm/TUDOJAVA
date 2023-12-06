import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char escolha;
        double n1,n2,res;
        char operador;



        do {
            System.out.println("Input the frist number:");
            n1 = sc.nextDouble();
            System.out.println("Input the second number:");
            n2 = sc.nextDouble();

            System.out.println("Escolha a operacao ['+' '-' '*' '/']");
            operador = sc.next().charAt(0);
            switch (operador){
                case '+':
                    res = n1+n2;
                    System.out.println(res);
                    break;
                case  '-':
                    res = n1-n2;
                    System.out.println(res);
                    break;
                case '*':
                    res = n1*n2;
                    System.out.println(res);
                    break;

                default:
                    if (n2 == 0){
                        System.out.println("Nao e divisivel por 0");
                        break;
                    }
                    res = n1/n2;
                    System.out.println(res);
                    break;
            }


            System.out.println("Deseja continuar {SIM/NAO]");
            escolha = sc.next().charAt(0);


            System.out.println(" ");


        }while (escolha != 'n');
        sc.close();
    }
}