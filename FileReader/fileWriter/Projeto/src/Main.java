import entities.Product;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "c:\\documents\\csv\\items.csv";
        File file = new File(path);
        List<Product>products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                String[] splitado = line.split(",");
                products.add(new Product(splitado[0],Double.parseDouble(splitado[1]),Integer.parseInt(splitado[2])));
                line = br.readLine();
            }


        }
        catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }

        new File(file.getParent()+"\\out").mkdir();
        String pathNew = file.getParent()+"\\out\\summary.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathNew))){
            for (Product p : products){
                bw.write(p.extractString());
                bw.newLine();
            }





        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}