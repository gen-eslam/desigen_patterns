package AbestractFactory;

import factory_pattern.Computer;

//factory pattern
public class PhoneAbestract implements ComputerAbestract {
    @Override
    public void compute() {
        System.out.println("Phone");
    }
}
