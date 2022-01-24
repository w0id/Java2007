package course1.homework7;

public class MainClass {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[] {new Cat("Barsik", 25),
                new Cat("Murzik", 20),
                new Cat("Boris", 56)};
        plate.info();
        for (Cat cat: cats) {
            cat.eat(plate);
            plate.info();
        }
    }

}
