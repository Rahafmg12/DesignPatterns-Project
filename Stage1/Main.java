package coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Coffee("Espresso", 1.5);
        Coffee latte = new Coffee("Latte", 2.5);
        Coffee cappuccino = new Coffee("Cappuccino", 3.0);

        CoffeeMachine coffeeMachine = new CoffeeMachine(0, 1000, 1000, 1000, 100);

        Customer customer = new Customer(coffeeMachine);

        List<Order> orders = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String action;

        do {
            System.out.println("1. Buy coffee");
            System.out.println("2. Check remaining resources");
            System.out.println("3. Refill resources");
            System.out.println("4. Take money");
            System.out.println("5. Exit");
            System.out.println("Select an action: ");
            action = scanner.nextLine();

            switch (action) {
                case "1":
                    System.out.println("Select a coffee:");
                    System.out.println("1. " + espresso.getName() + " - $" + espresso.getPrice());
                    System.out.println("2. " + latte.getName() + " - $" + latte.getPrice());
                    System.out.println("3. " + cappuccino.getName() + " - $" + cappuccino.getPrice());
                    System.out.println("Select a coffee: ");
                    int coffeeChoice = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the number of cups: ");
                    int cups = Integer.parseInt(scanner.nextLine());
                    if (coffeeChoice == 1) {
                        customer.buyCoffee(espresso, cups);
                        orders.add(new Order(espresso, cups));
                    } else if (coffeeChoice == 2) {
                        customer.buyCoffee(latte, cups);
                        orders.add(new Order(latte, cups));
                    } else if (coffeeChoice == 3) {
                        customer.buyCoffee(cappuccino, cups);
                        orders.add(new Order(cappuccino, cups));
                    }
                    break;
                case "2":
                    customer.checkRemainingResources();
                    break;
                case "3":
                    System.out.println("Enter the amount of water to refill (in ml): ");
                    int refillWater = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the amount of milk to refill (in ml): ");
                    int refillMilk = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the amount of coffee beans to refill (in g): ");
                    int refillCoffeeBeans = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the number of cups to refill: ");
                    int refillCups = Integer.parseInt(scanner.nextLine());
                    customer.refillResources(refillWater, refillMilk, refillCoffeeBeans, refillCups);
                    break;
                case "4":
                    customer.takeMoney();
                    break;
                case "5":
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid action. Please try again.");
                    break;
            }
        } while (!action.equals("5"));

        System.out.println("Order summary:");
        for (Order order : orders) {
            System.out.println(order.getCups() + " cups of " + order.getCoffee().getName());
        }
    }
}