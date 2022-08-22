package factory_pattern;

//factory Pattern
public class ComputerFactory {
    public  Computer getComputer(String computer){
        if(computer.equalsIgnoreCase("factory_pattern.Laptop"))
            return new Laptop();
        else if(computer.equalsIgnoreCase("factory_pattern.Phone"))
            return new Phone();
        else if (computer.equalsIgnoreCase("factory_pattern.SmartTV"))
            return new SmartTV();
        return null;
    }
}
