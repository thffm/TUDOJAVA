package progman;

import entities.Finalgrade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Finalgrade finalgrade = new Finalgrade();

        System.out.println("Entrada");

        finalgrade.nota1 = sc.nextDouble();
        finalgrade.nota2 = sc.nextDouble();
        finalgrade.nota3 = sc.nextDouble();

        finalgrade.checkPassed();
    }
}