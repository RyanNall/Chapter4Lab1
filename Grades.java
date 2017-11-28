// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        _Student student1 = new _Student("Mary");
        //create student2, "Mike"
        _Student mike = new _Student("Mike");
        //input grades for Mary
        //print average for Mary
        System.out.println(getAverage());
        System.out.println();
        //input grades for Mike
        //print average for Mike
    }
}