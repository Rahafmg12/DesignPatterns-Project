import java.util.ArrayList;
import java.util.List;

interface CoffeeMachineObserver {
    void update(int remainingCups);
}

class CoffeeMachine {
    private int remainingCups;
    private List<CoffeeMachineObserver> observers = new ArrayList<>();

    public int getRemainingCups() {
        return remainingCups;
    }

    public void setRemainingCups(int remainingCups) {
        this.remainingCups = remainingCups;
        notifyObservers();
    }

    public void addObserver(CoffeeMachineObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CoffeeMachineObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (CoffeeMachineObserver observer : observers) {
            observer.update(remainingCups);
        }
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

class Coffee {
    private String name;
    private double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
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
