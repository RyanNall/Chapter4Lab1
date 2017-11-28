
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class _Student
{
    //declare instance data
    //-----------------------------------------------
    String name;
    int test1;
    int test2;
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    //constructor
    //-----------------------------------------------
    public _Student(String nm){
        this.name = nm;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.println("Input score for Test 1: ");
        test1 = scan1.nextInt();
        System.out.println("Input score for Test 2: ");
        test2 = scan2.nextInt();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public double getAverage(double average)
    {
        //add body of getAverage
        average = (test1 + test2)/2;
        return average;
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    public String getName()
    {
        //add body of getName
        return this.name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    public String toString()
    {
        //add body of printName
        return "This student's name is " + this.name;
    }
}