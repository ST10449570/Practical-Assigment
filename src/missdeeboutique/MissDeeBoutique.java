package missdeeboutique;
import java.util.Scanner;
public class MissDeeBoutique 
{

    
    public static void main(String[] args) 
    {
       Scanner lux = new Scanner(System.in);
   
    
        //sample products
    product Product1 = new product("Apples", 32.80);
    product Product2 = new product("Eggs", 89.99);
    product Product3 = new product("Bread", 19.99);

    //Create a customer
    customer customer1 = new customer("Lisa Evans", "lisaevans@gmail.com", "A123");

    //Menu
   boolean exit = false;
   while (!exit)
    {
        
        System.out.println("\n1.Add Products to Cart");
        System.out.println("2.View Cart");
        System.out.println("3.Checkout");
        System.out.println("4.Exit");
        System.out.println("5.Enter your choice");

       int choice = lux.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Select Product to Add");
                System.out.println("1. Apples (R32.80)");
                System.out.println("2. Eggs (R89.99)");
                System.out.println("3. Bread (R19.99)");

                int productchoice = lux.nextInt();

                switch (productchoice) {
                    case 1:
                        customer.addToCart(Product1);
                        break;
                    case 2:
                        customer.addToCart(Product2);
                        break;
                    case 3:
                        customer.addToCart(Product2);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            case 2:

                System.out.println("Invalid choice");
            {
                String total = null;
                System.out.println("Total cost: R" + total);
            }

                exit = true;
                break;

            case 4:
                exit = true;
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    }
    
}
   
 



