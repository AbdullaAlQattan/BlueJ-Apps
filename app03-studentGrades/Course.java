
/**
 * Write a description of class Course here.
 *
 * @author Abdulla AlQattan
 * @version 0.1
 */
public class Course
{
    private String title;
    
    private String code;

    /**
     * This method will be called to create a new course object
     * It will initialize the course title and the course code
     */
    public Course(String title, String code)
    {
        this.title = title;
        this.code = code;
    }

    /**
     * This method will print out the title and the code
     */
    public void print()
    {
        //System.out.println(title, code);
        System.out.println("course title " + title + ", code: " + code);

    }
}
