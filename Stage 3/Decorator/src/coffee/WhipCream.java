
package coffee;

public class WhipCream extends CoffeeDecorator {
    public WhipCream(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whip Cream";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }
}