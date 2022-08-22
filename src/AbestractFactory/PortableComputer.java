package AbestractFactory;


import factory_pattern.Computer;

public class PortableComputer extends AbstractFactory {

    @Override
    Computer getComputer(String computerType) {
        if(computerType.equalsIgnoreCase("Laptop"))
            return new Laptop();
        else if(computerType.equalsIgnoreCase("Phone"))
            return new Phone();
        else if (computerType.equalsIgnoreCase("SmartTV"))
            return new SmartTV();
        return null;
    }
}
