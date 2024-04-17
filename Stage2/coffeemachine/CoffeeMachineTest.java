package coffeemachine;

public class CoffeeMachineTest {
    public static void main(String[] args) {
    
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();

        coffeeMachine.addMoney(10.0);
        System.out.println("Current money: " + coffeeMachine.getMoney());
    }
}