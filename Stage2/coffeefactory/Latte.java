package coffeefactory;

public class Latte implements Coffee {
    @Override
    public void make() {
        System.out.println("Making Latte");
    }
}