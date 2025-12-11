import java.sql.SQLOutput;

public class Book {
    
    private int rating;
    private String title;
    private String author;
    
    public Book(int pRating){
        title = "Peter Nimble";
        author = "Johnathon Auxier";
        rating = pRating;

    }

    public void print(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("rating: " + rating);


    }

    public int getRating(){
        return rating;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void setRating(int r){
        rating = r;
    }

    public void setTitle(String t){
        title = t;
    }

    public void setAuthor(String a){
        author = a;
    }
}