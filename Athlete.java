

public class Athlete
{
    
    
    private String name;
    private int age;
    public Athlete(String nm, int ag)
    {
        this.name = nm;
        this.age =ag;
    }

    public String toString(){
        return "This athlete's name is " +  this.name + " they are " + age + " years old \n";
    }
    public boolean equals(Athlete other){
        if(this.name.equals(other.name) && this.age == other.age){
            return true;
        }
        else{
            return false;
        }
    }
}
