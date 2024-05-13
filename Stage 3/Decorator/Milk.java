package coffee;


public class Milk extends CoffeeDecorator {
    public Milk(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public void serve() {
        super.serve();
        addMilk();
    }

    private void addMilk() {
        System.out.println("Adding Milk");
    }
}

