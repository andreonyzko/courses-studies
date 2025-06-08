package ex002.application;

import java.time.LocalDateTime;

import ex002.entities.Comments;
import ex002.entities.Post;

public class App {
    public static void main(String[] args) {
        Comments c1 = new Comments("Have a nice trip!");
        Comments c2 = new Comments("Wow that's awesome!");
        Comments c3 = new Comments("Good night");
        Comments c4 = new Comments("May the Force be with you");

        Post p1 = new Post(LocalDateTime.now(), "Traveling to New Zeland", "Im going to visit this wonderful contry!", 12);
        Post p2 = new Post(LocalDateTime.of(2018, 07, 28, 23, 14, 19), "Good night guys", "See u tomorrow", 5);

        p1.addComment(c1);
        p1.addComment(c2);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
