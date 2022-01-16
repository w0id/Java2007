package course1.lesson5;

import javax.sound.midi.Soundbank;

public class Car {

    public static int wheelsnumber;

    //Fields
    private String model;
    private String modelFull;
    private int year;
    private boolean wasCrashed;


    //constructor

    public Car(String model, int year, boolean wasCrashed) {
        this.model = model;
        this.year = year;
        this.wasCrashed = wasCrashed;
    }

    public Car(String model, int year) {
        this(model, year, false);
    }

    /**
     * Выводит на экран информацию о машине
     */
    public void info() {
        System.out.println("model = " + model + " year = " + year + " wasCrashed = " + wasCrashed);
    }

    public void printModel() {
        System.out.println(model);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isWasCrashed() {
        return wasCrashed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Error");
        }
    }

    public void setWasCrashed(boolean wasCrashed) {
        this.wasCrashed = wasCrashed;
    }

    public void crash() {
        System.out.println("Car was crashed");
        wasCrashed = true;
    }

    public void repaired() {
        if (wasCrashed) {
            wasCrashed = false;
            System.out.println("Car was repaired");
        } else {
            System.out.println("Nothing to repair");
        }
    }
}
