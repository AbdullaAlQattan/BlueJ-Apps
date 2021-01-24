
/**
 * Write a description of class Course here.
 *
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
        //todo add others
    }

    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    public Grades convertToGrade(int mark)
    {
        if((mark >=0) &&(mark<40))
        {
            return Grades.F;
        }
        
        return Grades.X;
    }
}
