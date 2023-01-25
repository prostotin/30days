import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book{
    // Declare the price instance variable
    int price;
     // Write your constructor here
    public MyBook(String title, String author, int price){
        super(title,author);
        this.price = price;
    }
 
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    
    void display(){
        System.out.print("Title: " + title  + System.lineSeparator() + "Author: " + author + System.lineSeparator() + "Price: " + price);
    }
    
// End class
}
public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
