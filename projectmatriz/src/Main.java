import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] mat = new int[x][y];

        for (int i = 0;i< mat.length;i++){
            for (int j =0;j<mat[0].length;j++){
                mat[i][j] = sc.nextInt();

            }
        }
        int numberDuplicate = sc.nextInt();
        for (int i = 0;i< mat.length;i++){
            for (int j = 0; j<mat[0].length;j++){
                if (numberDuplicate == mat[i][j]){
                    int direction = 1;

                    System.out.printf("Position: %d,%d\n",i,j);
                    if(j - direction >=0){
                        System.out.printf("left : %d \n",mat[i][j-1]);
                    }
                    if (j +direction < mat[0].length){
                        System.out.printf("Right: %d\n",mat[i][j+1]);
                    }
                    if (i-direction >= 0 ){
                        System.out.printf("Up: %d\n",mat[i-1][j]);

                    }
                    if (i+direction < mat.length){
                        System.out.printf("Down: %d\n",mat[i+1][j]);
                    }






                    System.out.println("------");
                }

            }
        }

        sc.close();

    }
}