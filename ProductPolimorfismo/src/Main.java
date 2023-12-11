import entities.ImportedeProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");






        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1;i<=n;i++){
            System.out.printf("Product #%d data\n",i);
            System.out.print("Common, used or imported (c/u/i) ?");
            char ch = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();;
            sc.nextLine();
            switch (ch){
                case 'i':
                    System.out.print("Custom fee: ");
                    double cf = sc.nextDouble();
                    sc.nextLine();

                    Product product = new ImportedeProduct(name,price,cf);
                    products.add(product);
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String data = sc.nextLine();
                    Date d = sdf.parse(data);
                    products.add(new UsedProduct(name,price,d));
                    break;





                default:
                    products.add(new Product(name,price));
                    break;
            }

        }
        for (Product pt : products){
            System.out.print(pt.priceTag());
            System.out.println();
        }


        sc.close();



    }
}