import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double preco = 34.5;
        double desconto = (preco < 20.0)? preco*01:preco*0.05;
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        System.out.printf("Valor total %.3f",desconto);
        String verdade;
        verdade = name == "thiago"? "Sim":"Ndao";
        if(name == "Thiago"){
            System.out.printf("Seu nome e %s ",name);

        }
        else {
            System.out.printf("Nome igual a %s",name);
        }
        System.out.println(verdade);
    }
}