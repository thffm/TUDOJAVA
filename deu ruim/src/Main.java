import entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x,y;//Tipo <- da classe
        x = new Triangle();//instancia da classe
        y = new Triangle();

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double area_x = x.area();
        double area_y =y.area();
        Triangle.comparisson(area_x,area_y);


    }
}