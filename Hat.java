
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat
{
    // instance variables - replace the example below with your own
    private String color;
    private int size;
    /**
     * Constructor for objects of class Hat
     */
    public Hat(String clr, int si)
    {
        this.color = clr;
        this.size = si;
        
    }
    public String toString(){
        return "This hat's color is " + this.color;
    }
    public String getColor(){
        return this.color;
    }

  
}
