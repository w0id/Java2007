package course1.homework7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        }
        return false;
    }

    public void fillPlate(int amount) {
        this.food += amount;
    }

    @Override
    public String toString() {
        return "plate: " + food + "ед.";
    }

    public void info() {
        System.out.println(this);
    }

    public int getFood() {
        return food;
    }
}
