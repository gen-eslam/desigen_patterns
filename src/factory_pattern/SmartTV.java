package factory_pattern;

// factory pattern
public class SmartTV implements Computer {
    @Override
    public void compute() {
        System.out.println("factory_pattern.SmartTV computes");
    }
}
