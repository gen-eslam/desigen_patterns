package Behavioral_Patterns.visitor_pattern;

public class VehiclePartShowVisitor implements VechiclePartVisitor {

    @Override
    public void visit(VehiclePart vehiclePart) {
        System.out.println("Displaying " + vehiclePart.getClass().getName());
    }
}
