package AbestractFactory;

import factory_pattern.Computer;

//factory Pattern
public class ComputerFactory extends AbstractFactory {
    public Computer getComputer(String computer){
        if(computer.equalsIgnoreCase("factory_pattern.Laptop"))
            return new Laptop();
        else if(computer.equalsIgnoreCase("factory_pattern.Phone"))
            return new Phone();
        else if (computer.equalsIgnoreCase("factory_pattern.SmartTV"))
            return new SmartTV();
        return null;
    }
}
