package Creational_patterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        List<String> features = new ArrayList<>();
        features.add("Start up");
        features.add("Perform Task");
        features.add("Shut down");
        Components components = new Components();
        components.setName("Infrared Goggles");
        components.setFunctionality("Read temperature of objects");

        Robot robot = new Robot(1, features, components);
        Robot anotherRobot = robot.clone();
        Robot anotherRobot2 = robot.deapClone();

        System.out.println(robot.getID());
        System.out.println(robot.getComponents());
        System.out.println(robot.getFeatures());

        System.out.println(anotherRobot.getID());
        System.out.println(anotherRobot.getComponents());
        System.out.println(anotherRobot.getFeatures());


        System.out.println(anotherRobot2.getID());
        System.out.println(anotherRobot2.getComponents());
        System.out.println(anotherRobot2.getFeatures());

    }
}
