import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberNegatives = 0;
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0;i<n;i++){
            for (int j= 0;j<n;j++){
                mat[i][j] = sc.nextInt();
                if(mat[i][j] < 0){
                    numberNegatives ++;
                }
            }
        }
        System.out.println("Main Diagonal:");
        for (int i = 0;i<n;i++){
            System.out.print(mat[i][i]+" ");

        }
        System.out.println(numberNegatives);
        sc.close();
    }
}