package course1.lesson6;

public class Car extends Transport{

    protected String model;
    protected int year;

    public Car(String model, int year) {
        this.model = model;
        System.out.println("this is a car constructor");
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    void printName() {
        System.out.println("This is a car");
    }

    @Override
    public void wroomWroom() {
        System.out.println("Wroooom");
    }

    @Override
    public String toString() {
        return model + " " + year;
    }

}

