import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path:");
        String strPath= sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        File[] files = path.listFiles(File::isFile);
        System.out.println("Folders: ");
        for(File folder:folders){
            System.out.println(folder);
        }
        System.out.println("Files: ");
        for(File file:files){
            System.out.println(file);
        }
        boolean success = new File(strPath+"\\subdir\\teste").mkdir();
        System.out.println("Direct created with successfully: "+success);
    }
}