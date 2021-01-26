
/**
 * This class contains 4 moduls, and added marks for each one of them.
 * The marks get converted to grades and the average marks for the 
 * are calculated.
 * @author Abdulla AlQattan
 * @version 0.1 24/Jan/2021
 */
public class Course
{
    //instance variables - replace the example below with own
    private String codeNo;
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
    private Grades finalGrade;
        
    /**
     * Constructor for objects of class Course 
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        module1 = new Module("Programming Concepts", "CO452");
        
        module2 = new Module("Applicatins programming", "CO453");
        
        module3 = new Module("Web Development", "CO454");
        
        module1 = new Module("Modeling", "CO455");
    }

    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        else 
        if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        else 
        if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        else 
        if(moduleNo == 4)
        {
            module4.awardMark(mark);
        }
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    public Grades convertToGrade(int mark)
    {
        if((mark >=0) &&(mark<40))
        {
            return Grades.F;
        }
        else if((mark >= 40) &&(mark<50))
        {
            return Grades.D;
        }
        else if((mark >= 50) &&(mark<60))
        {
            return Grades.C;
        }
        else if((mark >= 60) &&(mark<70))
        {
            return Grades.B;
        }
        else if((mark >= 70) &&(mark<=100))
        {
            return Grades.A;
        }
        
        return Grades.X;
    }
}
