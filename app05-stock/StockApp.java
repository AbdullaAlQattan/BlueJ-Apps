
 /**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @Abdulla AlQattan
 * @version 0.1
 */
 public class StockApp
 {
    public final int FRIST_ID = 200;
    // Use to get user input
    private InputReader input;
    
    private StockManager manager;
    
    private int nextID = FRIST_ID;
    
    private StockDemo demo;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
    }

    /**
     * 
     */
    public void run()
    {
        getMenuChoice();
    }
    
    /**
     * 
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getString("please enter your choice");
            choice = choice.toLowerCase();
            
            if(choice.equals("quit"))
            {
                finished =true ;
            }
            else executeMenuChoice(choice);
        }
    }
    
   /**
   *  
   */ 
   public void executeMenuChoice(String choice)
   {
       if(choice.equals("add"))
       {
           addProduct();
        }
        else if(choice.equals("printall"))
       {
           printAllProducts();
        }
        else if(choice.equals("remove"))
       {
           removeProduct();
        }
   }
    
    
    public void addProduct ()
    {
        System.out.println("Add a new product");
        System.out.println();
        
        System.out.println();
        String name= input.getString("please enter the name of the product");
        
        Product product = new Product (nextID, name);
        manager.addProduct(product);
        
    }
    
    public void removeProduct()
    {
        int id = input.getInt("product id");
        manager.removeProduct(id);
    
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    public void printAllProducts()
    {
        manager.printAllProducts(); 
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: Abdulla AlQattan");
        System.out.println("******************************");
    }
}
