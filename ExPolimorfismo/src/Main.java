import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i<=n; i++){
            System.out.printf("Employee #%d\n",i);
            System.out.print("Outsourced (y/n) ?\n");
            char ch = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hour: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if (ch != 'y'){
                Employee emp = new Employee(name,hour,valuePerHour);
                employees.add(emp);
            }
            else {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine();

                Employee emp = new OutsourcedEmployee(name,hour,valuePerHour,additionalCharge);//upcasting
                employees.add(emp);
            }




    }
        System.out.println(" ");
        System.out.println("PAYMENTS: ");
        for (Employee emp:employees){
            System.out.print(emp);

        }



        sc.close();


    }
}