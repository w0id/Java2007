package course1.homework6;

public class Animal {
    protected String name;
    protected boolean canRun = true;
    protected boolean canSwim = true;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public boolean isCanRun() {
        return canRun;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    void run(int distance) {
        if (distance > 0) {
            if (isCanRun()) {
                if (distance < getMaxRunDistance()) {
                    System.out.println(getName() + " пробежал " + distance + " метров");
                } else {
                    System.out.println(getName() + " пробежал " + getMaxRunDistance() + " метров и сдох от изнеможения");
                }
            }
        } else {
            System.out.println("Серьезно??? " + getName() + " пробежал " + distance + " метров????? О_о Так не бывает!");
        }
    }

    void swim(int distance) {
        if (distance > 0) {
            if (isCanSwim()) {
                if (distance < getMaxSwimDistance()) {
                    System.out.println(getName() + " проплыл " + distance + " метров");
                } else {
                    System.out.println(getName() + " проплыл " + getMaxSwimDistance() + " метров и плавно пошел ко дну");
                }
            } else {
                System.out.println(getName() + " с разгону нырнул в воду, но так как плавать не умел, теперь он кормит рыб");
            }
        } else {
            System.out.println("Серьезно??? " + getName() + " проплыл " + distance + " метров????? О_о Так не бывает!");
        }
    }
}
