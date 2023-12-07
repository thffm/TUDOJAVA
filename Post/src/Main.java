import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("wow that's awsome");

        String title = "Traveling to new Zeland";
        String content = "I'm going to visit this wonderful conutry";
        int likes = 12;
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),title,content,likes);


        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);



         c1 = new Comment("Good nigth");
         c2 = new Comment("May the force be with you");

        title = "Traveling to new Zeland";
        content = "I'm going to visit this wonderful conutry";
        likes = 25;

        Post p2= new Post(sdf.parse("28/07/2018 23:14:19"),title,content,likes);
        p2.addComment(c1);
        p2.addComment(c2);
        System.out.println(p2);
    }
}