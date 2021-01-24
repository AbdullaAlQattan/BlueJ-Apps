
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
    
    /**
     * Constructor for objects of class Course 
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = title;
        this.title = title;
        
        module1 = new Module("Programming Concepts", "CO452");
        //todo add others
    }

    public void addModule(Module module, int moduleNo)
    {
        
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
    }
}
