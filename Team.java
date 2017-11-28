

public class Team
{
   private String teamName;
   private Athlete[] athletes;

    /**
     * Constructor for objects of class Team
     */
    public Team(String tN, int size)
    {
        this.teamName = tN;
        this.athletes = new Athlete[size];
    }

    public void addAthlete(int location, Athlete a){
        athletes[location] = a;
    }
    
    public String toString(){
        String output = "The memebers of this team are: \n";
        for(Athlete a : athletes) {
            output += a + "\n";
        }
        return output;
    }
}
