package Behavioral_Patterns.visitor_pattern;

public class Engine implements VehiclePart {
    @Override
    public void accept(VechiclePartVisitor vechiclePartVisitor) {
        vechiclePartVisitor.visit(this);
    }
}