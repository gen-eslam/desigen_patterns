package structual_Patterns.Facade;

public class Robot implements Machine {

    @Override
    public void performOperation() {
        System.out.println("Robot performs operation!");
    }
}
