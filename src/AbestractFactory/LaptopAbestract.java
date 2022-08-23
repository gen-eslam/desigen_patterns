package AbestractFactory;

import factory_pattern.Computer;

//factory pattern
public class LaptopAbestract implements ComputerAbestract {
    @Override
    public void compute() {
        System.out.println("Laptop");

    }
}
