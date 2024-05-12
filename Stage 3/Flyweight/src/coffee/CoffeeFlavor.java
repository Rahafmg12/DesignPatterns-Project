

package coffee;


public class CoffeeFlavor implements Coffee {
    private final String flavor;

    public CoffeeFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serveCoffee(int tableNumber) {
        System.out.println("Serving coffee flavor: " + flavor + " to table number " + tableNumber);
    }
}