import entities.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao adicionadas? ");
        int n = sc.nextInt();
        int soma =0;
        double media = 0;
        Person[] pessoas = new Person[n];
        double menor16 = 0;



        for (int i =0; i<pessoas.length; i++){
            System.out.printf("Dados da %d pessoa:",i);
            System.out.print("Nome: ");
            sc.nextLine();
            String temp_name = sc.nextLine();
            System.out.print("Idade:");
            int temp_idade = sc.nextInt();
            System.out.print("Altura: ");
            double temp_altura = sc.nextDouble();
            pessoas[i] = new Person(temp_name,temp_idade,temp_altura);
            soma += pessoas[i].age;
            if(pessoas[i].age < 16){
                System.out.printf("Menor de 16 :\n%s\n%d\n%.2f\n",pessoas[i].name,pessoas[i].age,pessoas[i].altura);
                menor16 += 1;
            }
        }

        media = (double) soma/n;
        for(int i = 0; i< pessoas.length;i++){
            System.out.println(pessoas[i]);
        }
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.printf("Media: %.2f: \n",media);
        System.out.printf("Percentage < 16 : %.2f%%",menor16/n*100);





        sc.close();


    }
}