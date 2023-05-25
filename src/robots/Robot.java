package robots;

public class Robot implements RobotInterface {
    String robotType;
    public String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " type robot with " + colorOfRobot + " color");
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }
}
