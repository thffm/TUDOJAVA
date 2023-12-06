import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Quntos quartos");
        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] vect = new  Pessoa[9];

        for (int i = 0; i < n ; i++){
            System.out.printf("Rente #%d:\n",i);
            System.out.print("Name: \n");

            String tempName = sc.nextLine();

            System.out.print("Email: \n");

            String tempEmail = sc.nextLine();
            System.out.print("Room: \n");
            int tempRoom = sc.nextInt();

            vect[tempRoom] = new Pessoa(tempName,tempEmail,tempRoom);
            sc.nextLine();
        }
        System.out.println("Busy rooms: ");
        for (int i = 0;i< vect.length; i++){
            if(vect[i] != null){

            System.out.printf("%d: %S , %s\n",vect[i].room,vect[i].name,vect[i].email);
            }

        }
        //bug
        for(Pessoa tudo: vect){//
            if(tudo != null){
                System.out.println("-----------");
                System.out.println(tudo.name);
            }


        }



        sc.close();


    }
}