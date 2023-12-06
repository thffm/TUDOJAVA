import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d01 = LocalDate.now();
        System.out.println("d01 ="+d01);
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        LocalDate d04 = LocalDate.parse("2023-11-20");
        LocalDateTime d05 = LocalDateTime.parse("2032-07-20T01:30:36");
        Instant agora = Instant.now();

        Instant d06 = Instant.parse("2023-07-20T20:10:32-03:00");
        System.out.println("d02 = "+d02);
        LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
        System.out.println("d03 = "+d03);
        System.out.println("d04"+d04);
        System.out.println("d05 = "+d05);
        System.out.println("d06 = "+d06);
        System.out.println("d08 ="+d08.format(fmt1));
        System.out.println("d04 = "+fmt1.format(d04));
        System.out.println("Tempo atual : "+fmt2.format(agora));
        System.out.println("Tempo 1: "+fmt1.format(d01));



    }

}