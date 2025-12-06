import java.sql.SQLOutput;

public class Book {
    
    public int rating;
    public String title;
    public String author;
    
    public Book(int pRating){
        title = "Grandmaster of Demonic Cultivation";
        author = "MO Xiang Tong Xiu";
        rating = pRating;

    }

    public void print(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("rating: " + rating);


    }

    
}