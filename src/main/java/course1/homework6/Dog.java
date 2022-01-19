package course1.homework6;

public class Dog extends Animal {

    protected int maxRunDistance = 500;
    protected int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public boolean isCanRun() {
        return canRun;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }
}
