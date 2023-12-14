import entities.Circle;
import entities.Retangule;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1;i<=n;i++ ){
            System.out.println("Shape # "+i+"data: ");
            System.out.print("Retangule or Circule (r/c) ?");
            char ch = sc.nextLine().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());
            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();
                shapes.add(new Retangule(color,width,height));
            }
            else {
                System.out.print("radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();
                shapes.add(new Circle(color,radius));
            }



        }
        System.out.println("");
        System.out.println("SHAPES AREAS: ");
        for (Shape sh:shapes){
            System.out.println(String.format("%.2f",sh.area()));
        }


        sc.close();



    }
}