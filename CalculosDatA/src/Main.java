import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        final int x = 1;
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yy");
        /*for (int i = 0; i < 10;i++){
            System.out.println(d01);
            d01 = d01.plusYears(x);

        }*/
        Duration t1=  Duration.between(d01.plusYears(3),d01.plusYears(9));
        System.out.println(t1.toDays());
        d01.le

    }
}