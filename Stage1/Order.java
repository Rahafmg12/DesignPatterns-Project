package coffee;

public class Order {
    
    private Coffee coffee;
    private int cups;

    public Order(Coffee coffee, int cups) {
        this.coffee = coffee;
        this.cups = cups;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public int getCups() {
        return cups;
    }
}