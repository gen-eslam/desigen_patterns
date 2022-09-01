package Behavioral_Patterns.visitor_pattern;

public interface VehiclePart {
    void accept(VechiclePartVisitor vechiclePartVisitor);
}
