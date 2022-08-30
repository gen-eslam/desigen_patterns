package structual_Patterns.Facade;

public class FacadeClass {
    private Computer computer;
    private Robot robot;

    FacadeClass(){
        computer = new Computer();
        robot = new Robot();
    }

    public void computerPerformOperation(){
        computer.performOperation();
    }

    public void robotPerformOperation(){
        robot.performOperation();
    }
}
