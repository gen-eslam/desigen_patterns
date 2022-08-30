package structual_Patterns.Facade;

public class Computer implements Machine {
    @Override
    public void performOperation() {
        System.out.println("Computer performs operation!");
    }
}
