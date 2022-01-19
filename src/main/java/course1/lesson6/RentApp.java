package course1.lesson6;

import java.lang.invoke.VarHandle;
import java.sql.Array;
import java.util.Arrays;

public class RentApp {

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2012);
        System.out.println();
        Car van = new Van("Ford", 2010, 7);
        String model = van.getModel();
//        System.out.println(model);
        Car cabrio = new Cabrio("Peugeot", 2015, true);

        Car[] cars = {car, cabrio, van};

        for ( Car c : cars) {
            System.out.println(c.getModel());
        }

        System.out.println("Only vans");

        for (Car c : cars) {
            if (c instanceof Van) {
                System.out.println("This is van " + c.getModel());
                System.out.println(((Van) c).getSeats());
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        Transport[] transports = {car, cabrio, van};

        for (Transport transport : transports) {
            transport.printName();
            System.out.println(transport);
        }
        System.out.println(Arrays.toString(transports));
    }
}
