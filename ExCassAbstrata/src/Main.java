import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1;i<=n;i++){
            System.out.println("TAX PAYER # "+i+"DATA:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.nextLine().charAt(0);
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (ch == 'i'){

                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                sc.nextLine();

                pessoas.add(new PessoaFisica(name,anualIncome,healthExpenditures));


            }
            else {
                System.out.print("Number of employees: ");
                int employee = sc.nextInt();
                sc.nextLine();
                pessoas.add(new PessoaJuridica(name,anualIncome,employee));
            }
        }
        System.out.println("");
        System.out.println("TAXES PAID:");
        for (Pessoa p:pessoas){
            System.out.println(p);
        }
        double sum = 0;
        for (Pessoa p : pessoas){
            sum += p.tax();
        }
        System.out.println("TOTAL TAXES: $ "+sum);

        sc.close();
    }
}