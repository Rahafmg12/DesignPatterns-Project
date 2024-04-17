package coffeefactory;

public class Cappuccino implements Coffee {
    @Override
    public void make() {
        System.out.println("Making Cappuccino");
    }
}