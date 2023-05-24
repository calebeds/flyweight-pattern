package factory;

import robots.LargeRobot;
import robots.RobotInterface;
import robots.SmallRobot;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public RobotInterface getRobotFromFactory(String robotCategoryName) throws Exception {
        RobotInterface robotCategory = null;
        if(shapes.containsKey(robotCategoryName)) {
            robotCategory = shapes.get(robotCategoryName);
        } else {
            switch (robotCategoryName) {
                case "small":
                    System.out.println("We do not have Small Robot. So we are creating a Small Robot.");
                    robotCategory = new SmallRobot();
                    shapes.put("small", robotCategory);
                    break;
                case "large":
                    System.out.println("We do not have Large Robot. So we are creating a Large Robot.");
                    robotCategory = new LargeRobot();
                    shapes.put("large", robotCategory);
                    break;
                default:
                    throw new Exception("Robot Factory can create only small and large shapes");
            }
        }
        return robotCategory;
    }
}
