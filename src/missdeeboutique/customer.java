
package missdeeboutique;

public class customer 
{
    private String customerId;
    private product[] cart;
    private int cartSize;

    public customer(String name, String contactInfo, String customerId) 
    {
   
        this.customerId = customerId;
        this.cart = new product[10];//max 10 items in the cart for simplicity
        this.cartSize = 0;
    }

    public void addCart(product Product) {
        if (cartSize < cart.length) {
            cart[cartSize] = Product;
            cartSize++;

            System.out.println(Product.getClass() + "added to cart.");

        } else {
            System.out.println("Cart is full!");
        }
    }

    public void viewCart() {
        System.out.println("Cart for" + getName() + ":");
        for (int i = 0; i < cartSize; i++) {
            System.out.println(cart[i].getName() + "- $" + cart[i].getPrice());
        }
    }

    public double checkout() {
        double total = 0;
        for (int i = 0; i < cartSize; i++) {
            total += cart[i].getPrice();
        }
        return total;
    }

    static void addToCart(product Product1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
