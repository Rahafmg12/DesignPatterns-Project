package coffeefactory;

public class CoffeeFactory {
    public Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("Cappuccino")) {
            return new Cappuccino();
        } else if (type.equalsIgnoreCase("Espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("Latte")) {
            return new Latte();
        } else {
            throw new IllegalArgumentException("Invalid coffee type: " + type);
        }
    }
}
  

  