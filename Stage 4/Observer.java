package coffee;

import java.util.Observable;
import java.util.Observer;

interface CoffeeMachineObserver {
    void update(int remainingCups);
}

class CoffeeMachine extends Observable {
   private int remainingCups;

    public int getRemainingCups() {
       return remainingCups;
    }

    public void setRemainingCups(int remainingCups) {
        this.remainingCups = remainingCups;
        setChanged();
        notifyObservers(remainingCups);
    }
}

class Order implements CoffeeMachineObserver {
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

    @Override
    public void update(int remainingCups) {
        System.out.println("Order update: " + remainingCups + " cups remaining");
    }
}

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Coffee espresso = new Coffee("Espresso", 1.5);
        Coffee latte = new Coffee("Latte", 2.5);
        Coffee cappuccino = new Coffee("Cappuccino", 3.0);

        

        Order order1 = new Order(espresso, 2);
        Order order2 = new Order(latte, 1);

        coffeeMachine.addObserver(order1);
        coffeeMachine.addObserver(order2);

        coffeeMachine.setRemainingCups(10);
    }
}