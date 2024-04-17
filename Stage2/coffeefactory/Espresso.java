package coffeefactory;

public class Espresso implements Coffee {
    @Override
    public void make() {
        System.out.println("Making Espresso");
    }
}