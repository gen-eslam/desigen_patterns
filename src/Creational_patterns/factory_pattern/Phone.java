package Creational_patterns.factory_pattern;

//factory pattern
public class Phone implements Computer {
    @Override
    public void compute() {
        System.out.println("Phone computes");
    }
}
