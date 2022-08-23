package Creational_patterns.AbestractFactory;

//factory pattern
public class PhoneAbestract implements ComputerAbestract {
    @Override
    public void compute() {
        System.out.println("Phone");
    }
}
