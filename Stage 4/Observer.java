import java.util.ArrayList;
import java.util.List;





abstract class Observer {
    public abstract void update(int remainingCups);
}







class Subject {
    private int remainingCups;
    private List<Observer> observers = new ArrayList<>();

    public int getRemainingCups() {
        return remainingCups;
    }

    public void setRemainingCups(int remainingCups) {
        this.remainingCups = remainingCups;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(remainingCups);
        }
    }
}







class Order extends Observer {
    private String coffeeName;
    private int cups;

    public Order(String coffeeName, int cups) {
        this.coffeeName = coffeeName;
        this.cups = cups;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public int getCups() {
        return cups;
    }

    @Override
    public void update(int remainingCups) {
        System.out.println("Order update: " + remainingCups + " cups remaining");
    }
}







class Customer extends Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(int remainingCups) {
        System.out.println("Customer " + name + " received update: " + remainingCups + " cups remaining");
    }
}






public class Main {
    public static void main(String[] args) {
        Subject coffeeMachine = new Subject();

        Order order1 = new Order("Espresso", 2);
        Order order2 = new Order("Latte", 1);
        Customer customer1 = new Customer("Raghad");
        Customer customer2 = new Customer("Rahaf");

        coffeeMachine.addObserver(order1);
        coffeeMachine.addObserver(order2);
        coffeeMachine.addObserver(customer1);
        coffeeMachine.addObserver(customer2);

        coffeeMachine.setRemainingCups(10);
    }
}
