
import java.util.Date;
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    private String destination;
    private int cost; 
    private Date date;
    
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int cost)
    {
        this.destination = destination;
        this.cost = cost;
        date = new Date();
    }

    public void print()
    { 
        System.out.println("Ticket " + destination + " " 
        + cost + " pence " + date);
    }
    
}
