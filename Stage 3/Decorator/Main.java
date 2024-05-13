
package coffee;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.serve();

        coffee = new Milk(coffee);
        coffee.serve();

        coffee = new WhipCream(coffee);
        coffee.serve();
    }
}
