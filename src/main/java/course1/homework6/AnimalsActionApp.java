package course1.homework6;

import java.util.List;

public class AnimalsActionApp {

    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Dog dogPalkan = new Dog("Палкан");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBoris = new Cat("Борис");
        dogBobik.run(300);
        dogBobik.run(600);
        System.out.println();
        dogPalkan.run(450);
        dogPalkan.swim(9);
        dogPalkan.swim(15);
        System.out.println();
        catMurzik.run(150);
        catMurzik.run(210);
        System.out.println();
        catBoris.run(180);
        catBoris.swim(10);
    }
}
