import java.sql.SQLOutput;
import java.util.Random;

public class Library {

    public String owner = "Mx. Bradford";
    public Book[] allBooks;
    public static void main(String[] args) {
        Library myObject = new Library();
    }

    public Library(){

        System.out.println("Welcome to "+ owner + "'s library!!!!!");
        allBooks = new Book[10];

        for(int i = 0; i < 10; i++){
            Random rand = new Random();
            Book curr = new Book(rand.nextInt(11));
            allBooks[i]=curr;
        }

        for(int i = 0; i < 10; i++){
            int spot = i+1;
            System.out.println("The " + spot + "-th rating is: " + allBooks[i].getRating());
        }
        
        averageRating();

    }

    public void averageRating(){
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum+=allBooks[i].getRating();
        }
        double avg = sum/10.0;
        System.out.println("The average rating is: " + avg);
    }
}
