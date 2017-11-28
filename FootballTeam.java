
/**
 * Write a description of class FootballTeam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FootballTeam
{
   public static void main(String[] args){
       Team ahsFootball = new Team("Acalanes", 32);
       Athlete joe = new Athlete("Joe", 16);
       Athlete jill = new Athlete("Jill", 16);
       System.out.println(joe.equals(jill));
       
       ahsFootball.addAthlete(0, joe);
       System.out.println(ahsFootball);
    }
    
   
}
