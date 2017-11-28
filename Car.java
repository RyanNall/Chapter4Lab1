
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private String type;
    private int year;

    /**
     * Constructor for objects of class Car
     */
    public Car(String ty, int ye)
    {
        this.type = ty;
        this.year = ye;
        
    }
    
    public String toString(){
        return "This car was built in " + this.year + " and is a " + type;
    }

    public boolean equals(Car other) {
        if(this.type.equals(other.type) && this.year == other.year) {
            return true;
        }
        else{
            return false;
        }
    }
   
}
