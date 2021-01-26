
/**
 * This module contain a single mark, and the title and code. Also, 
 * marks can be awarded. The module is complete when grades are over 40%
 * @author (Abdulla AlQattan)
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private boolean complete;
    
    private int credit;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
     mark = 0;
     this.title = title;
     this.codeNo = codeNo;
    }

    public void awardMark(int mark)
    {
        if((mark >= 0 ) && (mark<=100))
        {
          this.mark = mark;
          if (mark > 40) 
          { 
              complete = true;
              credit = 20;
          }
        }
        else 
        {
            System.out.print("Invalid mark!!!");
        }
    }
    
    public void print()
    {
        System.out.println("Module: " + codeNo +
            " " + title + " Mark = " + mark);
    }
    
   
}
