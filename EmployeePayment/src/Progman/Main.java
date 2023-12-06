package Progman;
import entities.Employee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.Name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax =sc.nextDouble();
        double increase;

        double net_salary = employee.NetSalary();
        System.out.printf("Employee: %s, $ %.2f",employee.Name,net_salary);
        System.out.println();

        System.out.println("Wich percentage to increase salary? ");
        increase = sc.nextDouble();
        employee.IncreaseSalary(increase);
        System.out.println();

        System.out.println(employee);




    }
}