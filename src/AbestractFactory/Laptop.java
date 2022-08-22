package AbestractFactory;

import factory_pattern.Computer;

//factory pattern
public class Laptop implements Computer {
    @Override
    public void compute() {
        System.out.println("Laptop computes");

    }
}
