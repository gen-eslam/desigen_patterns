package Creational_patterns.AbestractFactory;


//factory Pattern
public class ComputerFactory extends AbstractFactory {
    public ComputerAbestract getComputer1(String computer){
        if(computer.equalsIgnoreCase("Laptop"))
            return new LaptopAbestract();
        else if(computer.equalsIgnoreCase("Phone"))
            return new PhoneAbestract();
        else if (computer.equalsIgnoreCase("SmartTV"))
            return new SmartTVAbestract();
        return null;
    }
}
