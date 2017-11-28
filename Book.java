
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
   String author;
   String title;

    /**
     * Constructor for objects of class Book
     */
    public Book(String auth, String tit)
    {
       this.author = auth;
       this.title = tit;
    }
    public String toString(){
         return "This book's author is " + this.author;

        }
}
