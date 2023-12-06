import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int x;
        x = 26;
        double y = 20.964;
        String nome = "thigo";
        int idade = 23;
        double salario = 12000;
        System.out.println("Ola mundo"+" "+x);
        System.out.printf("%.2f\n",y);
        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n",nome,idade,salario);

    }

}