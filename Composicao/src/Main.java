import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkedLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament name:");
        String departmentName = sc.nextLine();
        System.out.println("Enter woker data:");
        System.out.print("Name:");
        String wokerName =  sc.nextLine();
        System.out.print("Level:");
        String wokerLevel =  sc.nextLine();

        System.out.print("Base salary:");
        Double baseSalary =  sc.nextDouble();

        Worker worker = new Worker(wokerName, WorkedLevel.valueOf(wokerLevel),baseSalary,new Department(departmentName));

        System.out.print("How many contracts to this worker?");
        int n = sc.nextInt();

        for(int i = 1;i <=n; i++){
            System.out.println("Enter contract #"+i+"data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contacDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double valueHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contacDate,valueHour,hours);
            worker.addContract(contract);


        }
        System.out.println("");
        System.out.println("Enter mouth and year to caucule income (MM/YYYY):");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name"+worker.getName());
        System.out.println("Department"+worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear+": "+String.format("%.2f",worker.income(month,year)));


        sc.close();
    }
}