import model.entites.CarRental;
import model.entites.Vehicle;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);

        CarRental cr = new CarRental(start,finish,new Vehicle(carModel));



        sc.close();




    }
}