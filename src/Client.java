import factory.RobotFactory;
import robots.RobotInterface;

public class Client {
    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");

        RobotInterface shape = robotFactory.getRobotFromFactory("small");
        shape.print();

        //Here we are trying to get the objects additional 2 times.
        // Note that from now onward we do not need to create additional small robots as we have already created
        for(int i = 0; i < 2; i++) {
            shape = robotFactory.getRobotFromFactory("small");
            shape.print();
        }

        int numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot Objects Created Till Now: " + numOfDistinctRobots);

        //Here we are trying to get the objects 5 times.
        // Note that the second time onward we do not need to create additional large robots
        // as we have already created this category in the first attempt (at i = 0)
        for(int i = 0; i < 5; i++) {
            shape = robotFactory.getRobotFromFactory("large");
            shape.print();
        }

        numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\nFinally number of Distinct Robot Objects Created: " + numOfDistinctRobots);
    }
}
