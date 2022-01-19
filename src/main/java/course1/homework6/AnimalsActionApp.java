package course1.homework6;

import java.util.ArrayList;
import java.util.List;

public class AnimalsActionApp {

    public static void main(String[] args) {
        int dogsCount = 0;
        int catsCount = 0;
        int total = 0;
        List<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(new Dog("Бобик"));
        listAnimals.add(new Dog("Палкан"));
        listAnimals.add(new Cat("Мурзик"));
        listAnimals.add(new Cat("Борис"));
        listAnimals.add(new Cat("Барсик"));
        Animal[] animals = listAnimals.toArray(new Animal[0]);

        for (Animal c : animals) {
            if (c instanceof Dog) {
                dogsCount++;
            } else if (c instanceof Cat) {
                catsCount++;
            }
        }

        System.out.println("Собак стартануло: " + dogsCount);
        System.out.println("Кошек стартануло: " + catsCount);
        System.out.println("Всего животных стартануло: " + (dogsCount + catsCount));
        System.out.println();

        animals[0].run(300);
        animals[0].run(600);
        System.out.println();
        animals[1].run(450);
        animals[1].swim(9);
        animals[1].swim(15);
        System.out.println();
        animals[2].run(150);
        animals[2].run(210);
        System.out.println();
        animals[3].run(180);
        animals[3].swim(10);
        System.out.println();
        animals[4].run(5);
    }
}
