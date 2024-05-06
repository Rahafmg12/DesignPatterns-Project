import java.util.Scanner;

interface State {
    void handleInput(Scanner scanner);
}

class InitialState implements State {
    @Override
    public void handleInput(Scanner scanner) {
        System.out.println("Select an action:");
       System.out.println("1. Action A");
        System.out.println("2. Action B");
        System.out.println("3. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Performing Action A");
                break;
            case 2:
                System.out.println("Performing Action B");
                break;
            case 3:
                System.out.println("Exiting the program");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

class ExitState implements State {
    @Override
    public void handleInput(Scanner scanner) {
    }
}

class StateMachine {
    private State currentState;

    public StateMachine() {
        currentState = new InitialState();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (!(currentState instanceof ExitState)) {
           currentState.handleInput(scanner);
        }
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        StateMachine stateMachine = new StateMachine();
       stateMachine.run();
    }
}