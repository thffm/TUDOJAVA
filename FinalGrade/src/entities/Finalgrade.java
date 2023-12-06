package entities;

public class Finalgrade {
    public double nota1;
    public double nota2;
    public double nota3;

    public void checkPassed(){
        double total = 60;
        double sum_notas = nota1+nota2+nota3;

        if(sum_notas >= total){
            System.out.println("Final Grade = "+sum_notas);
            System.out.println("Passed");

        }
        else {
            System.out.printf("FINAL GRADE = %.2f\n ",sum_notas);
            System.out.println("FAILED");
            System.out.println("MISSING "+sum_notas+" POINTS"+(total-sum_notas));

        }
    }
}
