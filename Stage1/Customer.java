package coffee;

public class Customer {
    private CoffeeMachine coffeeMachine;

    public Customer(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void buyCoffee(Coffee coffee, int cups) {
        if (coffeeMachine.getWater() < cups * 200) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeMachine.getMilk() < cups * 50) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeMachine.getCoffeeBeans() < cups * 15) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (coffeeMachine.getCups() < cups) {
            System.out.println("Sorry, not enough cups!");
        } else {
            coffeeMachine.deductWater(cups * 200);
            coffeeMachine.deductMilk(cups * 50);
            coffeeMachine.deductCoffeeBeans(cups * 15);
            coffeeMachine.deductCups(cups);
            coffeeMachine.addMoney(coffee.getPrice() * cups);
            System.out.println("Enjoy your " + coffee.getName() + "!");
        }
    }

    public void checkRemainingResources() {
        System.out.println("Water: " + coffeeMachine.getWater() + " ml");
        System.out.println("Milk: " + coffeeMachine.getMilk() + " ml");
        System.out.println("Coffee Beans: " + coffeeMachine.getCoffeeBeans() + " g");
        System.out.println("Cups: " + coffeeMachine.getCups());
        System.out.println("Money: $" + coffeeMachine.getMoney());
    }

    public void refillResources(int water, int milk, int coffeeBeans, int cups) {
        coffeeMachine.addMoney(-water);
        coffeeMachine.addMoney(-milk);
        coffeeMachine.addMoney(-coffeeBeans);
        coffeeMachine.addMoney(-cups);
        coffeeMachine.deductWater(-water);
        coffeeMachine.deductMilk(-milk);
        coffeeMachine.deductCoffeeBeans(-coffeeBeans);
        coffeeMachine.deductCups(-cups);
        System.out.println("Resources refilled successfully!");
    }

    public void takeMoney() {
        double money = coffeeMachine.getMoney();
        coffeeMachine.addMoney(-money);
        System.out.println("Money taken: $" + money);
    }
}