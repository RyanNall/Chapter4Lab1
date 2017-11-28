

public class PetDriver
{
    public static void main(){
    Pet tankers = new Pet(5, "cat");
    System.out.println(tankers.getType());
    Pet mike = new Pet(10, "dog");
    System.out.println(tankers.equals(mike));
    
}
}
