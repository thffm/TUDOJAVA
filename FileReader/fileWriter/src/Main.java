import entities.DayStatus;

import javax.imageio.IIOException;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[]{"good morning","good afternoon","good night"};
        String path = "c:\\documents\\out.txt";
        DayStatus dayStatus = null;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();

            }

        }catch (IOException e){
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                System.out.println(line);

                if(line.equals("good night")){
                    System.out.println("dd");
                    dayStatus = new DayStatus(line);
                }
                line = br.readLine();
            }



        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Fimm");
        System.out.println(dayStatus);







    }
}