package factory;

import robots.Robot;
import robots.RobotInterface;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface robotCategory = null;
        if(shapes.containsKey(robotType)) {
            robotCategory = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "king":
                    System.out.println("We do not have a King Robot. So we are creating a King Robot.");
                    robotCategory = new Robot("king");
                    shapes.put("king", robotCategory);
                    break;
                case "queen":
                    System.out.println("We do not have a Queen Robot. So we are creating a Queen Robot.");
                    robotCategory = new Robot("queen");
                    shapes.put("queen", robotCategory);
                    break;
                default:
                    throw new Exception("Robot Factory can create only king and queen robots.");
            }
        }
        return robotCategory;
    }
}
