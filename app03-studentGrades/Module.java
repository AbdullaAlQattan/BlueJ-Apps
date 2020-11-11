
/**
 * Write a description of class Module here.
 *
 * @author (Abdulla AlQattan)
 * @version (a version number or a date)
 */
public class Module
{

    private String title; 
    
    private String codeNo;
    
    private int mark;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
     mark = 0;
     this.title = title;
     this.codeNo = codeNo;
    }

    public void print()
    {
        System.out.println("Module: " + codeNo = + " " + title + " Mark = " + mark);
    }
    
   
}
