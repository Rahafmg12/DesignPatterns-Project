package coffeefactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee cappuccino = coffeeFactory.createCoffee("Cappuccino");
        cappuccino.make();

        Coffee espresso = coffeeFactory.createCoffee("Espresso");
        espresso.make();

        Coffee latte = coffeeFactory.createCoffee("Latte");
        latte.make();
    }
}