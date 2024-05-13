
package coffee; 

import coffee.CoffeeFlavorFactory;
 

public class Main {
    public static void main(String[] args) {
        CoffeeFlavorFactory flavorFactory = new CoffeeFlavorFactory();

        
        Coffee coffee1 = flavorFactory.getCoffeeFlavor("Cappuccino");
        coffee1.serveCoffee(1);

        Coffee coffee2 = flavorFactory.getCoffeeFlavor("Espresso");
        coffee2.serveCoffee(2);

        Coffee coffee3 = flavorFactory.getCoffeeFlavor("Cappuccino");
        coffee3.serveCoffee(1);

        
        System.out.println("Total coffee flavors created: " + flavorFactory.getTotalCoffeeFlavors());
    }
}
