
package coffee;

public class CoffeeDecorator implements Beverage {
    protected Beverage decoratedBeverage;

    public CoffeeDecorator(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    @Override
    public void serve() {
        decoratedBeverage.serve();
    }
}

