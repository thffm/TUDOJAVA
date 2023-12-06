package entities;

public class Person {
    public String name;
    public int age;
    public double altura;

    public  Person(String name, int age, double altura){
        this.name = name;
        this.age = age;
        this.altura = altura;
    }


    public String toString() {
        return String.format("Nome: %S \nIdade: %d\nAltura: %.2f\n",name,age,altura);
    }
    public double media(double x,double y){
        return x/y;
    }
    public static  void pessoas16Anos(int x ){
        double teste = (double)x/100;
       System.out.printf("Total de pessoas menores de 16:%d\n",x);
       System.out.printf("Pecentage: %.2f%%",x);


    }
}
