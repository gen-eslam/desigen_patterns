package structual_Patterns.Decorator_pattern;

public abstract class CarDecorator implements Machine {

    Machine machine;

    public CarDecorator(Machine machine){
        this.machine = machine;
    }

    public String doOperation(){
       return machine.doOperation();
    }

}
