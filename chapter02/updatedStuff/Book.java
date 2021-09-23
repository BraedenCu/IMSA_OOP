
/**
 * Write a description of class book here.
 *
 * @author (Braeden Cullen)
 * @version (9/10/21)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String author;
    private String title;
    private int pages; 
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Constructor for objects of class book
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String bookRefnumber, boolean bookCourseText)
    {
        // initialise instance variables
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; 
        refNumber = bookRefnumber;
        borrowed = 0;
        this.courseText = bookCourseText; 
    }

    //this method prints the author of the book (getter for author) 
    public void printAuthor() {
        System.out.println("Book author: " + author);
    }
    
    //prints title of book (getter for book title)
    public void printBook() {
        System.out.println("Book title: " + title);
    }
    
    //print number of pages in book (getter for book pages field)
    public void printPages() {
        System.out.println("Book pages: " + pages);
    }
    
    //setter for refernce number (mutator method) 
    public void setRefNumber(String ref) {
        if (ref.length() >= 3) {
            refNumber = ref;
        }
        else {
            System.out.println("Reference number must be atleast three characters");
        }
    }
    
    public String getRefNumber() {
        return refNumber;
    }
    
    public int getBorrowed() {
        return borrowed;
    }
    
    public void barrow() {
        borrowed = borrowed+1;
    }
    
    public void isCourseText() {
        if (courseText) {
            System.out.println("This book is a textbook");
        }
        else {
            System.out.println("This book is not a textbook");
        }
    }
    
    
        
    public void printDetails () {
        System.out.println("Book Details");
        System.out.println("Book Author: " + author);
        System.out.println("Book Title: " + title);
        System.out.println("Book Pages: " + pages);
        if (refNumber.length() > 0) {
            System.out.println("Reference Number: " + refNumber);
        }
        else {
            System.out.println("Reference Number: " + "zzz");
        }
    }
    
}
