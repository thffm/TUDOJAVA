package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public  double area(){
        double p = (a + b + c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public  static  void comparisson(double x, double y){
        if (x > y){
            System.out.printf("a area do triangulo x %.2f e maior que %.2f ",x,y);
        }
        else {
            System.out.printf("A area do triangulo y %.2f e maior que %.2f",y,x);
        }
    }
}
