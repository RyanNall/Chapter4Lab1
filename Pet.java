
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    
    private String type;
    private int age;
    private static int numPets;

    
    public Pet(int ag, String ty){
        this.age = ag;
        this.type = ty;
        numPets++;
    }
    public String toString(){
        return "The pet type is: " + this.type;
    }
    public String getType() {
        return this.type;
    }
 
    
    public boolean equals(Pet other){
        if(this.type.equals(other.type)) {
         return true;   
        }
        else{
            return false;
        }
    }
    public static void example() {
        System.out.println("This is a static method");
    }
    
    
   
}
