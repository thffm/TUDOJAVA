package entites;

import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private Integer id;
    private Double salary;

    public User(String name, Integer id, Double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return String.format("%d, %S, %.2f",id,name,salary);
    }

    public static void start(List<User> users){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered?");
        int x = sc.nextInt();

        for(int i =0;i<x ;i++){
            System.out.printf("employee # %d:\n" ,i);
            System.out.print("Id:");
            int temp_id = sc.nextInt();
            System.out.print("Name:");
            sc.nextLine();
            String temp_name = sc.nextLine();
            System.out.print("Salary: ");
            double temp_salary = sc.nextDouble();
            users.add(new User(temp_name,temp_id,temp_salary));


        }
        System.out.println("Enter id that will have salary increase:");
        int temp_id = sc.nextInt();
        for (User pessoa: users){
            if(pessoa.getId() == temp_id){
                double temp_salary = pessoa.getSalary();

                System.out.printf("Enter the percentage: ");
                double temp_percentage = sc.nextDouble();
                pessoa.setSalary(temp_salary+(temp_salary*(temp_percentage/100)));
                System.out.println(pessoa.getSalary());
                break;
            }
            else {
                System.out.println("Id does not exist...");
            }
        }





        sc.close();


    }
    public static  void Increase(List<User> users){

        System.out.print("Enter id that will have salary increase: ");










    }


    public Integer getId() {
        return (int) id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
