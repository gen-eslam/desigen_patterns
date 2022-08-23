package AbestractFactory;

public class main1 {
    public static void main(String []arg){
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
        ComputerAbestract computer1 =abstractFactory.getComputer1("SmartTv");
        computer1.compute();

    }
}
