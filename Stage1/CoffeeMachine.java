package coffee;

public class CoffeeMachine {
    private double money;
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;

    public CoffeeMachine(double money, int water, int milk, int coffeeBeans, int cups) {
        this.money = money;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
    }

    public double getMoney() {
        return money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public void addMoney(double amount) {
        money += amount;
    }

    public void deductWater(int amount) {
        water -= amount;
    }

    public void deductMilk(int amount) {
        milk -= amount;
    }

    public void deductCoffeeBeans(int amount) {
        coffeeBeans -= amount;
    }

    public void deductCups(int amount) {
        cups -= amount;
    }
}