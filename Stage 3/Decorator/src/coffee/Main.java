
package coffee;


public class Main {
    public static void main(String[] args) {
       
        Coffee coffee = new SimpleCoffee();
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());

        
        coffee = new Milk(coffee);
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());

        
        coffee = new WhipCream(coffee);
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());
    }
}
