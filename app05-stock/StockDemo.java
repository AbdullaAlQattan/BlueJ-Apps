import java.util.Random;

/**
 * 
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    private Random generator = new Random();

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Samsung Galaxy S20"));
        manager.addProduct(new Product(102, "Apple iPhone 12"));
        manager.addProduct(new Product(103, "Google Pixel 4A"));
        manager.addProduct(new Product(104, "Samsung Galaxy S20"));
        manager.addProduct(new Product(105, "Apple iPhone 12"));
        manager.addProduct(new Product(106, "Google Pixel 4A"));
        manager.addProduct(new Product(107, "Samsung Galaxy S20"));
        manager.addProduct(new Product(108, "Apple iPhone 12"));
        manager.addProduct(new Product(109, "Google Pixel 4A"));
        manager.addProduct(new Product(110, "Samsung Galaxy S20"));
        manager.addProduct(new Product(111, "Apple iPhone 12"));
        manager.addProduct(new Product(112, "Google Pixel 4A"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demo()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        
        demoDelivery();
        manager.printAllProducts();
        
        demoSelling();
        manager.printAllProducts();
    }
    
    private void demoDelivery()
    {
        int amount = 0;
        
        System.out.println("Delivering Products\n");
        for(int id = 101; id <= 112; id++)
        {
            amount = generator.nextInt(6);
            manager.deliverProduct(id, amount);
        }
    }
    
     
    private void demoSelling()
    {
        int amount = 0;
        System.out.println("Selling Products\n");
        
        for(int id = 101; id <= 112; id++)
        {
            amount = generator.nextInt(6);
            manager.sellProduct(id, amount);
        }        
    }   

}
