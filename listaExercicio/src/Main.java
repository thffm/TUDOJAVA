import entites.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        User.start(users);



        for(User pessoa:users){

            System.out.println(pessoa);

        }



    }

}