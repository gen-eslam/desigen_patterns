package Behavioral_Patterns.template_method_pattern;

public class App {
    public static void main(String[] args) {
        AbstractComputer computer = new TowerComputer();
        computer.buildComputer();

        System.out.println("==================");

        computer = new QuantumComputer();
        computer.buildComputer();
    }
}
