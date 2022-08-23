package Creational_patterns.AbestractFactory;


public class PortableComputer extends AbstractFactory {

    @Override
    public ComputerAbestract getComputer1(String computerType) {
        if(computerType.equalsIgnoreCase("Laptop"))
            return new LaptopAbestract();
        else if(computerType.equalsIgnoreCase("Phone"))
            return new PhoneAbestract();
        else if (computerType.equalsIgnoreCase("SmartTV"))
            return new SmartTVAbestract();
        return null;
    }
}
