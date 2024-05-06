

package coffee;


public class CoffeeFlavor implements coffee.Coffee {
    private final String flavor;

    public CoffeeFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serveCoffee(coffee.CoffeeContext context) {
        System.out.println("Serving coffee flavor: " + flavor + " to table number " + context.getTableNumber());
    }
}
