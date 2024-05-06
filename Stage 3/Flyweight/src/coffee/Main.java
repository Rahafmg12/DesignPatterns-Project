
package coffee; 

import coffee.CoffeeFlavorFactory;
 

public class Main {
    public static void main(String[] args) {
        CoffeeFlavorFactory flavorFactory = new CoffeeFlavorFactory();

       
        CoffeeContext context1 = new CoffeeContext(1);
        Coffee coffee1 = flavorFactory.getCoffeeFlavor("Cappuccino");
        coffee1.serveCoffee(context1);

        CoffeeContext context2 = new CoffeeContext(2);
        Coffee coffee2 = flavorFactory.getCoffeeFlavor("Espresso");
        coffee2.serveCoffee(context2);

        CoffeeContext context3 = new CoffeeContext(1);
        Coffee coffee3 = flavorFactory.getCoffeeFlavor("Cappuccino");
        coffee3.serveCoffee(context3);

       
        System.out.println("Total coffee flavors created: " + flavorFactory.getTotalCoffeeFlavors());
    }
}
