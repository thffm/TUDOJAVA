package entities;

public class Employee {
    public  String Name;
    public  double GrossSalary;
    public double Tax;


    public double NetSalary(){
        double net_salary = GrossSalary-Tax;
        return net_salary;
    }

    public void IncreaseSalary (double percentage){
        percentage = (percentage/100)*GrossSalary;
        GrossSalary = GrossSalary-Tax+percentage;

    }

    public String toString(){
        return "Update date:"+Name+", $"+String.format("%.2f",GrossSalary);
    }
}
