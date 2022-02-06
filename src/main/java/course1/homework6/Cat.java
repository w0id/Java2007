package course1.homework6;

public class Cat extends Animal{

    private boolean canSwim = false;
    private int maxRunDistance = 200;

    public Cat(String name) {
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
