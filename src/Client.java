import factory.RobotFactory;
import robots.Robot;
import robots.RobotInterface;

import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");

        Robot shape;


        //Here we are trying to get 3 king type robots
        for(int i = 0; i < 2; i++) {
            shape = (Robot) robotFactory.getRobotFromFactory("king");
            shape.setColor(getRandomColor());
            shape.print();
        }

        //Here we are trying to get 3 queen type robots
        for(int i = 0; i < 2; i++) {
            shape = (Robot) robotFactory.getRobotFromFactory("queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\nFinally number of distinct robot objects created: " + numOfDistinctRobots);

    }

    private static String getRandomColor() {
        Random r = new Random();

        int random = r.nextInt(20);

        if(random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
