
package missdeeboutique;


public class product 
{
    private String name;
    private double price;
    private String cart;

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String viewCart() {
        return cart;
    }   
}
