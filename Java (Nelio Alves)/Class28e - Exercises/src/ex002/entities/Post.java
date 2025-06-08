package ex002.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    static DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private String title, content;
    private int likes;
    private List<Comments> comments = new ArrayList<>();
    
    public Post(LocalDateTime moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void addComment(Comments comment){
        comments.add(comment);
    }

    public void remComment(Comments comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append(title + "\n");
        response.append(likes + " Likes - " + moment.format(dateformat) + "\n");
        response.append(content + "\n");
        response.append("Comments: \n");
        for(Comments comment : comments){
            response.append(comment.getText() + "\n");
        }

        return response.toString();
    }
}
