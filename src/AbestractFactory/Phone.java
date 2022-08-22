package AbestractFactory;

import factory_pattern.Computer;

//factory pattern
public class Phone implements Computer {
    @Override
    public void compute() {
        System.out.println("factory_pattern.Phone computes");
    }
}
