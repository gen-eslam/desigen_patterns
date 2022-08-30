package structual_Patterns.Decorator_pattern;

public class ParkingAssistant extends CarDecorator {
    public ParkingAssistant(Machine machine) {
        super(machine);
    }

    public String doOperation(){
        return machine.doOperation() + addParkingAssistant();
    }

    public String addParkingAssistant(){
        return " + Parking Assistant";
    }
}
