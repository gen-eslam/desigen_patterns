import factory_pattern.Computer;
import factory_pattern.ComputerFactory;

public class main {
    public static void main(String[] arg) {
        BuilderPattern builderPattern = new BuilderPattern.Builder(1L)
                .withName("fares")
                .withAddress("oxford")
                .withBudget(180L)
                .withDiscountRate(2L).build();
        System.out.println(builderPattern.getName());
        //factory pattern
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer = computerFactory.getComputer("factory_pattern.Laptop");
        computer.compute();
        Computer computer2 = computerFactory.getComputer("phone");
        computer2.compute();
        Computer computer3 = computerFactory.getComputer("factory_pattern.SmartTV");
        computer3.compute();
    }

}
