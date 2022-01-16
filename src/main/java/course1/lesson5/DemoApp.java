package course1.lesson5;

public class DemoApp {

    public static void main(String[] args) {
        Car car = new Car("Dodge", 2020);
        car.info();
        car.printModel();

        Robot[] robots = new Robot[10];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot("Robot"+i, i+10);
        }

        for (Robot robot: robots) {
            robot.info();
        }
    }
}
