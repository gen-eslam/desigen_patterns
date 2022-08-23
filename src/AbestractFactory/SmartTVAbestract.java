package AbestractFactory;

import factory_pattern.Computer;

// factory pattern
public class SmartTVAbestract implements ComputerAbestract {
    @Override
    public void compute() {
        System.out.println("SmartTV");
    }
}
