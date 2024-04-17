package coffeemachine;

public class CoffeeMachine {
    private double money;
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;

    private static CoffeeMachine instance;

    private CoffeeMachine() {
      
        this.money = 0.0;
        this.water = 0;
        this.milk = 0;
        this.coffeeBeans = 0;
        this.cups = 0;
    }

    public static CoffeeMachine getInstance() {
        if (instance == null) {
            instance = new CoffeeMachine();
        }
        return instance;
    }


    public double getMoney() {
        return money;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void addMoney(double amount) {
        money += amount;
    }
}