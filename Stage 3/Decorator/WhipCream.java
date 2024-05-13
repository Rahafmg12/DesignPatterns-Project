package coffee;

public class WhipCream extends CoffeeDecorator {
    public WhipCream(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public void serve() {
        super.serve();
        addWhipCream();
    }

    private void addWhipCream() {
        System.out.println("Adding Whip Cream");
    }
}


