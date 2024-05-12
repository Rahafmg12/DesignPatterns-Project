public class CoffeeMachine {
       private State state;
    
       public CoffeeMachine() {
          state = null;
        }
    
        public void setState(State state) {
          this.state = state;
        }
    
        public State getState() {
           return state;
        }
    }
    
    public interface State {
        public void doAction(CoffeeMachine coffeeMachine);
    }
    
    public class StopState implements State {
        public void doAction(CoffeeMachine coffeeMachine) {
            System.out.println("Coffee machine is in stop state");
            coffeeMachine.setState(this);
        }
    
        public String toString() {
            return "Stop State";
        }
    }
    
    public class StartState implements State {
       public void doAction(CoffeeMachine coffeeMachine) {
           System.out.println("Coffee machine is in start state");
          coffeeMachine.setState(this);
        }
    
        public String toString() {
            return "Start State";
        }
    }
    
    public class BrewState implements State {
        public void doAction(CoffeeMachine coffeeMachine) {
           System.out.println("Coffee machine is brewing");
           coffeeMachine.setState(this);
        }
    
       public String toString() {
            return "Brew State";
        }
    }
    
    public class Client {
        public static void main(String[] args) {
           CoffeeMachine coffeeMachine = new CoffeeMachine();
    
         StartState startState = new StartState();
           startState.doAction(coffeeMachine);
           System.out.println(coffeeMachine.getState().toString());
    
            BrewState brewState = new BrewState();
            brewState.doAction(coffeeMachine);
            System.out.println(coffeeMachine.getState().toString());
    
            StopState stopState = new StopState();
            stopState.doAction(coffeeMachine);
            System.out.println(coffeeMachine.getState().toString());
        }
    }